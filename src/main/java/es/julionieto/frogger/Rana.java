package es.julionieto.frogger;

import java.util.Random;
import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class Rana extends Group{
    
    
    static final int POS_INIX_RANA = 400;
    static final int POS_INIY_RANA = 570;
    static int posYPer = POS_INIY_RANA;
    static int posXPer = POS_INIX_RANA;
    // Rectángulo para la colision del jugador
    static Rectangle rectJugador = new Rectangle(22, 25, Color.BLUE);
    
    public Rana(){
        
        Random random = new Random();
        
        /* --- DIBUJO DEL PERSONAJE --- */        
        //Se añade la colision y se pone en invisible
        rectJugador.setX(posYPer);
        rectJugador.setY(posXPer);
        this.getChildren().add(rectJugador);
        rectJugador.setVisible(false);

        //Cabeza
        Rectangle cabeza = new Rectangle(40, 20, Color.LIGHTGREEN);
        cabeza.setX(6);
        cabeza.setY(0);
        cabeza.setWidth(10);
        cabeza.setHeight(10);
        this.getChildren().add(cabeza);
            //Ojo izquierdo
        Rectangle ojoIzq = new Rectangle(5, 5, Color.BLACK);
        ojoIzq.setX(8);
        ojoIzq.setY(2);
        ojoIzq.setWidth(2);
        ojoIzq.setHeight(2);
        this.getChildren().add(ojoIzq);
            //Ojo derecho
        Rectangle ojoDer = new Rectangle(5, 5, Color.BLACK);
        ojoDer.setX(12);
        ojoDer.setY(2);
        ojoDer.setWidth(2);
        ojoDer.setHeight(2);
        this.getChildren().add(ojoDer);
        
        //Cuerpo
        Rectangle cuerpo = new Rectangle(40, 20, Color.LIGHTGREEN);
        cuerpo.setX(3.5);
        cuerpo.setY(10);
        cuerpo.setWidth(15);
        cuerpo.setHeight(15);
        this.getChildren().add(cuerpo);
        
        //Piernas delanteras
            //Pierna delantera izquierda
        Rectangle piernaDelIzq = new Rectangle(40, 20, Color.LIGHTGREEN);
        piernaDelIzq.setX(0);
        piernaDelIzq.setY(14);
        piernaDelIzq.setWidth(4);
        piernaDelIzq.setHeight(2);
        this.getChildren().add(piernaDelIzq);
            //Pierna delantera derecha
        Rectangle piernaDelDer = new Rectangle(40, 20, Color.LIGHTGREEN);
        piernaDelDer.setX(18);
        piernaDelDer.setY(14);
        piernaDelDer.setWidth(4);
        piernaDelDer.setHeight(2);
        this.getChildren().add(piernaDelDer);
            //Pie delantero izquierdo
        Rectangle pieDelIzq = new Rectangle(40, 20, Color.LIGHTGREEN);
        pieDelIzq.setX(0);
        pieDelIzq.setY(8);
        pieDelIzq.setWidth(4);
        pieDelIzq.setHeight(7);
        this.getChildren().add(pieDelIzq);
            //Pie delantero derecho
        Rectangle pieDelDer = new Rectangle(40, 20, Color.LIGHTGREEN);
        pieDelDer.setX(18);
        pieDelDer.setY(8);
        pieDelDer.setWidth(4);
        pieDelDer.setHeight(7);
        this.getChildren().add(pieDelDer);
        
        //Piernas traseras
            //Pierna trasera izquierda
        Rectangle piernaTraIzq = new Rectangle(40, 20, Color.LIGHTGREEN);
        piernaTraIzq.setX(0);
        piernaTraIzq.setY(20);
        piernaTraIzq.setWidth(7);
        piernaTraIzq.setHeight(5);
        this.getChildren().add(piernaTraIzq);
            //Pierna trasera derecha
        Rectangle piernaTraDer = new Rectangle(40, 20, Color.LIGHTGREEN);
        piernaTraDer.setX(15);
        piernaTraDer.setY(20);
        piernaTraDer.setWidth(7);
        piernaTraDer.setHeight(5);
        this.getChildren().add(piernaTraDer);
            //Pie trasero izquierdo
        Rectangle pieTraIzq = new Rectangle(40, 20, Color.LIGHTGREEN);
        pieTraIzq.setX(0);
        pieTraIzq.setY(18);
        pieTraIzq.setWidth(4);
        pieTraIzq.setHeight(2);
        this.getChildren().add(pieTraIzq);
            //Pie trasero derecho
        Rectangle pieTraDer = new Rectangle(40, 20, Color.LIGHTGREEN);
        pieTraDer.setX(18);
        pieTraDer.setY(18);
        pieTraDer.setWidth(4);
        pieTraDer.setHeight(2);
        this.getChildren().add(pieTraDer);
        
        //Ranas de la meta
        
        //Meter colisiones y una foto de una rana en invisible para que cuando
        //haga colision en la meta se habilite la imagen de la rana para que
        //esa meta esté ocupada.
        
    }
    
    public void setPosX() {
        this.posXPer = posXPer;
        rectJugador.setX(posXPer);
        this.setLayoutX(this.posXPer);
        if (posXPer > 770){
            this.posXPer = 770;
            this.setLayoutX(770);
            rectJugador.setX(770);
        }
        if (posXPer < 10){
            this.posXPer = 10;
            this.setLayoutX(10);
            rectJugador.setX(10);
        }
    }
    
    public void setPosY() {
        this.posYPer = posYPer;
        rectJugador.setY(posYPer);
        this.setLayoutY(this.posYPer);
        if (posYPer > 570){
            this.posYPer = 570;
            this.setLayoutY(570);
            rectJugador.setY(570);
        }
        if (posYPer < 100){
            this.posYPer = 100;
            this.setLayoutY(100);
            rectJugador.setY(100);
        }
    }
    
}