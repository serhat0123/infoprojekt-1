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
    public static int [][] flaeche =              //Das labyrinth ansich aus 1 und 0
        { {0,0,0,0,0,0,0,0,0,0,0,0,0},
          {0,1,0,1,1,1,1,1,1,1,1,1,0},
          {0,1,1,1,0,0,0,1,0,1,0,1,0},
          {0,0,0,0,0,0,0,1,0,1,1,1,0},
          {0,1,1,1,1,1,1,1,0,0,0,0,0}, //ende ist 3 und p(1/1) ist anfang
          {0,1,0,0,1,0,0,0,0,1,1,1,3},
          {0,1,0,0,0,0,0,0,0,1,0,0,0},
          {0,1,1,0,1,1,1,1,1,1,0,0,0},
          {0,0,1,1,0,0,0,0,0,0,0,0,0},
          {0,0,0,0,0,0,0,0,0,0,0,0,0}
        };
        public static int [][] eigflaeche =              //Das labyrinth das es sich selbst erarbeiten wird
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
        public static String [] weg2 = new String [130];
}
