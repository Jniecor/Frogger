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
    final short POS_INIY_JUGADOR = 13; 
    final short POS_INIY2_JUGADOR = 6;
    Random random = new Random();
    int posX = random.nextInt(19);
    short posY = 13;
    
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
    short contadorMeta = 0;
    
    public Frogger(){
        
        //Tamaño del tablero
        tamXTablero = 20;
        tamYTablero = 14;

        //Se crea el tablero con las dimensiones de arriba
        tablero = new char[tamXTablero][tamYTablero];
        
        //Se define las diferentes zonas del tablero
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
        
        //Se coloca al jugador
        tablero[posX][posY] = JUGADOR;
        
//        //Dice la posicion del jugador
//        if (posX>=0 && posX<=tamXTablero){
//            if (posY>=0 && posY<=tamXTablero){
//                System.out.println(posX);
//                System.out.println(posY);
//            }
//        }
    }
    
    public void colocacionObstaculos(){
        
        /*--Colocación de todos los obstáculos/metas--*/
        //Colocación del obstáculo Coches en el tablero
        for (short i=0; i<tamXTablero; i++){
            tablero[i][FILA_COCHES_1]= COCHES;
            tablero[i+1][FILA_COCHES_1] = SUELO;
            tablero[i+1][FILA_COCHES_2]= COCHES;
            tablero[i][FILA_COCHES_2] = SUELO;
            i++;
        }
        
        //Colocación del obstáculo Nenufares en el tablero
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
        
        //Colocación del obstáculo Troncos en el tablero
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
        
        //Colocación del obstáculo Metas en el tablero
        for (short i=2; i<tamXTablero; i++){
            tablero[i][0]= METAS;
            i+=4;
        }
        
    }
    
