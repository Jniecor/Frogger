package es.julionieto.frogger;

import static es.julionieto.frogger.Nenufares.rectNenufar;
import static es.julionieto.frogger.Nenufares.velNenufar;
import javafx.scene.Group;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Shape;

public class Metas extends Group{
    
    static Rectangle rectMetas[] = new Rectangle[5];
    static ImageView metasView[] = new ImageView[5];
    static final int POSICION_FILA_METAS = 95;
    static int posicionInicial = 142;
    static int contadorMetas = 0;
    
    public Metas(){
    
        //Única imagen de la meta
        Image meta = new Image(getClass().getResourceAsStream("/images/Meta.png"));
     
        for (int i = 0; i <5; i++){

            metasView[i] = new ImageView(meta);
            metasView[i].setX(posicionInicial);
            metasView[i].setY(POSICION_FILA_METAS);
            rectMetas[i] = new Rectangle(28, 28, Color.RED);
            rectMetas[i].setX(posicionInicial);
            rectMetas[i].setY(POSICION_FILA_METAS);
            posicionInicial+=168;
        
        }
        
        for(int i=0; i<5; i++){
            this.getChildren().add(metasView[i]);
            this.getChildren().add(rectMetas[i]);
            rectMetas[i].setVisible(false);
            metasView[i].setVisible(false);
        }
        
    }
    
    public void colisionMetas(Frogger frogger, Rana rana){
        
        for (int i=0; i<5; i++){
                Shape zonaColision = Shape.intersect(rectMetas[i], rana.rectJugador);
                boolean colisionVaciaCoches = zonaColision.getBoundsInLocal().isEmpty();
                if (colisionVaciaCoches == false){
                    rana.posXPer = rana.POS_INIX_RANA;
                    rana.posYPer = rana.POS_INIY_RANA;
                    rana.setLayoutX(rana.posXPer);
                    rana.setLayoutY(rana.posYPer);
                    metasView[i].setVisible(true);
                    contadorMetas++;
                    if (contadorMetas == 4){
                    
                        metasView[i].setVisible(false);
                    
                    }
                } 
            }
    
//        frogger.comprobarColisionNenufares();
        
    }
    
}
