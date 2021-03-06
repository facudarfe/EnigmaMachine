/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import enigma.Enigma;
import java.awt.Image;

/**
 *
 * @author facud
 */
public class EnigmaMain extends javax.swing.JFrame {
    private Enigma enigma;
    
    /**
     * Creates new form EnigmaMain
     */
    public EnigmaMain() {
        this.enigma = new Enigma();
        initComponents();
        myInitComponents();
        machine.requestFocusInWindow();
    }
    
    public EnigmaMain(String title, Image icon){
        this();
        setTitle(title);
        setIconImage(icon);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        machine = new GUI.Machine(this, this.enigma);
        rightPanel = new GUI.RightPanel(this, this.enigma);
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1384, 880));
        setMinimumSize(new java.awt.Dimension(1384, 880));
        setName("EnigmaMain"); // NOI18N
        setResizable(false);
        setSize(new java.awt.Dimension(1384, 880));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(machine, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, -1, -1));
        getContentPane().add(rightPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(748, 40, -1, -1));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/background.jpg"))); // NOI18N
        background.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(123, 38, 0), 4, true));
        background.setMaximumSize(new java.awt.Dimension(1384, 880));
        background.setMinimumSize(new java.awt.Dimension(1384, 880));
        background.setPreferredSize(new java.awt.Dimension(1384, 880));
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void myInitComponents(){
        setLocationRelativeTo(null);
    }
    
    public RightPanel getRightPanel(){
        return this.rightPanel;
    }
    
    public Machine getMachine(){
        return this.machine;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private GUI.Machine machine;
    private GUI.RightPanel rightPanel;
    // End of variables declaration//GEN-END:variables
}
