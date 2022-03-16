package es.julionieto.frogger;

import javafx.scene.Group;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class Nenufares extends Group{
    
    static int[] arrayNenufares = new int[30];
    static Rectangle rectNenufar[] = new Rectangle[30];
    
    //Array de las imagenes de los nenúfares
    static ImageView nenufarView[] = new ImageView[30];
    
    //Velocidad nenufares
    static int velNenufar = 2;
    
    public Nenufares(){
        
        //Única imagen del nenufar
        Image nenufar = new Image(getClass().getResourceAsStream("/images/Nenufar.png"));
        //Fila 1 (Abajo)
        final double POSICION_FILA_1_NENUFARES = 273.5;
        arrayNenufares[0] = -5;
        arrayNenufares[1] = -35;
        arrayNenufares[2] = 165;
        arrayNenufares[3] = 195;
        for (int i = 4; i < 9; i+=2){
            arrayNenufares[i] = arrayNenufares[i-2]+200;
        }

        for (int i = 5; i < 10; i+=2){
            arrayNenufares[i] = arrayNenufares[i-2]+200;
        }
        
        for (int i = 0; i < 30; i++) {
            nenufarView[i] = new ImageView(nenufar);
        }   
        
        //Fila 2 (Medio)   
        final double POSICION_FILA_2_NENUFARES = 201.5;
        
        arrayNenufares[10] = -5;
        arrayNenufares[11] = -35;
        arrayNenufares[12] = 165;
        arrayNenufares[13] = 195;
        for (int i = 14; i < 19; i+=2){
            arrayNenufares[i] = arrayNenufares[i-2]+200;
        }
        
        for (int i = 15; i < 20; i+=2){
            arrayNenufares[i] = arrayNenufares[i-2]+200;
        }
        
        //Fila 3 (Arriba)
        final double POSICION_FILA_3_NENUFARES = 129.5;
        
        arrayNenufares[20] = -5;
        arrayNenufares[21] = -35;
        arrayNenufares[22] = 165;
        arrayNenufares[23] = 195;
        for (int i = 24; i < 29; i+=2){
            arrayNenufares[i] = arrayNenufares[i-2]+200;
        }
        
        for (int i = 25; i < 30; i+=2){
            arrayNenufares[i] = arrayNenufares[i-2]+200;
        }
        
        
        //Bucle para posicionar las imágenes
        for (int i = 0; i <30; i++){
            nenufarView[i].setX(arrayNenufares[i]);
            rectNenufar[i] = new Rectangle(32, 32, Color.GREEN);
            rectNenufar[i].setX(arrayNenufares[i]);
        }
        
        //Bucle para mostrar los primeros 9 nenúfares con la misma "Y"
        for(int i=0; i<10; i++) {
            nenufarView[i].setY(POSICION_FILA_1_NENUFARES);
            rectNenufar[i].setY(POSICION_FILA_1_NENUFARES);
        }
        
        //Bucle para mostrar los nenufares 10-19 con la misma "Y"
        for(int i=10; i<20; i++) {
            nenufarView[i].setY(POSICION_FILA_2_NENUFARES);
            rectNenufar[i].setY(POSICION_FILA_2_NENUFARES);
        }
        
        //Mostrar los ultimos 10 nenúfares con la misma "Y"
        for(int i=20; i<30; i++) {
            nenufarView[i].setY(POSICION_FILA_3_NENUFARES);
            rectNenufar[i].setY(POSICION_FILA_3_NENUFARES);
        }
        
        for(int i=0; i<30; i++){
            this.getChildren().add(nenufarView[i]);
            this.getChildren().add(rectNenufar[i]);
            rectNenufar[i].setVisible(false);
        }
    }
    
}
