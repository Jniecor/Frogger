package es.julionieto.frogger;

import javafx.scene.Group;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Nenufares extends Group{
    
    //Nenúfares (Río)
    //Fila 1 (Abajo)
    final double POSICION_FILA_1_NENUFARES = 273.5;
    static int posicionNenufar0 = 565;
    static int posicionNenufar1 = 595;
    static int posicionNenufar2 = 765;
    static int posicionNenufar3 = 795;
    static int posicionNenufar4 = 365;
    static int posicionNenufar5 = 395;
    static int posicionNenufar6 = 165;
    static int posicionNenufar7 = 195;
    static int posicionNenufar8 = -5;
    static int posicionNenufar9 = -35;
    
    //Fila 2 (Medio)   
    final double POSICION_FILA_2_NENUFARES = 201.5;
    static int posicionNenufar10 = 565;
    static int posicionNenufar11 = 595;
    static int posicionNenufar12 = 765;
    static int posicionNenufar13 = 795;
    static int posicionNenufar14 = 365;
    static int posicionNenufar15 = 395;
    static int posicionNenufar16 = 165;
    static int posicionNenufar17 = 195;
    static int posicionNenufar18 = -5;
    static int posicionNenufar19 = -35;
    
    //Fila 3 (Arriba)
    final double POSICION_FILA_3_NENUFARES = 129.5;
    static int posicionNenufar20 = 565;
    static int posicionNenufar21 = 595;
    static int posicionNenufar22 = 765;
    static int posicionNenufar23 = 795;
    static int posicionNenufar24 = 365;
    static int posicionNenufar25 = 395;
    static int posicionNenufar26 = 165;
    static int posicionNenufar27 = 195;
    static int posicionNenufar28 = -5;
    static int posicionNenufar29 = -35;
    
    public Nenufares(){
    
        //Única imagen del obejto nenufar
        Image nenufar = new Image(getClass().getResourceAsStream("/images/Nenufar.png"));
        
        //Array de los nenúfares
        ImageView nenufarView[] = new ImageView[31];
        
        //Primera fila
        nenufarView[0] = new ImageView(nenufar);
        nenufarView[0].setX(posicionNenufar0);
        
        nenufarView[1] = new ImageView(nenufar);
        nenufarView[1].setX(posicionNenufar1);
        
        nenufarView[2] = new ImageView(nenufar);
        nenufarView[2].setX(posicionNenufar2);
        
        nenufarView[3] = new ImageView(nenufar);
        nenufarView[3].setX(posicionNenufar3);
        
        nenufarView[4] = new ImageView(nenufar);
        nenufarView[4].setX(posicionNenufar4);
        
        nenufarView[5] = new ImageView(nenufar);
        nenufarView[5].setX(posicionNenufar5);
        
        nenufarView[6] = new ImageView(nenufar);
        nenufarView[6].setX(posicionNenufar6);
        
        nenufarView[7] = new ImageView(nenufar);
        nenufarView[7].setX(posicionNenufar7);
        
        nenufarView[8] = new ImageView(nenufar);
        nenufarView[8].setX(posicionNenufar8);
        
        nenufarView[9] = new ImageView(nenufar);
        nenufarView[9].setX(posicionNenufar9);
        
        //Bucle para mostrar los primeros 9 nenúfares con la misma "Y"
        for(int i=0; i<10; i++) {
            nenufarView[i].setY(POSICION_FILA_1_NENUFARES);
        }
        
        //Segunda fila
        nenufarView[10] = new ImageView(nenufar);
        nenufarView[10].setX(posicionNenufar10);
        
        nenufarView[11] = new ImageView(nenufar);
        nenufarView[11].setX(posicionNenufar11);
        
        nenufarView[12] = new ImageView(nenufar);
        nenufarView[12].setX(posicionNenufar12);
        
        nenufarView[13] = new ImageView(nenufar);
        nenufarView[13].setX(posicionNenufar13);
        
        nenufarView[14] = new ImageView(nenufar);
        nenufarView[14].setX(posicionNenufar14);
        
        nenufarView[15] = new ImageView(nenufar);
        nenufarView[15].setX(posicionNenufar15);
        
        nenufarView[16] = new ImageView(nenufar);
        nenufarView[16].setX(posicionNenufar16);
        
        nenufarView[17] = new ImageView(nenufar);
        nenufarView[17].setX(posicionNenufar17);
        
        nenufarView[18] = new ImageView(nenufar);
        nenufarView[18].setX(posicionNenufar18);
        
        nenufarView[19] = new ImageView(nenufar);
        nenufarView[19].setX(posicionNenufar19);
        
        //Bucle para mostrar los nenufares 10-19 con la misma "Y"
        for(int i=10; i<20; i++) {
            nenufarView[i].setY(POSICION_FILA_2_NENUFARES);
        }
        
        //Tercera fila
        nenufarView[20] = new ImageView(nenufar);
        nenufarView[20].setX(posicionNenufar20);
        
        nenufarView[21] = new ImageView(nenufar);
        nenufarView[21].setX(posicionNenufar21);
        
        nenufarView[22] = new ImageView(nenufar);
        nenufarView[22].setX(posicionNenufar22);
        
        nenufarView[23] = new ImageView(nenufar);
        nenufarView[23].setX(posicionNenufar23);
        
        nenufarView[24] = new ImageView(nenufar);
        nenufarView[24].setX(posicionNenufar24);
        
        nenufarView[25] = new ImageView(nenufar);
        nenufarView[25].setX(posicionNenufar25);
        
        nenufarView[26] = new ImageView(nenufar);
        nenufarView[26].setX(posicionNenufar26);
        
        nenufarView[27] = new ImageView(nenufar);
        nenufarView[27].setX(posicionNenufar27);
        
        nenufarView[28] = new ImageView(nenufar);
        nenufarView[28].setX(posicionNenufar28);
        
        nenufarView[29] = new ImageView(nenufar);
        nenufarView[29].setX(posicionNenufar29);
        
        //Mostrar los ultimos 10 nenúfares con la misma "Y"
        for(int i=20; i<30; i++) {
            nenufarView[i].setY(POSICION_FILA_3_NENUFARES);
        }
    
        for(int i=0; i<30; i++){
            this.getChildren().add(nenufarView[i]);
        }
    }
    
}
