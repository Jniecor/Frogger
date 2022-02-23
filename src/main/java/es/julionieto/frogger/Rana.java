package es.julionieto.frogger;

import java.util.Random;
import javafx.scene.input.KeyEvent;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class Rana extends Rectangle{
    
    public Rana(){
        
        Random random = new Random();
        
        final int POS_INIY_RANA = 570;
        int posY = POS_INIY_RANA;
        int posX = random.nextInt(600);
        
        this.setWidth(10);
        this.setHeight(10);
        this.setFill(Color.LIGHTGREEN);
        this.setX(posX);
        this.setY(posY);
    }
    
}
