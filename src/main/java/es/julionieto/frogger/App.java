package es.julionieto.frogger;

import javafx.application.Application;
import javafx.scene.Scene;
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
        
        //Se añaden las diferentes clases a la escena/consola
        Frogger frogger = new Frogger();
        Rana rana = new Rana();
        rootPane.getChildren().add(rana);
        frogger.colocacionJugador();
        frogger.colocacionObstaculos();
        frogger.comprobarColisionCoches();
        frogger.comprobarColisionAgua();
        frogger.comprobarColisionNenufares();
        frogger.comprobarColisionTroncos();
        frogger.comprobarColisionNenufares();
        frogger.comprobarColisionParedFinal();
        frogger.comprobarColisionNenufares();
        frogger.comprobarColisionMetas();
        frogger.comprobarColisionMetas();
        frogger.mostrarTableroConsola();        

    }

    public static void main(String[] args) {
        launch();
    }

}