package es.julionieto.frogger;

import static es.julionieto.frogger.Nenufares.rectNenufar;
import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Shape;

public class ParedFinal extends Group{
    
    static int[] arrayPared = new int[5];
    static Rectangle rectPared[] = new Rectangle[5];
    static int posicionPared = 0;
    static final int POSICION_PARED_FINAL = 90;    

    public ParedFinal(){
    
        rectPared[0] = new Rectangle(130, 28, Color.BLUE);
        rectPared[0].setX(posicionPared);
        posicionPared += 180;
        

        for (int i = 1; i<3; i++){
            
            rectPared[i] = new Rectangle(110, 28, Color.BLUE);
            rectPared[i].setX(posicionPared);
            posicionPared += 175;
        }
        
        rectPared[3] = new Rectangle(110, 28, Color.BLUE);
        rectPared[3].setX(posicionPared-10);
        posicionPared += 180;
        rectPared[4] = new Rectangle(110, 28, Color.BLUE);
        rectPared[4].setX(posicionPared-10);
        
        //Bucle para la misma "Y"
        for(int i=0; i<5; i++) {
            rectPared[i].setY(POSICION_PARED_FINAL);
        }

        for(int i=0; i<5; i++) {
            this.getChildren().add(rectPared[i]);
            rectPared[i].setVisible(false);
        }
        
    }
    
    public void colisionPared(Frogger frogger, Rana rana){
        
        for (int i=0; i<5; i++){
                Shape zonaColision = Shape.intersect(rectPared[i], rana.rectJugador);
                boolean colisionVaciaPared = zonaColision.getBoundsInLocal().isEmpty();
                if (colisionVaciaPared == false){
                    rana.posXPer = rana.POS_MEDX_RANA;
                    rana.posYPer = rana.POS_MEDY_RANA;
                    rana.setLayoutX(rana.posXPer);
                    rana.setLayoutX(rana.posXPer);
                } 
            }
    
//        frogger.comprobarColisionNenufares();
        
    }
}
