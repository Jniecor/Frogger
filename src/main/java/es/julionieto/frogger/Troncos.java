package es.julionieto.frogger;

import javafx.scene.Group;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Troncos extends Group{
    
    //Fila 1 (abajo)
    static int posicionTronco0 = 50;
    static int posicionTronco1 = 250;
    static int posicionTronco2 = 450;
    static int posicionTronco3 = 650;
    static int posicionTronco4 = 850;
    
    //Fila 2 (Arriba)
    static int posicionTronco5 = 150;
    static int posicionTronco6 = 350;
    static int posicionTronco7 = 550;
    static int posicionTronco8 = 750;
    static int posicionTronco9 = -50;
    
    public Troncos(){
    
        //Troncos (Río)
        //Fila 1 (Abajo)
        final double POSICION_FILA_1_TRONCOS = 237.5;

        //Fila 2 (Arriba)
        final double POSICION_FILA_2_TRONCOS = 165.5;
    
        //Unica imagen del objeto tronco
        Image tronco = new Image(getClass().getResourceAsStream("/images/tronco_.jpg"));
        
        //Array de los troncos
        ImageView troncoView[] = new ImageView[11];
        
        //Primera fila
        troncoView[0] = new ImageView(tronco);
        troncoView[0].setX(posicionTronco0);
        
        troncoView[1] = new ImageView(tronco);
        troncoView[1].setX(posicionTronco1);
        
        troncoView[2] = new ImageView(tronco);
        troncoView[2].setX(posicionTronco2);
        
        troncoView[3] = new ImageView(tronco);
        troncoView[3].setX(posicionTronco3);
        
        //POSICIÓN FINAL DESPUES TELETRANSPORTAR A -150
        troncoView[4] = new ImageView(tronco);
        troncoView[4].setX(posicionTronco4);
        
        //Bucle para los primeros 5 troncos para que tengan la misma "Y"
        // y aparezcan en pantalla
        for(int i=0; i<5; i++) {
            troncoView[i].setY(POSICION_FILA_1_TRONCOS);
        }
        
        //Segunda fila
        troncoView[5] = new ImageView(tronco);
        troncoView[5].setX(posicionTronco5);
        
        troncoView[6] = new ImageView(tronco);
        troncoView[6].setX(posicionTronco6);
        
        troncoView[7] = new ImageView(tronco);
        troncoView[7].setX(posicionTronco7);
        
        troncoView[8] = new ImageView(tronco);
        troncoView[8].setX(posicionTronco8);
        
        troncoView[9] = new ImageView(tronco);
        troncoView[9].setX(-posicionTronco9);
        
        //Bucle para los ultimos 5 troncos para que tengan la misma "Y"
        // y aparezcan en pantalla
        for(int i=5; i<10; i++) {
            troncoView[i].setY(POSICION_FILA_2_TRONCOS);
        }
        
        for(int i=0; i<10; i++){
            this.getChildren().add(troncoView[i]);
        }
    
    }
    
}
