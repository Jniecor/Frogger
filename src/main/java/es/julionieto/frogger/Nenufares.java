package es.julionieto.frogger;

import javafx.scene.Group;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Nenufares extends Group{
    
    int ArrayNenufares[] = new int[30];
    
    public Nenufares(){
        
        //Única imagen del nenufar
        Image nenufar = new Image(getClass().getResourceAsStream("/images/Nenufar.png"));
        
        //Array de las imagenes de los nenúfares
        ImageView nenufarView[] = new ImageView[30];
        
        //Fila 1 (Abajo)
        final double POSICION_FILA_1_NENUFARES = 273.5;
        ArrayNenufares[0] = -5;
        ArrayNenufares[1] = -35;
        ArrayNenufares[2] = 165;
        ArrayNenufares[3] = 195;
        for (int i = 4; i < 9; i+=2){
            ArrayNenufares[i] = ArrayNenufares[i-2]+200;
        }

        for (int i = 5; i < 10; i+=2){
            ArrayNenufares[i] = ArrayNenufares[i-2]+200;
        }
        
        for (int i = 0; i < 30; i++) {
            nenufarView[i] = new ImageView(nenufar);
        }   
        //Bucle para mostrar los primeros 9 nenúfares con la misma "Y"
        for(int i=0; i<10; i++) {
            nenufarView[i].setY(POSICION_FILA_1_NENUFARES);
        }
        
        //Fila 2 (Medio)   
        final double POSICION_FILA_2_NENUFARES = 201.5;
        
        ArrayNenufares[10] = -5;
        ArrayNenufares[11] = -35;
        ArrayNenufares[12] = 165;
        ArrayNenufares[13] = 195;
        for (int i = 14; i < 19; i+=2){
            ArrayNenufares[i] = ArrayNenufares[i-2]+200;
        }
        
        for (int i = 15; i < 20; i+=2){
            ArrayNenufares[i] = ArrayNenufares[i-2]+200;
        }
        
        //Bucle para mostrar los nenufares 10-19 con la misma "Y"
        for(int i=10; i<20; i++) {
            nenufarView[i].setY(POSICION_FILA_2_NENUFARES);
        }
        
        //Fila 3 (Arriba)
        final double POSICION_FILA_3_NENUFARES = 129.5;
        
        ArrayNenufares[20] = -5;
        ArrayNenufares[21] = -35;
        ArrayNenufares[22] = 165;
        ArrayNenufares[23] = 195;
        for (int i = 24; i < 29; i+=2){
            ArrayNenufares[i] = ArrayNenufares[i-2]+200;
        }
        
        for (int i = 25; i < 30; i+=2){
            ArrayNenufares[i] = ArrayNenufares[i-2]+200;
        }
        
        //Mostrar los ultimos 10 nenúfares con la misma "Y"
        for(int i=20; i<30; i++) {
            nenufarView[i].setY(POSICION_FILA_3_NENUFARES);
        }
        
        //Bucle para posicionar las imágenes
        for (int i = 0; i <30; i++){
            nenufarView[i].setX(ArrayNenufares[i]);
        }
        
        for(int i=0; i<30; i++){
            this.getChildren().add(nenufarView[i]);
        }
    }
    
}
