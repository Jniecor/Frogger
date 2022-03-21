package es.julionieto.frogger;

import static es.julionieto.frogger.Nenufares.rectNenufar;
import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Shape;

public class Agua extends Group{
    
    static int[] arrayAgua = new int[12];
    static Rectangle rectAgua[] = new Rectangle[12];
    
    public Agua(Nenufares nenufares, Troncos troncos){
    
        for (int i  = 0; i<12; i++){
            
            rectAgua[i] = new Rectangle(155, 28, Color.BLUE);
            rectAgua[i].setX(nenufares.arrayNenufares[i]+60);
            
        }
        
        //Bucle para mostrar los primeros 9 nenúfares con la misma "Y"
        for(int i=0; i<4; i++) {
            rectAgua[i].setY(nenufares.POSICION_FILA_1_NENUFARES);
        }
        
        //Bucle para mostrar los nenufares 10-19 con la misma "Y"
        for(int i=4; i<9; i++) {
            rectAgua[i].setY(nenufares.POSICION_FILA_2_NENUFARES);
        }
        
        //Mostrar los ultimos 10 nenúfares con la misma "Y"
        for(int i=9; i<12; i++) {
            rectAgua[i].setY(nenufares.POSICION_FILA_3_NENUFARES);
        }
        
        for(int i=0; i<12; i++){
            this.getChildren().add(rectAgua[i]);
            rectAgua[i].setVisible(true);
        }
    
    }
    
    public void colisionAgua(Frogger frogger, Rana rana){
        
        for (int i=0; i<12; i++){
                Shape zonaColision = Shape.intersect(rectNenufar[i], rana.rectJugador);
                boolean colisionVaciaCoches = zonaColision.getBoundsInLocal().isEmpty();
                if (colisionVaciaCoches == false){
                    rana.posXPer = rana.POS_MEDX_RANA;
                    rana.posXPer = rana.POS_MEDY_RANA;
                    rana.setLayoutX(rana.posXPer);
                    rana.setLayoutX(rana.posXPer);
                } 
            }
    
//        frogger.comprobarColisionNenufares();
        
    }
}
