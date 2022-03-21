package es.julionieto.frogger;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.scene.layout.Pane;
import javafx.util.Duration;

public class Movimiento extends Pane{

    Rana rana;
    Coches coches;
    Troncos troncos;
    Nenufares nenufares;
    Frogger frogger;
//    Agua agua; Agua agua
    ParedFinal paredFinal;
    
    public Movimiento(Rana rana, Coches coches, Troncos troncos, Nenufares nenufares, Frogger frogger, Metas metas, ParedFinal paredFinal){
        
        Timeline animationGame = new Timeline(
            new KeyFrame(Duration.seconds(0.017),(ActionEvent ae) -> {
                
                frogger.colocacionJugador();
                frogger.colocacionObstaculos();
                movimientoCoches();
                movimientoNenufares();
//                movimientoAgua();
                movimientoTroncos();
                rana.setPosX();
                rana.setPosY();                
                coches.colisionCoches(frogger, rana);
                nenufares.colisionNenufares(frogger, rana);
                troncos.colisionTroncos(frogger, rana);
//                agua.colisionAgua(frogger, rana);
                paredFinal.colisionPared(frogger, rana);
                metas.colisionMetas(frogger, rana);
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
    
//    public void movimientoAgua(){
//    
//        //Movimiento Agua
//        for(int i=0; i<12; i++){
//            agua.arrayAgua[i] += nenufares.velNenufar;
//            agua.rectAgua[i].setX(agua.arrayAgua[i]);
//            if (agua.arrayAgua[i] >= 895){
//                agua.arrayAgua[i] = -100;
//                agua.rectAgua[i].setX(agua.arrayAgua[i]);
//            }
//        }
//    
//    }
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
