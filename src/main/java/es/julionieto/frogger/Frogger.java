package es.julionieto.frogger;

import java.util.Random;

public class Frogger{
    
    short tamXTablero;
    short tamYTablero;
    
    short movimiento = 0;
    //Dimension del suelo y del agua en cuanto a 'Y' se refiere
    final short DIM_SUELO = 13;
    final short DIM_AGUA = 6;
    
    //Filas de los diferentes obstaculos
    final short FILA_COCHES_1 = 10;
    final short FILA_COCHES_2 = 8;
    final short FILA_NENUFARES_1 = 5;
    final short FILA_NENUFARES_2 = 3;
    final short FILA_NENUFARES_3 = 1;
    final short FILA_TRONCOS_1 = 4;
    final short FILA_TRONCOS_2 = 2;
    
    //Array multidimensional para el tablero
    char[][] tablero;
    
    //Jugador + Obstaculos
    final char JUGADOR = 'a';
    final char COCHES = 'b';
    final char TRONCOS = 'c';
    final char NENUFARES = 'd';
    final char METAS = 'e';
    
    //Zonas
    final char SUELO = '.';
    final char AGUA = ',';
    final char PARED = '-';  
    
    public Frogger(){
        
        tamXTablero = 20;
        tamYTablero = 14;

        tablero = new char[tamXTablero][tamYTablero];
        
        Random random = new Random();
        
        //Crear tablero con las diferentes zonas
        for(int x=0; x<tamXTablero; x++) {
            for(int y=0; y<DIM_AGUA+1; y++) {
                tablero[x][y] = AGUA;
            }
        }
        for(int x=0; x<tamXTablero; x++){
            for(int y=DIM_AGUA; y<DIM_SUELO+1; y++){
                tablero[x][y] = SUELO;
            }
        }
        for(int x=0; x<tamXTablero; x++){
            tablero[x][0] = PARED;
            tablero[x][6] = PARED;
            tablero[x][12] = PARED;
        }
        
        //Color metas en el tablero
        for (int i=2; i<tamXTablero; i++){
            tablero[i][0]= METAS;
            i+=4;
        }
        
        tablero[random.nextInt(19)][13] = JUGADOR;
    
    }
    
    public void colocacionObstaculos(){
        
        //Colocar coches en el tablero
        for (int i=0; i<tamXTablero; i++){
            tablero[i][FILA_COCHES_1]= COCHES;
            tablero[i+1][FILA_COCHES_1] = SUELO;
            tablero[i+1][FILA_COCHES_2]= COCHES;
            tablero[i][FILA_COCHES_2] = SUELO;
            i++;
        }
        
        //Colocar nenufares en el tablero
        for (int i=0; i<tamXTablero; i++){
            tablero[i][FILA_NENUFARES_1]= NENUFARES;
            tablero[i+1][FILA_NENUFARES_1]= NENUFARES;
            tablero[i+2][FILA_NENUFARES_1]= AGUA;
            tablero[i+3][FILA_NENUFARES_1]= AGUA;
            i+=3;
        }
        for (int i=0; i<tamXTablero; i++){
            tablero[i][FILA_NENUFARES_2]= NENUFARES;
            tablero[i+1][FILA_NENUFARES_2]= NENUFARES;
            tablero[i+2][FILA_NENUFARES_2]= AGUA;
            tablero[i+3][FILA_NENUFARES_2]= AGUA;
            i+=3;
        }
        for (int i=0; i<tamXTablero; i++){
            tablero[i][FILA_NENUFARES_3]= NENUFARES;
            tablero[i+1][FILA_NENUFARES_3]= NENUFARES;
            tablero[i+2][FILA_NENUFARES_3]= AGUA;
            tablero[i+3][FILA_NENUFARES_3]= AGUA;
            i+=3;
        }
        
        //Colocar troncos en el tablero
        for (int i=1; i<tamXTablero; i++){
            tablero[i-1][FILA_TRONCOS_1]= AGUA;
            tablero[i][FILA_TRONCOS_1]= TRONCOS;
            tablero[i+1][FILA_TRONCOS_1]= TRONCOS;
            tablero[i+2][FILA_TRONCOS_1]= TRONCOS;
            tablero[i+3][FILA_TRONCOS_1]= AGUA;
            i+=4;
        }
        for (int i=1; i<tamXTablero; i++){
            tablero[i-1][FILA_TRONCOS_2]= AGUA;
            tablero[i][FILA_TRONCOS_2]= TRONCOS;
            tablero[i+1][FILA_TRONCOS_2]= TRONCOS;
            tablero[i+2][FILA_TRONCOS_2]= TRONCOS;
            tablero[i+3][FILA_TRONCOS_2]= AGUA;
            i+=4;
        }
        
    }
    
    public void movimientoObstaculos(){
        
        //Cambio de posicion del obstaculo coches
        for (int i=0; i<tamXTablero; i++){
            tablero[i+1][FILA_COCHES_1]= COCHES;
            tablero[i][FILA_COCHES_1] = SUELO;
            tablero[i][FILA_COCHES_2]= COCHES;
            tablero[i+1][FILA_COCHES_2] = SUELO;
            i++;
        }
        //Cambio de posicion del obstaculo nenufares
        for (int i=0; i<tamXTablero; i++){
            tablero[i][FILA_NENUFARES_1]= AGUA;
            tablero[i+1][FILA_NENUFARES_1]= AGUA;
            tablero[i+2][FILA_NENUFARES_1]= NENUFARES;
            tablero[i+3][FILA_NENUFARES_1]= NENUFARES;
            i+=3;
        }
        for (int i=0; i<tamXTablero; i++){
            tablero[i][FILA_NENUFARES_2]= AGUA;
            tablero[i+1][FILA_NENUFARES_2]= AGUA;
            tablero[i+2][FILA_NENUFARES_2]= NENUFARES;
            tablero[i+3][FILA_NENUFARES_2]= NENUFARES;
            i+=3;
        }
        for (int i=0; i<tamXTablero; i++){
            tablero[i][FILA_NENUFARES_3]= AGUA;
            tablero[i+1][FILA_NENUFARES_3]= AGUA;
            tablero[i+2][FILA_NENUFARES_3]= NENUFARES;
            tablero[i+3][FILA_NENUFARES_3]= NENUFARES;
            i+=3;
        }
        
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
