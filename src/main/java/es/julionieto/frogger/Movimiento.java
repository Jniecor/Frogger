package es.julionieto.frogger;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.Pane;
import javafx.util.Duration;

public class Movimiento extends Pane{
    
    Frogger frogger;
    Rana rana;
    Coches coches;
    Troncos troncos;
    Nenufares nenufares;
    
    public Movimiento(Frogger frogger, Rana rana, Coches coches, Troncos troncos, Nenufares nenufares){
        
        Timeline animationGame = new Timeline(
            new KeyFrame(Duration.seconds(0.017),(ActionEvent ae) -> {

                frogger.colocacionObstaculos();
                frogger.colocacionJugador();
//                movimientoJugador();
//                rana.posXPer -= 2;
//                System.out.println(Rana.posXPer);
                movimientoCoches();
                movimientoNenufares();
                movimientoTroncos();
                rana.setPosX();
                rana.setPosY();                
                
//                frogger.comprobarColisionCoches();
//                frogger.comprobarColisionAgua();
//                frogger.comprobarColisionNenufares();
//                frogger.comprobarColisionTroncos();
//                frogger.comprobarColisionParedFinal();
//                frogger.comprobarColisionMetas();
                frogger.mostrarTableroConsola();

            })
        );
        animationGame.setCycleCount(Timeline.INDEFINITE);
        animationGame.play();

    }
    
    public void movimientoCoches(){
    
        for(int i=0; i<8; i++){
            coches.arrayCoches[i] += coches.velCoche;
            coches.cocheView[i].setX(coches.arrayCoches[i]);
            coches.rectCoche[i].setX(coches.arrayCoches[i]);
            if (coches.arrayCoches[i] >= 825){
                coches.arrayCoches[i] = -55;
                coches.cocheView[i].setX(coches.arrayCoches[i]);
                coches.rectCoche[i].setX(coches.arrayCoches[i]);
            }
        }
        
        for(int i=8; i<16; i++){
            coches.arrayCoches[i] -= coches.velCoche;
            coches.cocheView[i].setX(coches.arrayCoches[i]);
            coches.rectCoche[i].setX(coches.arrayCoches[i]);
            if (coches.arrayCoches[i] <= -55){
                coches.arrayCoches[i] = 825;
                coches.cocheView[i].setX(coches.arrayCoches[i]);
                coches.rectCoche[i].setX(coches.arrayCoches[i]);
            }
        }
    
    }
    
    public void movimientoNenufares(){
    
        //Movimiento Nenufares
        for(int i=0; i<30; i++){
            nenufares.arrayNenufares[i] += nenufares.velNenufar;
            nenufares.nenufarView[i].setX(nenufares.arrayNenufares[i]);
            nenufares.rectNenufar[i].setX(nenufares.arrayNenufares[i]);
            if (nenufares.arrayNenufares[i] >= 895){
                nenufares.arrayNenufares[i] = -100;
                nenufares.nenufarView[i].setX(nenufares.arrayNenufares[i]);
                nenufares.rectNenufar[i].setX(nenufares.arrayNenufares[i]);
            }
        }
    
    }
    
    public void movimientoTroncos(){
    
        //Movimiento Troncos
        for(int i=0; i<10; i++){
            troncos.arrayTroncos[i] += troncos.velTronco;
            troncos.troncoView[i].setX(troncos.arrayTroncos[i]);
            troncos.rectTronco[i].setX(troncos.arrayTroncos[i]);
            if (troncos.arrayTroncos[i] >= 900){
                troncos.arrayTroncos[i] = -100;
                troncos.troncoView[i].setX(troncos.arrayTroncos[i]);
                troncos.rectTronco[i].setX(troncos.arrayTroncos[i]);
            }
        }
    
    }

}
