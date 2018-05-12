/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labyrinth;

/**
 *
 * @author Sunny
 */
public class Labyrinth {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /*int [][] flaeche =              //Das labyrinth ansich aus 1 und 0
        { {1,1,0,0,0,0,0,0,0,0,0,0,0},
          {0,1,1,0,1,0,1,0,0,0,0,0,0},
          {0,0,1,1,1,1,1,0,1,1,1,0,0},
          {0,0,0,0,1,0,1,0,0,1,0,0,0},
          {0,0,1,0,0,0,1,1,1,1,1,0,0},
          {0,0,1,0,1,1,1,0,1,0,0,0,0},
          {0,0,1,0,1,0,0,0,1,1,1,0,0},
          {0,0,1,0,1,1,1,0,1,0,1,0,0},
          {0,0,0,0,0,0,0,0,0,0,1,1,5},  //Ende soll 5 sein bei P(12/8)
          {0,0,0,0,0,0,0,0,0,0,0,0,0}
        };
        **/
        int [][] flaeche =              //Das labyrinth ansich aus 1 und 0
        { {0,0,0,0,0,0,0,0,0,0,0,0,0},
          {0,1,0,0,1,1,1,1,1,1,1,0,0},
          {0,1,1,1,1,0,0,1,0,0,1,0,0},
          {0,0,0,0,0,0,0,1,0,0,0,0,0},
          {0,0,0,0,1,1,1,1,0,1,1,1,3}, //ende ist 3 und p(1/1) ist anfang
          {0,0,0,0,1,0,0,0,0,1,0,0,0},
          {0,0,0,0,1,0,0,0,0,1,0,0,0},
          {0,0,0,0,1,1,1,1,1,1,0,0,0},
          {0,0,0,0,0,0,0,0,0,0,0,0,0},
          {0,0,0,0,0,0,0,0,0,0,0,0,0}
        };
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
        
        String [] weg = new String [130];     //max. 130 einträge
        
        for (int i = 0; i < 130; i++) {
            weg[i]="0";
        }
        weg[0]="start";
        
        int a=1;    //1=nach unten 2=nach oben 3=nach links 4=nach rechts
        int b=1;
        int k=-1;
        int c=flaeche[a][b];
        
        while (c!=3){
            if (flaeche[a][b+1]!=0 && (eigflaeche[a][b+1]==0 || eigflaeche[a][b+1]==3)) {  //gang nach rechts
                b++;
                eigflaeche[a][b]=1;
                k++;
                weg[k]="rechts";
            } else if(flaeche[a][b-1]!=0 && (eigflaeche[a][b-1]==0 || eigflaeche[a][b-1]==3)) {//gang nach links
                b--;
                eigflaeche[a][b]=1;
                k++;
                weg[k]="links";
            } else if(flaeche[a-1][b]!=0 && (eigflaeche[a-1][b]==0 || eigflaeche[a-1][b]==3)) {//gang nach unten
                a--;
                eigflaeche[a][b]=1;
                k++;
                weg[k]="oben";
            } else if(flaeche[a+1][b]!=0 && (eigflaeche[a+1][b]==0 || eigflaeche[a+1][b]==3)) {//gang nach oben
                a++;
                eigflaeche[a][b]=1;
                k++;
                weg[k]="unten";
            } 
            
                    else {
                
                        if ("rechts".equals(weg[k])){
                           eigflaeche[a][b]=2;
                            b--;
                            weg[k]="0";
                            k--;
                        } else if ("links".equals(weg[k])){
                              eigflaeche[a][b]=2;
                            b++;
                            weg[k]="0";
                            k--; 
                        } else if ("oben".equals(weg[k])){
                            eigflaeche[a][b]=2;
                            a++;
                            weg[k]="0";
                            k--;
                        } else if ("unten".equals(weg[k])){
                            eigflaeche[a][b]=2;
                            a--;
                            weg[k]="0";
                            k--;
                        } 
                        
                    }
            
            c=flaeche[a][b];
           }
        
        for (int zw = 0; zw < 10; zw++) {
            

        for (int i = 0; i < 13; i++) {
            System.out.print(eigflaeche[zw][i]+ "");
        }
            System.out.println("");
        }
        System.out.println(c + ""+ a +b);
        for (int i = 0; i < weg.length; i++) {
            System.out.println(weg[i] + i);
        }
    }
}
