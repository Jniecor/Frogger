package es.julionieto.frogger;

import java.util.Random;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;



public class App extends Application {

    @Override
    public void start(Stage stage) {
        
        
        short tamXPantalla = 800;
        short tamYPantalla = 600;
        
        
        Pane rootPane = new Pane ();
        var scene = new Scene(rootPane, tamXPantalla, tamYPantalla);
        stage.setScene(scene);
        stage.show();
               
        Frogger frogger = new Frogger();        
        frogger.mostrarTableroConsola();
        
        Rana rana = new Rana();
        rootPane.getChildren().add(rana);
    }

    public static void main(String[] args) {
        launch();
    }

}