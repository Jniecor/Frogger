package es.julionieto.frogger;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.Pane;
import javafx.util.Duration;

public class Movimiento extends Pane{
    
    public Movimiento(Frogger frogger, Rana rana, Coches coches, Troncos troncos, Nenufares nenufares){

        //Movimiento de la rana
        this.setOnKeyPressed((KeyEvent event) -> {
            switch(event.getCode()) {
                case UP:
                    Rana.posYPer -= 36;
                    break;
                case DOWN:
                    Rana.posYPer += 36;
                    break;
                case LEFT:
                    Rana.posXPer -= 10;
                    break;
                case RIGHT:
                    Rana.posXPer += 10;
                    break;
            }
        });
        
        this.setOnKeyReleased((KeyEvent event) -> {
            Rana.posYPer = Rana.posYPer;
        });
        
        Timeline animationGame = new Timeline(
            new KeyFrame(Duration.seconds(0.017),(ActionEvent ae) -> {
                Rana.posYPer -= 2;
                System.out.println(Rana.posYPer);
                Rana.groupPersonaje.setLayoutY(Rana.posYPer);
                Rana.groupPersonaje.setLayoutX(Rana.posXPer);
//                colisionJugador.setX(posXPersonaje);
//                colisionJugador.setY(posYPersonaje);
//                for (int i=0; i<16; i++){
//                    Shape zonaColision = Shape.intersect(cocheRect[i], colisionJugador);
//                    boolean colisionVaciaCoches = zonaColision.getBoundsInLocal().isEmpty();
//                    if (colisionVaciaCoches == false){
//                        groupPersonaje.setLayoutX(POS_X_PERSONAJE);
//                        groupPersonaje.setLayoutY(POS_Y_PERSONAJE);
//                    } 
//                }
//                for (int i=0; i<10; i++){
//                    Shape zonaColision1 = Shape.intersect(troncoRect[i], colisionJugador);
//                    boolean colisionVaciaTroncos = zonaColision1.getBoundsInLocal().isEmpty();
//                    if (colisionVaciaTroncos == false){
//                        posXPersonaje += velocidadTroncos;
//                    } 
//                }
//                for (int i=0; i<30; i++){
//                    Shape zonaColision2 = Shape.intersect(nenufarRect[i], colisionJugador);
//                    boolean colisionVaciaNenufares = zonaColision2.getBoundsInLocal().isEmpty();
//                    if (colisionVaciaNenufares == false){
//                        posXPersonaje += velNenufar;
//                    } 
//                }
//
//                //Movimiento Coches
//
//                for(int i=0; i<8; i++){
//                    posicionCocheInt[i] += velCoche;
//                    cocheView[i].setX(posicionCocheInt[i]);
//                    cocheRect[i].setX(posicionCocheInt[i]);
//                    if (posicionCocheInt[i] >= 825){
//                        posicionCocheInt[i] = -55;
//                        cocheView[i].setX(posicionCocheInt[i]);
//                        cocheRect[i].setX(posicionCocheInt[i]);
//                    }
//                }
//
//                for(int i=8; i<16; i++){
//                    posicionCocheInt[i] -= velCoche;
//                    cocheView[i].setX(posicionCocheInt[i]);
//                    cocheRect[i].setX(posicionCocheInt[i]);
//                    if (posicionCocheInt[i] <= -55){
//                        posicionCocheInt[i] = 825;
//                        cocheView[i].setX(posicionCocheInt[i]);
//                        cocheRect[i].setX(posicionCocheInt[i]);
//                    }
//                }
//
//                //Movimiento Troncos
//                for(int i=0; i<10; i++){
//                    posicionTroncoInt[i] += velocidadTroncos;
//                    troncoView[i].setX(posicionTroncoInt[i]);
//                    troncoRect[i].setX(posicionTroncoInt[i]);
//                    if (posicionTroncoInt[i] >= 900){
//                        posicionTroncoInt[i] = -100;
//                        troncoView[i].setX(posicionTroncoInt[i]);
//                        troncoRect[i].setX(posicionTroncoInt[i]);
//                    }
//                }
//
//                //Movimiento Nenufares
//                for(int i=0; i<30; i++){
//                    posicionNenufarInt[i] += velNenufar;
//                    nenufarView[i].setX(posicionNenufarInt[i]);
//                    nenufarRect[i].setX(posicionNenufarInt[i]);
//                    if (posicionNenufarInt[i] >= 895){
//                        posicionNenufarInt[i] = -100;
//                        nenufarView[i].setX(posicionNenufarInt[i]);
//                        nenufarRect[i].setX(posicionNenufarInt[i]);
//                    }
//                }            
//
//                if (posYPersonaje >= 570){
//                    groupPersonaje.setLayoutY(570);
//                    colisionJugador.setY(570);
//                }
//                if (posYPersonaje <= 100){
//                    groupPersonaje.setLayoutY(100);
//                    colisionJugador.setY(100);
//                }
//                if (posXPersonaje >= 770){
//                    groupPersonaje.setLayoutX(770);
//                    colisionJugador.setX(770);
//                }
//                if (posXPersonaje <= 10){
//                    groupPersonaje.setLayoutX(10);
//                    colisionJugador.setX(10);
//                }
                
                frogger.mostrarTableroConsola();

            })
        );
        animationGame.setCycleCount(Timeline.INDEFINITE);
        animationGame.play();

    }

}
