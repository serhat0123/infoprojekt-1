/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labyrinth;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

/**
 *
 * @author Sunny
 */
public class oberflaeche extends javax.swing.JFrame {

    /**
     * Creates new form oberflaeche
     */
    public oberflaeche() {
        initComponents();
    }

    /**
     * Start:
     *      cleart alles
     *      mal den perfekten weg an welches er aus Statisch.eigflaeche bekommt
     *      setzt 3 Parameter zurück: a,b und z (Statisch.z=0; Statisch.a=1;Statisch.b=1;)
     *          --> sind wichtig für den schrittweisen weg, da a und b die startpositionen sind (beim vorgegebenen (1|1) und z ist wichtig für die wegabfrage des arrays weg2
     * 
     * Reset:
     *      cleart alles
     *      setzt 3 Parameter zurück: a,b und z (Statisch.z=0; Statisch.a=1;Statisch.b=1;)
     *          --> sind wichtig für den schrittweisen weg, da a und b die startpositionen sind (beim vorgegebenen (1|1) und z ist wichtig für die wegabfrage des arrays weg2
     *      
     * Schritweise nach vorne (">"):
     *      cleart alles
     *      vergleicht Statisch.weg2 mit rechts links oben und unten und zeichnet dann das entsprechende Rechteck
     *      setzt die neu erworbenen Koordianten (a und b) fest und erhöht den wegschritt z um eins (dann: Statisch.z=z; Statisch.a=a;Statisch.b=b;)
     * 
     * Schritweise zurück ("<"):
     *      cleart alles
     *      vergleicht Statisch.weg2 mit vorigem schritt ob man rechts links oben oder nach unten gegangen ist und zeichnet dann das entsprechende Rechteck
     *      setzt die neu erworbenen Koordianten (a und b) (die alten ) fest und erniedrigt den wegschritt z um eins (dann: Statisch.z=z; Statisch.a=a;Statisch.b=b;)
     * 
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel(){
            public void paintComponent(Graphics g){
                super.paintComponent(g);
                zeichneBild(g);
            }
        };
        jButton3 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jCheckBox1 = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setToolTipText("");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 373, Short.MAX_VALUE)
        );

        jButton3.setText("Start");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });

        jButton1.setText("Reset");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        jButton4.setText(">");
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });

        jButton2.setText("<");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });

        jButton5.setText("selbst zeichnen");
        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton5MouseClicked(evt);
            }
        });
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("Standart Labyrinth benuzten");
        jButton6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton6MouseClicked(evt);
            }
        });

        jCheckBox1.setText("Roter Hifsweg");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton5)
                .addGap(18, 18, 18)
                .addComponent(jButton6)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap())
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jButton1)
                    .addComponent(jButton4)
                    .addComponent(jButton2)
                    .addComponent(jButton5)
                    .addComponent(jButton6)
                    .addComponent(jCheckBox1)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        //START - STARTET DEN SCHNELLEN WEG
        
        Graphics2D g = (Graphics2D)jPanel1.getGraphics();
        
        int h = jPanel1.getHeight();
        int w = jPanel1.getWidth();
        h=h/10;
        w=w/13;
        
        //zuerst wieder alles clearen bevor neu gezeichnet wird
        for (int u = 0; u < 10; u++) {
        
            for (int i = 0; i < 13; i++) {
                    if (Statisch.flaeche[u][i]!=0) {    //!=0 ist wichtig und nicht ==1 weil sonst das ziel (3) nicht gelöscht wird
                      g.clearRect(i*w, u*h, w, h);
                    }else {
                    }
            }
        } 
        
        for (int u = 0; u < 10; u++) {
        
            for (int i = 0; i < 13; i++) {
                    if (Statisch.eigflaeche[u][i]==1) {
                      g.setColor(Color.YELLOW);  
                      g.fillRect(i*w, u*h, w, h);
                    }else {
                    }
            }
        }
        int kk=0;
        int a=StatischStartPkt.x;
        int b=StatischStartPkt.y;
        int z=0;
        if(jCheckBox1.isSelected()==true){   
            while (kk==0){
                g.setColor(Color.red);
                    if ("rechts".equals(Statisch.weg[z])){
                                g.drawLine(a*w+w/2, b*h+h/2, a*w+w/2+w, b*h+h/2);
                                a++;
                    } else if ("links".equals(Statisch.weg[z])){
                                g.drawLine(a*w+w/2, b*h+h/2, a*w+w/2-w, b*h+h/2);
                                a--;
                    } else if ("oben".equals(Statisch.weg[z])){
                                g.drawLine(a*w+w/2, b*h+h/2, a*w+w/2, b*h+h/2-h);
                                b--;
                    } else if ("unten".equals(Statisch.weg[z])){
                                g.drawLine(a*w+w/2, b*h+h/2, a*w+w/2, b*h+h/2+h);
                                b++;

                    } else {                                        //else tritt ein wenn "0" im Array steht-->fertig "gegangen"
                        kk=1;
                    }
                    z++;
            }
        }else{
        }    
        
        Statisch.z=0;   //wichtige zurücksetzung der parameter für den schrittweisen weg
        Statisch.a=StatischStartPkt.x;
        Statisch.b=StatischStartPkt.y;
    
    }//GEN-LAST:event_jButton3MouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        //RESET - CLEART ALLES
        
        Graphics2D g = (Graphics2D)jPanel1.getGraphics();
        
        int h = jPanel1.getHeight();
        int w = jPanel1.getWidth();
        h=h/10;
        w=w/13;
        for (int u = 0; u < 10; u++) {
        
            for (int i = 0; i < 13; i++) {
                    if (Statisch.flaeche[u][i]!=0) {    //!=0 ist wichtig und nicht ==1 weil sonst das ziel (3) nicht gelöscht wird
                      g.clearRect(i*w, u*h, w, h);
                    }else {
                    }
            }
        } 
        Statisch.z=0;   //wichtige zurücksetzung der parameter für den schrittweisen weg
        Statisch.a=StatischStartPkt.x;
        Statisch.b=StatischStartPkt.y;
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
        //SCHRITWEISE - nach vorne
        
        Graphics2D g = (Graphics2D)jPanel1.getGraphics();
                        
        int h = jPanel1.getHeight();
        int w = jPanel1.getWidth();
        h=h/10;
        w=w/13;
        int a=Statisch.a;
        int b=Statisch.b;
        
        
        //zuerst wieder alles clearen bevor neu gezeichnet wird
        for (int u = 0; u < 10; u++) {
        
            for (int i = 0; i < 13; i++) {
                    if (Statisch.flaeche[u][i]!=0) {    //!=0 ist wichtig und nicht ==1 weil sonst das ziel (3) nicht gelöscht wird
                      g.clearRect(i*w, u*h, w, h);
                    }else {
                    }
            }
        } 
        
        int z = Statisch.z; //integer für die Wegabfrage
        
        g.setColor(Color.RED);
        
            if ("rechts".equals(Statisch.weg2[z])){         //vergleicht ob der weg jetzt nach rechts "zeigt"
                        g.clearRect(a*w, b*h, w, h);        //clear seinen jetzigen standpunkt
                        a++;                                //geht nach rechts
                        g.fillRect(a*w, b*h, w, h);         //zeichnet auf seiner jetzigen neuen position (rechts) ein rechteck
            } else if ("links".equals(Statisch.weg2[z])){
                        g.clearRect(a*w, b*h, w, h);
                        a--;
                        g.fillRect(a*w, b*h, w, h);
            } else if ("oben".equals(Statisch.weg2[z])){
                        g.clearRect(a*w, b*h, w, h);
                        b--;
                        g.fillRect(a*w, b*h, w, h);
            } else if ("unten".equals(Statisch.weg2[z])){
                        g.clearRect(a*w, b*h, w, h);
                        b++;
                        g.fillRect(a*w, b*h, w, h);
            } else {                                        //else tritt ein wenn er am ende angelangt ist
                        g.fillRect(a*w, b*h, w, h);         //zeichnet immer das end-rechteck neu - sonst würde es verloren gehen
                        z--;                                //z-- da spätter z++ um es auszugleichen da es das ziel ist (schwer zu verstehen/ muss man sich reindenken/ war bisschen try and error)
            }
            z++;
            Statisch.z=z;
            Statisch.a=a;
            Statisch.b=b;
            
    }//GEN-LAST:event_jButton4MouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        //SCHRITTWEISE - zurück
        
        Graphics2D g = (Graphics2D)jPanel1.getGraphics();
                        
        int h = jPanel1.getHeight();
        int w = jPanel1.getWidth();
        h=h/10;
        w=w/13;
        int a=Statisch.a;
        int b=Statisch.b;
        
        
        //zuerst wieder alles clearen bevor neu gezeichnet wird
        for (int u = 0; u < 10; u++) {
        
            for (int i = 0; i < 13; i++) {
                    if (Statisch.flaeche[u][i]!=0) {    //!=0 ist wichtig und nicht ==1 weil sonst das ziel (3) nicht gelöscht wird
                      g.clearRect(i*w, u*h, w, h);
                    }else {
                    }
            }
        } 
        
        int z = Statisch.z; //integer für die Wegabfrage
        
        g.setColor(Color.RED);
        
        
        
            if(z!=0) {
                    if ("rechts".equals(Statisch.weg2[z-1])){
                            g.clearRect(a*w, b*h, w, h);
                            a--;
                            g.fillRect(a*w, b*h, w, h);
                } else if ("links".equals(Statisch.weg2[z-1])){
                            g.clearRect(a*w, b*h, w, h);
                            a++;
                            g.fillRect(a*w, b*h, w, h);
                } else if ("oben".equals(Statisch.weg2[z-1])){
                            g.clearRect(a*w, b*h, w, h);
                            b++;
                            g.fillRect(a*w, b*h, w, h);
                } else if ("unten".equals(Statisch.weg2[z-1])){
                            g.clearRect(a*w, b*h, w, h);
                            b--;
                            g.fillRect(a*w, b*h, w, h);
                } else {
                }

            z--;
            Statisch.z=z;
            Statisch.a=a;
            Statisch.b=b;
            
            }
    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseClicked
        // selbst zeichnen wird geöffnet:
        setVisible(false);
        
        for (int u = 1; u < 9; u++) {   // zeichenbrett wird zurückgesetzt
            
        
            for (int i = 1; i < 12; i++) {
                    Statisch.zeichnen[u][i]=1;
            }
        }
        StatischStartPkt.x=1;
        StatischStartPkt.y=1;
        
        new zeichnen().setVisible(true);
    }//GEN-LAST:event_jButton5MouseClicked

    private void jButton6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton6MouseClicked
        // Standart Labyrinth benutzen:
        setVisible(false);
        for (int u = 0; u < 10; u++) {   // übergabe an flaeche
            
        
            for (int i = 0; i < 13; i++) {
                    Statisch.flaeche[u][i]=Statisch.flaeche_fest[u][i];
            }
        }
        Statisch.z=0;   //wichtige zurücksetzung der parameter für den schrittweisen weg
        Statisch.a=StatischStartPkt.xfest;
        Statisch.b=StatischStartPkt.yfest;
        StatischStartPkt.x=StatischStartPkt.xfest;
        StatischStartPkt.y=StatischStartPkt.yfest;
        for (int u = 0; u < 10; u++) {   // eigflaeche wird zurückgesetzt
            for (int i = 0; i < 13; i++) {
                    StatischStartPkt.eigflaeche[u][i]=StatischStartPkt.eigflaechefest[u][i];
            }
        }
        berechnungStatisch.berechnen();
        setVisible(true);
    }//GEN-LAST:event_jButton6MouseClicked

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    
    
    public void zeichneBild(Graphics g){  
        //zeichnet das labyrinth (schwarz)
        int h = jPanel1.getHeight();
        int w = jPanel1.getWidth();
        h=h/10;
        w=w/13;
     
        for (int u = 0; u < 10; u++) {   // zeichnet labyrint-layout
        
            for (int i = 0; i < 13; i++) {
                    if (Statisch.flaeche[u][i]==0) {
                      g.setColor(Color.BLACK);  
                      g.fillRect(i*w, u*h, w, h); 
                      
                    }/** else if (Statisch.flaeche[u][i]==3){       // tut ziel markieren
                        g.setColor(Color.BLACK);  
                        
                        for (int j = 0; j < 4; j++) {
                            for (int k = 0; k < 4; k++) {
                                if (k%2==0 && j%2==0){
                                g.fillRect(i*w+w/4*k, u*h+h/4*j, w/4, h/4); 
                                }else if(k%2==1 && j%2==1){
                                    g.fillRect(i*w+w/4*k, u*h+h/4*j, w/4, h/4);
                                }
                            }    
                        }
                        
                    } */ else {
                        
                    }
            }
        }   
        
       
    }
    
   
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(oberflaeche.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(oberflaeche.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(oberflaeche.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(oberflaeche.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new oberflaeche().setVisible(true);
            }
        });
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
