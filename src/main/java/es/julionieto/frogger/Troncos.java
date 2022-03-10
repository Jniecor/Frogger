package es.julionieto.frogger;

import javafx.scene.Group;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Troncos extends Group{
    
    int ArrayTroncos[] = new int[10];
    
    public Troncos(){
        
        //Unica imagen del tronco
        Image tronco = new Image(getClass().getResourceAsStream("/images/tronco_.jpg"));
        
        //Array de las imágenes de los troncos
        ImageView troncoView[] = new ImageView[11];
        
        //Fila 1 (abajo)
        final double POSICION_FILA_1_TRONCOS = 237.5; // Y
        ArrayTroncos[0] = 50; // X
        
        //Bucle para almacenar la X de los diferentes troncos
        for (int i = 1; i < 6; i++){
            ArrayTroncos[i] = ArrayTroncos[i-1]+200; // X
        }
        
        //Bucle para las imágenes de los troncos
        for (int i = 0; i < 10; i++) {
            troncoView[i] = new ImageView(tronco);
        }        
        
        //Bucle para posicionar las imágenes
        for (int i = 0; i <5; i++){
            troncoView[i].setX(ArrayTroncos[i]);
        }
        
        //Bucle para los primeros 5 troncos para que tengan la misma "Y"
        // y aparezcan en pantalla
        for(int i=0; i<5; i++) {
            troncoView[i].setY(POSICION_FILA_1_TRONCOS);
        }
        
        //Fila 2 (Arriba)
        final double POSICION_FILA_2_TRONCOS = 165.5; // Y
        ArrayTroncos[5] = 50; // X
        
        //Bucle para almacenar la X de los diferentes troncos
        for (int i = 6; i < 10; i++){
            ArrayTroncos[i] = ArrayTroncos[i-1]+200;// X
        }

        //Bucle para posicionar las imágenes
        for (int i = 5; i <10; i++){
            troncoView[i].setX(ArrayTroncos[i]);
        }
        
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
