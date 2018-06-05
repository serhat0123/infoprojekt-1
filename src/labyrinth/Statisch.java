/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labyrinth;

/**
 *
 * @author s.nalcakan
 */
public class Statisch {
    
    public static int [][] flaeche =              //Das labyrinth das vorgegeben ist und zur eigendlichen klasse die das verarbeitet übergegben wird
        { {0,0,0,0,0,0,0,0,0,0,0,0,0},
          {0,1,0,1,1,1,1,0,1,1,1,1,0},
          {0,1,1,1,0,0,1,1,0,1,0,1,0},
          {0,0,0,0,0,0,0,1,0,1,1,1,0},
          {0,1,1,1,1,1,1,1,0,0,0,0,0},
          {0,1,0,0,1,0,0,0,0,1,1,1,3},      //ende ist 3 und p(1/1) ist anfang
          {0,1,1,0,1,0,0,0,0,1,0,0,0},
          {0,1,0,0,1,1,1,1,1,1,0,0,0},
          {0,1,1,0,0,0,0,0,0,0,0,0,0},
          {0,0,0,0,0,0,0,0,0,0,0,0,0}
        };
    
    public static int [][] flaeche_fest =
        { {0,0,0,0,0,0,0,0,0,0,0,0,0},
          {0,1,0,1,1,1,1,1,1,1,1,1,0},
          {0,1,1,1,0,0,0,1,0,1,0,1,0},
          {0,0,0,0,0,0,0,1,0,1,1,1,0},
          {0,1,1,1,1,1,1,1,0,0,0,0,0},
          {0,1,0,0,1,0,0,0,0,1,1,1,3},
          {0,1,1,0,1,0,0,0,0,1,0,0,0},
          {0,1,0,0,1,1,1,1,1,1,0,0,0},
          {0,1,1,0,0,0,0,0,0,0,0,0,0},
          {0,0,0,0,0,0,0,0,0,0,0,0,0}
        };
    
        public static int [][] eigflaeche =              //Das labyrinth das es sich selbst erarbeiten wird, wird HIERHER ÜBERGEBEN!
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
        
        public static String [] weg = new String [130];     //Der Failweg WIRD HIERHER ÜBERGEBEN!
        public static String [] weg2 = new String [130];    //Der Failweg WIRD HIERHER ÜBERGEBEN!
        
        //für die Schrittweise Visualisierung
        public static int z = 0;    //laufvariable für die failweg wiedergabe
        public static int a = 1;    
        public static int b = 1;
        
        public static int [][] zeichnen =              //Das labyrinth das vorgegeben ist und zur eigendlichen klasse die das verarbeitet übergegben wird
        { {0,0,0,0,0,0,0,0,0,0,0,0,0},
          {0,1,1,1,1,1,1,1,1,1,1,1,0},
          {0,1,1,1,1,1,1,1,1,1,1,1,0},
          {0,1,1,1,1,1,1,1,1,1,1,1,0},
          {0,1,1,1,1,1,1,1,1,1,1,1,0},
          {0,1,1,1,1,1,1,1,1,1,1,1,3},      //ende ist 3 und p(1/1) ist anfang
          {0,1,1,1,1,1,1,1,1,1,1,1,0},
          {0,1,1,1,1,1,1,1,1,1,1,1,0},
          {0,1,1,1,1,1,1,1,1,1,1,1,0},
          {0,0,0,0,0,0,0,0,0,0,0,0,0}
        };
        
        
        
}
