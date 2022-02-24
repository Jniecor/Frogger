package es.julionieto.frogger;

import java.util.Random;

public class Frogger{
    
    //Array multidimensional para el tablero
    char[][] tablero;
    
    //Dimensiones del tablero
    short tamXTablero;
    short tamYTablero;
    
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
    
    //Dimension del suelo y del agua en cuanto a 'Y' se refiere
    final short DIM_SUELO = 13;
    final short DIM_AGUA = 6;
    
    //Posición del jugador
    final short POS_INIY_JGUADOR = 13; 
    Random random = new Random();
    int posX = 3;
    short posY = 8;
    
    //Filas de los diferentes obstaculos
    final short FILA_COCHES_1 = 10;
    final short FILA_COCHES_2 = 8;
    final short FILA_NENUFARES_1 = 5;
    final short FILA_NENUFARES_2 = 3;
    final short FILA_NENUFARES_3 = 1;
    final short FILA_TRONCOS_1 = 4;
    final short FILA_TRONCOS_2 = 2;

    //Contadores
    short contadorMuertes = 0;
    short contadorDesplazamiento = 0;
    short contadorEstancado = 0;
    
    public Frogger(){
        
        tamXTablero = 20;
        tamYTablero = 14;

        tablero = new char[tamXTablero][tamYTablero];
        
        //Crear tablero con las diferentes zonas
        for(short x=0; x<tamXTablero; x++) {
            for(short y=0; y<DIM_AGUA+1; y++) {
                tablero[x][y] = AGUA;
            }
        }
        for(short x=0; x<tamXTablero; x++){
            for(short y=DIM_AGUA; y<DIM_SUELO+1; y++){
                tablero[x][y] = SUELO;
            }
        }
        for(short x=0; x<tamXTablero; x++){
            tablero[x][0] = PARED;
            tablero[x][6] = PARED;
            tablero[x][12] = PARED;
        }
    
    }
    
    public void colocacionJugador(){
    
        tablero[posX][posY] = JUGADOR;
        
        if (posX>=0 && posX<=tamXTablero){
            if (posY>=0 && posY<=tamXTablero){
                System.out.println(posX);
                System.out.println(posY);
            }
        }
    }
    
    public void colocacionObstaculos(){
        
        //Colocar coches en el tablero
        for (short i=0; i<tamXTablero; i++){
            tablero[i][FILA_COCHES_1]= COCHES;
            tablero[i+1][FILA_COCHES_1] = SUELO;
            tablero[i+1][FILA_COCHES_2]= COCHES;
            tablero[i][FILA_COCHES_2] = SUELO;
            i++;
        }
        
        //Colocar nenufares en el tablero
        for (short i=0; i<tamXTablero; i++){
            tablero[i][FILA_NENUFARES_1]= NENUFARES;
            tablero[i+1][FILA_NENUFARES_1]= NENUFARES;
            tablero[i+2][FILA_NENUFARES_1]= AGUA;
            tablero[i+3][FILA_NENUFARES_1]= AGUA;
            i+=3;
        }
        for (short i=0; i<tamXTablero; i++){
            tablero[i][FILA_NENUFARES_2]= NENUFARES;
            tablero[i+1][FILA_NENUFARES_2]= NENUFARES;
            tablero[i+2][FILA_NENUFARES_2]= AGUA;
            tablero[i+3][FILA_NENUFARES_2]= AGUA;
            i+=3;
        }
        for (short i=0; i<tamXTablero; i++){
            tablero[i][FILA_NENUFARES_3]= NENUFARES;
            tablero[i+1][FILA_NENUFARES_3]= NENUFARES;
            tablero[i+2][FILA_NENUFARES_3]= AGUA;
            tablero[i+3][FILA_NENUFARES_3]= AGUA;
            i+=3;
        }
        
        //Colocar troncos en el tablero
        for (short i=1; i<tamXTablero; i++){
            tablero[i-1][FILA_TRONCOS_1]= AGUA;
            tablero[i][FILA_TRONCOS_1]= TRONCOS;
            tablero[i+1][FILA_TRONCOS_1]= TRONCOS;
            tablero[i+2][FILA_TRONCOS_1]= TRONCOS;
            tablero[i+3][FILA_TRONCOS_1]= AGUA;
            i+=4;
        }
        for (short i=1; i<tamXTablero; i++){
            tablero[i-1][FILA_TRONCOS_2]= AGUA;
            tablero[i][FILA_TRONCOS_2]= TRONCOS;
            tablero[i+1][FILA_TRONCOS_2]= TRONCOS;
            tablero[i+2][FILA_TRONCOS_2]= TRONCOS;
            tablero[i+3][FILA_TRONCOS_2]= AGUA;
            i+=4;
        }
        
        //Color metas en el tablero
        for (short i=2; i<tamXTablero; i++){
            tablero[i][0]= METAS;
            i+=4;
        }
        
    }
    
