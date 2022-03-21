package es.julionieto.frogger;

import javafx.scene.Group;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Shape;

public class Troncos extends Group{
    
    static int[] arrayTroncos = new int[10];
    static Rectangle rectTronco[] = new Rectangle[10];
    
    //Fila 1 (abajo)
    static final double POSICION_FILA_1_TRONCOS = 237.5; // Y
    
    //Fila 2 (Arriba)
    static final double POSICION_FILA_2_TRONCOS = 165.5; // Y
    
    //Unica imagen del tronco
    Image tronco = new Image(getClass().getResourceAsStream("/images/tronco_.jpg"));
        
    //Array de las imágenes de los troncos
    static ImageView troncoView[] = new ImageView[10];
    
    //Velocidad troncos
    static int velTronco = 1;
    
    public Troncos(){

        //Fila 1 (abajo)
        arrayTroncos[0] = 50; // X
        
        //Bucle para almacenar la X de los diferentes troncos
        for (int i = 1; i < 6; i++){
            arrayTroncos[i] = arrayTroncos[i-1]+200; // X
        }
        
        //Bucle para las imágenes de los troncos
        for (int i = 0; i < 10; i++) {
            troncoView[i] = new ImageView(tronco);
        }        
        
        //Bucle para posicionar las imágenes
        for (int i = 0; i <5; i++){
            troncoView[i].setX(arrayTroncos[i]);
            rectTronco[i] = new Rectangle(88, 31, Color.RED);
            rectTronco[i].setX(arrayTroncos[i]-1);
        }
        
        //Bucle para los primeros 5 troncos para que tengan la misma "Y"
        // y aparezcan en pantalla
        for(int i=0; i<5; i++) {
            troncoView[i].setY(POSICION_FILA_1_TRONCOS);
            rectTronco[i].setY(POSICION_FILA_1_TRONCOS-1);
        }
        
        //Fila 2 (Arriba)
        arrayTroncos[5] = 50; // X
        
        //Bucle para almacenar la X de los diferentes troncos
        for (int i = 6; i < 10; i++){
            arrayTroncos[i] = arrayTroncos[i-1]+200;// X
        }

        //Bucle para posicionar las imágenes
        for (int i = 5; i <10; i++){
            troncoView[i].setX(arrayTroncos[i]);
            rectTronco[i] = new Rectangle(92, 35, Color.RED);
            rectTronco[i].setX(arrayTroncos[i]-1);
        }
        
        //Bucle para los ultimos 5 troncos para que tengan la misma "Y"
        // y aparezcan en pantalla
        for(int i=5; i<10; i++) {
            troncoView[i].setY(POSICION_FILA_2_TRONCOS);
            rectTronco[i].setY(POSICION_FILA_2_TRONCOS-1);
        }
        
        for(int i=0; i<10; i++){
            this.getChildren().add(troncoView[i]);
            this.getChildren().add(rectTronco[i]);
            rectTronco[i].setVisible(false);
        }
    
    }
    
    public void colisionTroncos(Frogger frogger, Rana rana){
        
        for (int i=0; i<10; i++){
                Shape zonaColision = Shape.intersect(rectTronco[i], rana.rectJugador);
                boolean colisionVaciaTroncos = zonaColision.getBoundsInLocal().isEmpty();
                if (colisionVaciaTroncos == false){
                    rana.posXPer += velTronco;
                    rana.setLayoutX(rana.posXPer);
                } 
            }
    
//        frogger.comprobarColisionTroncos();
        
    }
    
}
