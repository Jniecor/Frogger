package es.julionieto.frogger;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;



public class App extends Application {

    Frogger frogger = new Frogger();
    Rana rana = new Rana();
    Coches coches = new Coches();
    Troncos troncos = new Troncos();
    Nenufares nenufares = new Nenufares();
    Movimiento movimiento = new Movimiento(frogger,rana,coches,troncos,nenufares);
        
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
        
        //Se añaden las diferentes clases/métodos a la escena/consola        
        rootPane.getChildren().add(rana);
        rootPane.getChildren().add(coches);
        rootPane.getChildren().add(troncos);
        rootPane.getChildren().add(nenufares);
        rootPane.getChildren().add(movimiento);

        scene.setOnKeyPressed((KeyEvent event) -> {
            switch(event.getCode()) {
                case UP:
                    rana.posYPer -= 36;
                    frogger.posY -= 1;
                    break;
                case DOWN:
                    rana.posYPer += 36;
                    frogger.posY += 1;
                    break;
                case LEFT:
                    rana.posXPer -= 10;
                    frogger.posX -= 1;
                    break;
                case RIGHT:
                    rana.posXPer += 10;
                    frogger.posX += 1;
                    break;
            }
        });

        scene.setOnKeyReleased((KeyEvent event) -> {
            rana.posYPer = rana.posYPer;
            rana.posXPer = rana.posXPer;
        });        

    }
    
//    public void movimientoJugador(){
//    
//        System.out.println(Rana.posXPer);
////        Movimiento de la rana
//        
//        
//    }
    
    public static void main(String[] args) {
        launch();
    }

}