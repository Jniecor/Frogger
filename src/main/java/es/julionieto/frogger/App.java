package es.julionieto.frogger;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;



public class App extends Application {

    @Override
    public void start(Stage stage) {
        
        
        short tamXPantalla = 800;
        short tamYPantalla = 600;
        
        short movimiento = 0;
        
        
        Pane rootPane = new Pane ();
        var scene = new Scene(rootPane, tamXPantalla, tamYPantalla);
        stage.setScene(scene);
        stage.show();
               
        Frogger frogger = new Frogger();
        Rana rana = new Rana();
        rootPane.getChildren().add(rana);
        frogger.colocacionJugador();
        while (movimiento < 5){
            frogger.colocacionObstaculos();            
            frogger.mostrarTableroConsola();
            frogger.movimientoObstaculos();
            frogger.mostrarTableroConsola();
            movimiento++;
        }

    }

    public static void main(String[] args) {
        launch();
    }

}