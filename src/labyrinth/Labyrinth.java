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
     * Die berechnungsmethode wird aufgerufen
     */
    public static void main(String[] args) {
        
        oberflaeche o= new oberflaeche();
        //zeichnen o= new zeichnen();
        o.setVisible(true);
        o.setTitle("Labyrinth");
        berechnungStatisch.berechnen();
        

    }
}