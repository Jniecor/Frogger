package es.julionieto.frogger;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;



public class App extends Application {

    Rana rana = new Rana();
    Coches coches = new Coches();
    Troncos troncos = new Troncos();
    Nenufares nenufares = new Nenufares();
    Frogger frogger = new Frogger();
    Metas metas = new Metas();
//    Agua agua = new Agua(nenufares, troncos);
    ParedFinal paredFinal = new ParedFinal();                         /*agua*/
    Movimiento movimiento = new Movimiento(rana,coches,troncos,nenufares, frogger, metas, paredFinal);
        
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
        Image img = new Image(getClass().getResourceAsStream("/images/Background.2.png"));
        ImageView imgView = new ImageView(img);
        rootPane.getChildren().add(imgView);
        
        //Se añaden las diferentes clases/métodos a la escena/consola
        rootPane.getChildren().add(rana);        
        rootPane.getChildren().add(rana.rectJugador);
        rootPane.getChildren().add(coches);
        rootPane.getChildren().add(troncos);
        rootPane.getChildren().add(nenufares);
        rootPane.getChildren().add(metas);
//        rootPane.getChildren().add(agua);
        rootPane.getChildren().add(paredFinal);
        rootPane.getChildren().add(movimiento);
        
        //Movimiento de la rana mediante las teclas
        scene.setOnKeyPressed((KeyEvent event) -> {
            switch(event.getCode()) {
                case UP:
                    rana.posYPer -= 37;
//                    frogger.posY -= 1;
                    break;
                case DOWN:
                    rana.posYPer += 37;
//                    frogger.posY += 1;
                    break;
                case LEFT:
                    rana.posXPer -= 42;
//                    frogger.posX -= 1;
                    break;
                case RIGHT:
                    rana.posXPer += 42;
//                    frogger.posX += 1;
                    break;
            }
        });

        scene.setOnKeyReleased((KeyEvent event) -> {
            rana.posYPer = rana.posYPer;
            rana.posXPer = rana.posXPer;
        });        

    }
    
    public static void main(String[] args) {
        launch();
    }

}