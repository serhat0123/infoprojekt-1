/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labyrinth;

/**
 *
 * -die flaeche wird von Statisch.flaeche zugewiesen (das labyrinth)
 * 
 * -eigflaeche wird später den perfekten weg beinhalten, mit 1 und 0
 * -weg mit rechts und links, gibt den perfekten weg wieder
 * -weg2 mit rechts und links, gibt den fail weg wieder
 * -algorythmus:
 *      schaut ob rechts bei der flaeche frei ist und die eigflaeche noch nicht benutzt wude auf diesem weg (also das man da nicht schon war)
 * 
 * eigflaeche wird an Statisch.eigflaeche übergeben
 * weg2 wird an Statisch.eigflaeche weg2
 */
public class berechnungStatisch {
    
    public static void berechnen(){
        
                
        int [][] flaeche =  new int [10][13];            //Entnehme Labyrinth aus Statischer Klasse
        
            flaeche = Statisch.flaeche;


        int [][] eigflaeche =              //Das labyrinth das es sich selbst erarbeiten wird
        { {0,0,0,0,0,0,0,0,0,0,0,0,0},
          {0,1,0,0,0,0,0,0,0,0,0,0,0},
          {0,0,0,0,0,0,0,0,0,0,0,0,0},
          {0,0,0,0,0,0,0,0,0,0,0,0,0},
          {0,0,0,0,0,0,0,0,0,0,0,0,0},
          {0,0,0,0,0,0,0,0,0,0,0,0,0},
          {0,0,0,0,0,0,0,0,0,0,0,0,0},
          {0,0,0,0,0,0,0,0,0,0,0,0,0},
          {0,0,0,0,0,0,0,0,0,0,0,0,0},
          {0,0,0,0,0,0,0,0,0,0,0,0,0}
        };
        
        String [] weg = new String [130];     //max. 130 einträge/ gibt den perfekten weg wieder
        String [] weg2 = new String [130];    //gibt weg auch mit fail abbiegungen wieder
        
        for (int i = 0; i < 130; i++) {     //"0" wir überall eingetragen zum start
            weg[i]="0";
            weg2[i]="0";
        }
        weg[0]="start";
        weg2[0]="start";
        
        //JETZT FOLGT: EIN ALGORHYTMUS mit dem der Gang des Springers ermittelt werden kann: (von 51 - 140)
        
        int a=1;    //1=nach unten 2=nach oben 3=nach links 4=nach rechts
        int b=1;
        int k=-1;
        int p=-1;
        int c=flaeche[a][b];
        
        while (c!=3){
            if (flaeche[a][b+1]!=0 && eigflaeche[a][b+1]==0) {  //gang nach rechts
                b++;
                eigflaeche[a][b]=1;
                k++;
                weg[k]="rechts";
                
                p++;
                weg2[p]="rechts";
            } else if(flaeche[a][b-1]!=0 && eigflaeche[a][b-1]==0) {//gang nach links
                b--;
                eigflaeche[a][b]=1;
                k++;
                weg[k]="links";
                
                p++;
                weg2[p]="links";
            } else if(flaeche[a-1][b]!=0 && eigflaeche[a-1][b]==0) {//gang nach unten
                a--;
                eigflaeche[a][b]=1;
                k++;
                weg[k]="oben";
                
                p++;
                weg2[p]="oben";
            } else if(flaeche[a+1][b]!=0 && eigflaeche[a+1][b]==0) {//gang nach oben
                a++;
                eigflaeche[a][b]=1;
                k++;
                weg[k]="unten";
                
                p++;
                weg2[p]="unten";
            } 
            
            
                    else {          //else tritt in kraft wenn nicht nach oben, l. r. oder unten gegangen werden kann (ist aber auch nicht das Ziel 
                                    //    --> Sackgasse (auch ne schleife zählt dazu)
                
                        if ("rechts".equals(weg[k])){   //wenn man davor rechts gegangen ist wird der wegabschnitt auf 2 gesetzt (2=fail weg), man geht dann mit b-- nach links
                           eigflaeche[a][b]=2;          // und der gegangene wegeintrag wird gelöscht (mit 0) und k wird um eins verringert (also einen schritt zurück)
                            b--;
                            weg[k]="0";
                            k--;
                            
                            p++;
                            weg2[p]="links";
                            
                        } else if ("links".equals(weg[k])){
                              eigflaeche[a][b]=2;
                            b++;
                            weg[k]="0";
                            k--; 
                            
                            p++;
                            weg2[p]="rechts";
                            
                        } else if ("oben".equals(weg[k])){
                            eigflaeche[a][b]=2;
                            a++;
                            weg[k]="0";
                            k--;
                            
                            p++;
                            weg2[p]="unten";
                            
                        } else if ("unten".equals(weg[k])){
                            eigflaeche[a][b]=2;
                            a--;
                            weg[k]="0";
                            k--;
                            
                            p++;
                            weg2[p]="oben";
                            
                        } 
                        
                    }
            
            c=flaeche[a][b];    //da c nun 3 ist hat es den weg gefunden
            
           }
        
        Statisch.eigflaeche = eigflaeche;   //  ermittelte eigenflaeche wird an die zwischen Klasse Statisch übergegeben 
        Statisch.weg2 = weg2;               //      und der weg (weg 2) mit den fails auch
        
        
        
        
        for (int zw = 0; zw < 10; zw++) {
            

        for (int i = 0; i < 13; i++) {
            System.out.print(Statisch.eigflaeche[zw][i]+ "");
        }
            System.out.println("");
        }
        System.out.println(c + ""+ a +b);
        for (int i = 0; i < weg.length; i++) {
            if (weg2[i]!=Statisch.weg2[i]){
                System.out.println(weg2[i] + i); 
            }
           
        }
        
    }
    
    
}
