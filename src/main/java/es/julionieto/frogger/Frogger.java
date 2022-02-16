package es.julionieto.frogger;

import java.util.Random;

public class Frogger{
    
    short tamXTablero;
    short tamYTablero;
    final short DIM_SUELO = 13;
    final short DIM_AGUA = 6;
    char[][] tablero;
    
    final char JUGADOR = 'a';
    final char COCHES = 'b';
    final char TRONCOS = 'c';
    final char NENUFARES = 'd';
    
    final char SUELO = '.';
    final char AGUA = ',';
    final char PARED = '-';
    
    
    public Frogger(){
        
        tamXTablero = 20;
        tamYTablero = 15;

        tablero = new char[tamXTablero][tamYTablero];
        
        Random random = new Random();
        
        for(int x=0; x<tamXTablero; x++) {
            for(int y=0; y<DIM_AGUA; y++) {
                tablero[x][y] = AGUA;
            }
        }
        for(int x=0; x<tamXTablero; x++){
            for(int y=DIM_AGUA; y<DIM_SUELO; y++){
                tablero[x][y] = SUELO;
            }
        }
        for(int x=0; x<tamXTablero; x++){
            tablero[x][0] = PARED;
            tablero[x][6] = PARED;
            tablero[x][12] = PARED;
        }
        tablero[random.nextInt(19)][13] = JUGADOR;
        
    }
    
    public void mostrarTableroConsola() {
        
        for(int y=0; y<tamYTablero; y++) {
            for(int x=0; x<tamXTablero; x++) {
                System.out.print(tablero[x][y]);
            }
            System.out.println();
        }

        System.out.println();
        
    }
    
}
