package es.julionieto.frogger;

import java.util.Random;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class Rana extends Rectangle{
    
    public Rana(){
        
        final int POS_INIY_RANA = 570;
        
        Random random = new Random();
        this.setWidth(10);
        this.setHeight(10);
        this.setFill(Color.LIGHTGREEN);
        this.setX(random.nextInt(600));
        this.setY(POS_INIY_RANA);
    }
    
}