    public void movimientoObstaculos(){
        
        //Cambio de posicion del obstaculo coches
        for (short i=0; i<tamXTablero; i++){
            tablero[i+1][FILA_COCHES_1]= COCHES;
            tablero[i][FILA_COCHES_1] = SUELO;
            tablero[i][FILA_COCHES_2]= COCHES;
            tablero[i+1][FILA_COCHES_2] = SUELO;
            i++;
        }
        //Cambio de posicion del obstaculo nenufares
        for (short i=0; i<tamXTablero; i++){
            tablero[i][FILA_NENUFARES_1]= AGUA;
            tablero[i+1][FILA_NENUFARES_1]= AGUA;
            tablero[i+2][FILA_NENUFARES_1]= NENUFARES;
            tablero[i+3][FILA_NENUFARES_1]= NENUFARES;
            i+=3;
        }
        for (short i=0; i<tamXTablero; i++){
            tablero[i][FILA_NENUFARES_2]= AGUA;
            tablero[i+1][FILA_NENUFARES_2]= AGUA;
            tablero[i+2][FILA_NENUFARES_2]= NENUFARES;
            tablero[i+3][FILA_NENUFARES_2]= NENUFARES;
            i+=3;
        }
        for (short i=0; i<tamXTablero; i++){
            tablero[i][FILA_NENUFARES_3]= AGUA;
            tablero[i+1][FILA_NENUFARES_3]= AGUA;
            tablero[i+2][FILA_NENUFARES_3]= NENUFARES;
            tablero[i+3][FILA_NENUFARES_3]= NENUFARES;
            i+=3;
        }
        
    }
    
    public boolean comprobarColisionCoches(){
        
        while (tamXTablero-posX >= 0 && tablero[posX][posY] == COCHES){
            
            contadorMuertes++;
            for(short x=0; x<tamXTablero; x++){
                tablero[x][POS_INIY_JGUADOR] = SUELO;
            }
            posX = random.nextInt(19);
            posY = 13;
            tablero[posX][posY] = JUGADOR;            
            System.out.println("Te has chocado con un coche. Has muerto: "+contadorMuertes+" vez/veces." );
            
        }
        if(contadorMuertes >= 1) {
            return true;
        } else {
            return false;
        }
        
    }
    
    public boolean comprobarColisionAgua(){
        
        posX = 2;
        posY = 1;
    
        while (tamXTablero-posX >= 0 && tablero[posX][posY] == AGUA){
            
            contadorMuertes++;
            for(short x=0; x<tamXTablero; x++){
                tablero[x][POS_INIY_JGUADOR] = SUELO;
            }
            posX = random.nextInt(19);
            posY = 13;
            tablero[posX][posY] = JUGADOR;
            System.out.println("Te has caido al agua. Has muerto: "+contadorMuertes+" vez/veces." );
            
        }
        if(contadorMuertes >= 1) {
            return true;
        } else {
            return false;
        }
        
    }
    
    public boolean comprobarColisionNenufares(){
        
        if (posX >= 0 && posX != tamXTablero){
            if(tablero[posX+1][posY] == TRONCOS){
                tablero[posX][posY] = TRONCOS;
            }
        }
        if (posX <= tamXTablero && posX != 0){
            if(tablero[posX-1][posY] == TRONCOS){
                tablero[posX][posY] = TRONCOS;
            }
        }
        
        posX = 0;
        posY = 1;
    
        while (tamXTablero-posX >= 0 && tablero[posX][posY] == NENUFARES){
            
            contadorDesplazamiento++;
            for(short x=0; x<tamXTablero; x++){
                tablero[x][POS_INIY_JGUADOR] = SUELO;
            }
            tablero[posX][posY] = JUGADOR;
            System.out.println("Estás subido a un nenufar. Te estas desplazando con el nenufar: "+contadorDesplazamiento+" vez/veces." );
            
        }
        
        if(contadorMuertes >= 1) {
            return true;
        } else {
            return false;
        }
        
    }
    
    public boolean comprobarColisionTroncos(){
        
        if (posX >= 0 && posX != tamXTablero){
            if(tablero[posX+1][posY] == NENUFARES){
                tablero[posX][posY] = NENUFARES;
            }
        }
        if (posX <= tamXTablero && posX != 0){
            if(tablero[posX-1][posY] == NENUFARES){
                tablero[posX][posY] = NENUFARES;
            }
        }
        
        posX = 1;
        posY = 2;
    
        while (tamXTablero-posX >= 0 && tablero[posX][posY] == TRONCOS){
            
            contadorEstancado++;
            tablero[posX][posY] = JUGADOR;
            System.out.println("Estás subido a un tronco. El tronco está estancado. Te has estancado: "+contadorDesplazamiento+" vez/veces." );
            
        }
        
        posX = 0;
        posY = 1;
        
        if(contadorMuertes >= 1) {
            return true;
        } else {
            return false;
        }
        
    }
    
    public void mostrarTableroConsola() {
            
            for(short y=0; y<tamYTablero; y++) {
                for(short x=0; x<tamXTablero; x++) {
                    System.out.print(tablero[x][y]);
                }
                System.out.println();
            }

            System.out.println();
            
    }
    
}
