package es.julionieto.frogger;

import javafx.scene.Group;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Coches extends Group{

    int ArrayCoches[] = new int[16];
        
    public Coches(){
        
        //Velocidad coches
        //int velCocheDer = 2;
        
        //4 imagenes de los coches 
        Image cocheRojoDer = new Image(getClass().getResourceAsStream("/images/Coche_rojo_der.png"));
        Image cocheRojoIzq = new Image(getClass().getResourceAsStream("/images/Coche_rojo_izq.png"));
        Image cocheAmarilloDer = new Image(getClass().getResourceAsStream("/images/Coche_amarillo_der.png"));
        Image cocheAmarilloIzq = new Image(getClass().getResourceAsStream("/images/Coche_amarillo_izq.png"));
        
        //Array de las imágenes de los coches
        ImageView cocheView[] = new ImageView[16];
                
        //Fila 1 (abajo)
        final double POSICION_FILA_1_COCHES = 456.5; // Y
        ArrayCoches[0] = 770; // X
        
        //Bucle para almacenar la X de los diferentes coches
        for (int i = 1; i < 8; i++){
            ArrayCoches[i] = ArrayCoches[i-1]-110; // X
        }
        
        //Bucles para las distintas imágenes de los coches
        for (int i = 0; i <7; i+=2){
            cocheView[i] = new ImageView(cocheRojoDer);
        }
        for (int i = 1; i <8; i+=2){
            cocheView[i] = new ImageView(cocheAmarilloDer);
        }
        
        //Bucle para posicionar las imágenes
        for (int i = 0; i <8; i++){
            cocheView[i].setX(ArrayCoches[i]);
        }
        
        //Bucle para los primeros 7 coches para que tengan la misma "Y"
        for(int i=0; i<8; i++) {
            cocheView[i].setY(POSICION_FILA_1_COCHES);
        }
        
        //Fila 2 (Arriba)
        final double POSICION_FILA_2_COCHES = 383.5; // Y
        ArrayCoches[8] = 710; // X
        
        //Bucle para almacenar la X de los diferentes coches
        for (int i = 9; i < 16; i++){
            ArrayCoches[i] = ArrayCoches[i-1]-110; // X
        }
        
        //Bucles para las distintas imágenes de los coches
        for (int i = 8; i <15; i+=2){
            cocheView[i] = new ImageView(cocheRojoIzq);
        }
        for (int i = 9; i <16; i+=2){
            cocheView[i] = new ImageView(cocheAmarilloIzq);
        } 
        
        //Bucle para posicionar las imágenes        
        for (int i = 8; i <16; i++){
            cocheView[i].setX(ArrayCoches[i]);
        }
        
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
