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
public class StatischStartPkt {
    public static int x = 1;
    public static int y = 1;
    public static int xzuletzt = 1; //zuletzt verwendete x Koordinate
    public static int yzuletzt = 1; //zuletzt verwendete y Koordinate
    public static int xfest = 1;    //von uns festgelelegte x Koordinate
    public static int yfest = 1;    //von uns festgelelegte y Koordinate
    
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
    
    public static int [][] eigflaechefest =              //Das labyrinth das es sich selbst erarbeiten wird
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
}
