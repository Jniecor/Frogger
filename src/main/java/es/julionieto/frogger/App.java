package es.julionieto.frogger;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;



public class App extends Application {

    @Override
    public void start(Stage stage) {
        
        //Dimensiones de la pantalla
        short tamXPantalla = 800;
        short tamYPantalla = 600;
        
        //Se crea el panel con las dimensiones de la pantalla
        Pane rootPane = new Pane ();
        var scene = new Scene(rootPane, tamXPantalla, tamYPantalla);
        stage.setScene(scene);
        stage.show();
        
        //Imagen de fondo
        Image img = new Image(getClass().getResourceAsStream("/images/Background.png"));
        ImageView imgView = new ImageView(img);
        rootPane.getChildren().add(imgView);
        
        // Panel contenedor para los elementos animados del juego
        Pane paneScrollJuego = new Pane();
        rootPane.getChildren().add(paneScrollJuego);
        
        //Se añaden las diferentes clases a la escena/consola
        Frogger frogger = new Frogger();
        Rana rana = new Rana();
        Coches coches = new Coches();
        Troncos troncos = new Troncos();
        Nenufares nenufares = new Nenufares();
        paneScrollJuego.getChildren().add(rana);
        paneScrollJuego.getChildren().add(coches);
        paneScrollJuego.getChildren().add(troncos);
        paneScrollJuego.getChildren().add(nenufares);      
        frogger.colocacionJugador();        
        frogger.colocacionObstaculos();
//        frogger.comprobarColisionCoches();
//        frogger.comprobarColisionAgua();
//        frogger.comprobarColisionNenufares();
//        frogger.comprobarColisionTroncos();
//        frogger.comprobarColisionNenufares();
//        frogger.comprobarColisionParedFinal();
//        frogger.comprobarColisionNenufares();
//        frogger.comprobarColisionMetas();
        frogger.mostrarTableroConsola();

    }

    public static void main(String[] args) {
        launch();
    }

}