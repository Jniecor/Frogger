package es.julionieto.frogger;

import javafx.scene.Group;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Coches extends Group{
    
    public Coches(){
        
        //Coches (Autopista)
        int velCocheDer = 2;
        
        //Fila 1 (abajo)
        final double POSICION_FILA_1_COCHES = 456.5;
        int posicionCoche0 = 770;
        int posicionCoche1 = 660;
        int posicionCoche2 = 550;
        int posicionCoche3 = 440;
        int posicionCoche4 = 330;
        int posicionCoche5 = 220;
        int posicionCoche6 = 110;
        int posicionCoche7 = 0;


        //Fila 2 (Arriba)
        final double POSICION_FILA_2_COCHES = 383.5;
        int posicionCoche8 = 710;
        int posicionCoche9 = 600;
        int posicionCoche10 = 490;
        int posicionCoche11 = 380;
        int posicionCoche12 = 270;
        int posicionCoche13 = 160;
        int posicionCoche14 = 50;
        int posicionCoche15 = -60;
        
        /*----Coches----*/
        //4 imagenes de los coches 
        Image cocheRojoDer = new Image(getClass().getResourceAsStream("/images/Coche_rojo_der.png"));
        Image cocheRojoIzq = new Image(getClass().getResourceAsStream("/images/Coche_rojo_izq.png"));
        Image cocheAmarilloDer = new Image(getClass().getResourceAsStream("/images/Coche_amarillo_der.png"));
        Image cocheAmarilloIzq = new Image(getClass().getResourceAsStream("/images/Coche_amarillo_izq.png"));
        
        //Array de los coches
        ImageView cocheView[] = new ImageView[16];
        
        //Primera fila        
        cocheView[0] = new ImageView(cocheRojoDer);
        cocheView[0].setX(posicionCoche0);
        
        cocheView[1] = new ImageView(cocheAmarilloDer);
        cocheView[1].setX(posicionCoche1);
        
        cocheView[2] = new ImageView(cocheRojoDer);
        cocheView[2].setX(posicionCoche2);
        
        cocheView[3] = new ImageView(cocheRojoDer);
        cocheView[3].setX(posicionCoche3);
        
        cocheView[4] = new ImageView(cocheAmarilloDer);
        cocheView[4].setX(posicionCoche4);
        
        cocheView[5] = new ImageView(cocheAmarilloDer);
        cocheView[5].setX(posicionCoche5);
        
        cocheView[6] = new ImageView(cocheRojoDer);
        cocheView[6].setX(posicionCoche6);
        
        cocheView[7] = new ImageView(cocheRojoDer);
        cocheView[7].setX(posicionCoche7);
        
        //Bucle para los primeros 7 coches para que tengan la misma "Y"
        for(int i=0; i<8; i++) {
            cocheView[i].setY(POSICION_FILA_1_COCHES);
        }
        
        //Segunda fila        
        cocheView[8] = new ImageView(cocheRojoIzq);
        cocheView[8].setX(posicionCoche8);
        
        cocheView[9] = new ImageView(cocheAmarilloIzq);
        cocheView[9].setX(posicionCoche9);
        
        cocheView[10] = new ImageView(cocheAmarilloIzq);
        cocheView[10].setX(posicionCoche10);
        
        cocheView[11] = new ImageView(cocheAmarilloIzq);
        cocheView[11].setX(posicionCoche11);
        
        cocheView[12] = new ImageView(cocheRojoIzq);
        cocheView[12].setX(posicionCoche12);
        
        cocheView[13] = new ImageView(cocheAmarilloIzq);
        cocheView[13].setX(posicionCoche13);
        
        cocheView[14] = new ImageView(cocheRojoIzq);
        cocheView[14].setX(posicionCoche14);
        
        cocheView[15] = new ImageView(cocheAmarilloIzq);
        cocheView[15].setX(posicionCoche15);
        
        //Bucle para los ultimos 8 coches para que tengan la misma "Y"
        for(int i=8; i<16; i++) {
            cocheView[i].setY(POSICION_FILA_2_COCHES);
        }
        
        //Añadir las imagenes para que salgan en la escena
        for(int i=0; i<16; i++){
            this.getChildren().add(cocheView[i]);
        }
    }
}