//    public void movimientoObstaculos(){
//        
//        //Cambio de posición del obstáculo Coches
//        for (short i=0; i<tamXTablero; i++){
//            tablero[i+1][FILA_COCHES_1]= COCHES;
//            tablero[i][FILA_COCHES_1] = SUELO;
//            tablero[i][FILA_COCHES_2]= COCHES;
//            tablero[i+1][FILA_COCHES_2] = SUELO;
//            i++;
//        }
//        //Cambio de posición del obstáculo Nenufares
//        for (short i=0; i<tamXTablero; i++){
//            tablero[i][FILA_NENUFARES_1]= AGUA;
//            tablero[i+1][FILA_NENUFARES_1]= AGUA;
//            tablero[i+2][FILA_NENUFARES_1]= NENUFARES;
//            tablero[i+3][FILA_NENUFARES_1]= NENUFARES;
//            i+=3;
//        }
//        for (short i=0; i<tamXTablero; i++){
//            tablero[i][FILA_NENUFARES_2]= AGUA;
//            tablero[i+1][FILA_NENUFARES_2]= AGUA;
//            tablero[i+2][FILA_NENUFARES_2]= NENUFARES;
//            tablero[i+3][FILA_NENUFARES_2]= NENUFARES;
//            i+=3;
//        }
//        for (short i=0; i<tamXTablero; i++){
//            tablero[i][FILA_NENUFARES_3]= AGUA;
//            tablero[i+1][FILA_NENUFARES_3]= AGUA;
//            tablero[i+2][FILA_NENUFARES_3]= NENUFARES;
//            tablero[i+3][FILA_NENUFARES_3]= NENUFARES;
//            i+=3;
//        }
//        
//    }
    
    public boolean comprobarColisionCoches(){
        
        //Se comprueba si el Jugador colisiona con el obstáculo Coches
        while (tamXTablero-posX >= 0 && tablero[posX][posY] == COCHES){
            
            contadorMuertes++;
            for(short x=0; x<tamXTablero; x++){
                tablero[x][POS_INIY_JUGADOR] = SUELO;
            }
            posX = random.nextInt(19);
            posY = POS_INIY_JUGADOR;
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
        
        //Se comprueba si el Jugador colisiona con el obstáculo Agua
        while (tamXTablero-posX >= 0 && tablero[posX][posY] == AGUA){
            
            contadorMuertes++;
            for(short x=0; x<tamXTablero; x++){
                tablero[x][POS_INIY_JUGADOR] = SUELO;
                tablero[x][POS_INIY2_JUGADOR] = PARED;
            }
            posX = random.nextInt(19);
            posY = POS_INIY2_JUGADOR;
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
        
        //Se comprueba si la ultima posición del Jugador fue encima del obstáculo Troncos
        if (posX >= 0 && posX < tamXTablero){
            if(tablero[posX+1][posY] == TRONCOS){
                tablero[posX][posY] = TRONCOS;
            }
        }
        if (posX < tamXTablero && posX > 0){
            if(tablero[posX-1][posY] == TRONCOS){
                tablero[posX][posY] = TRONCOS;
            }
        }
        
        //Se comprueba si el Jugador colisiona con el obstáculo Nenufares
        while (tamXTablero-posX >= 0 && tablero[posX][posY] == NENUFARES){
            
            contadorDesplazamiento++;
            for(short x=0; x<tamXTablero; x++){
                tablero[x][POS_INIY_JUGADOR] = SUELO;
                tablero[x][POS_INIY2_JUGADOR] = PARED;
            }
            tablero[posX][posY] = JUGADOR;
            System.out.println("Estás subido a un nenufar. Te estas desplazando con el nenufar: "+contadorDesplazamiento+" vez/veces." );
            
        }
        
        if(contadorDesplazamiento >= 1) {
            return true;
        } else {
            return false;
        }
        
    }
    
    public boolean comprobarColisionTroncos(){
        
        //Se comprueba si la ultima posición del jugador fue encima del obstáculo Nenufares
        if (posX >= 0 && posX < tamXTablero){
            if(tablero[posX+1][posY] == NENUFARES){
                tablero[posX][posY] = NENUFARES;
            }
        }
        if (posX < tamXTablero && posX > 0){
            if(tablero[posX-1][posY] == NENUFARES){
                tablero[posX][posY] = NENUFARES;
            }
        }
        
        //Se comprueba si el Jugador colisiona con el obstáculo Troncos
        while (tamXTablero-posX >= 0 && tablero[posX][posY] == TRONCOS){
            
            contadorEstancado++;
            tablero[posX][posY] = JUGADOR;
            System.out.println("Estás subido a un tronco. El tronco está estancado. Te has estancado: "+contadorDesplazamiento+" vez/veces." );
            
        }
        
        if(contadorEstancado >= 1) {
            return true;
        } else {
            return false;
        }
        
    }
    
    public boolean comprobarColisionParedFinal(){
        
        //Se comprueba si la ultima posición del jugador fue encima del obstáculo Nenufares
        if (posX >= 0 && posX < tamXTablero){
            if(tablero[posX+1][posY] == NENUFARES){
                tablero[posX][posY] = NENUFARES;
            }
        }
        if (posX < tamXTablero && posX > 0){
            if(tablero[posX-1][posY] == NENUFARES){
                tablero[posX][posY] = NENUFARES;
            }
        }
        
        //Se comprueba si el Jugador colisiona con el obstáculo Pared(la cual la "Y" es 0)
        while (tamXTablero-posX >= 0 && tablero[posX][posY] == PARED){
            
            contadorMuertes++;
            for(short x=0; x<tamXTablero; x++){
                tablero[x][POS_INIY_JUGADOR] = SUELO;
                tablero[x][POS_INIY2_JUGADOR] = PARED;
            }
            posX = random.nextInt(19);
            posY = POS_INIY2_JUGADOR;
            tablero[posX][posY] = JUGADOR;
            System.out.println("Te has chocado con la pared final. Has muerto: "+contadorMuertes+" vez/veces." );
            
        }
        
        if(contadorMuertes >= 1) {
            return true;
        } else {
            return false;
        }
        
    }
    
    public boolean comprobarColisionMetas(){
        
        //Se comprueba si la ultima posición del jugador fue encima del obstáculo Nenufares
        if (posX >= 0 && posX < tamXTablero){
            if(tablero[posX+1][posY] == NENUFARES){
                tablero[posX][posY] = NENUFARES;
            }
        }
        if (posX < tamXTablero && posX > 0){
            if(tablero[posX-1][posY] == NENUFARES){
                tablero[posX][posY] = NENUFARES;
            }
        }
        
        //Se comprueba si la meta ya está ocupada por una Rana
        if (tablero[posX][posY] == JUGADOR){
            
            contadorMuertes++;
            System.out.println("Has llegado a una meta ya ocupada por una rana "+posX+", "+posY+". Has muerto: "+contadorMuertes+" vez/veces." );
            for(short x=0; x<tamXTablero; x++){
                tablero[x][POS_INIY_JUGADOR] = SUELO;
                tablero[x][POS_INIY2_JUGADOR] = PARED;
            }
            posX = random.nextInt(19);
            posY = POS_INIY2_JUGADOR;
            tablero[posX][posY] = JUGADOR;
            
        }
        
        //Se comprueba si el Jugador colisiona con una de las Metas
        while (tamXTablero-posX >= 0 && tablero[posX][posY] == METAS){

            if (contadorMeta!=4){
                
                contadorMeta++;
                tablero[posX][posY] = JUGADOR;
                System.out.println("Has llegado a una de las metas "+posX+", "+posY+". Has alcanzado la meta: "+contadorMeta+" vez/veces." );
                for(short x=0; x<tamXTablero; x++){
                    tablero[x][POS_INIY_JUGADOR] = SUELO;
                    tablero[x][POS_INIY2_JUGADOR] = PARED;
                }
                posX = random.nextInt(19);
                posY = POS_INIY_JUGADOR;
                tablero[posX][posY] = JUGADOR;
                
            }
            
            if (contadorMeta==4){
                
                this.reset();
                
            }
        }
        
        if(contadorMeta >= 1) {
            return true;
        } else {
            return false;
        }
        
    }
    
    public void reset(){
        
        while (contadorMeta == 4){
            
            contadorMuertes = 0;
            contadorDesplazamiento = 0;
            contadorEstancado = 0;
            contadorMeta = 0;
            
            System.out.println("¡Enhorabuena has ganado! Pulsa <ENTER> para empezar de nuevo.");
            this.colocacionJugador();
            this.colocacionObstaculos();
            
        }
    }
    
    public void mostrarTableroConsola() {
            
            //Muestra el tablero en la consola
            for(short y=0; y<tamYTablero; y++) {
                for(short x=0; x<tamXTablero; x++) {
                    System.out.print(tablero[x][y]);
                }
                System.out.println();
            }

            System.out.println();
            
    }
    
}
