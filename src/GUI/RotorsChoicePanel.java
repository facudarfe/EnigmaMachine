/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import enigma.Enigma;
import java.awt.Image;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.TransferHandler;
import static javax.swing.TransferHandler.COPY;
import static javax.swing.TransferHandler.MOVE;

/**
 * Ventana de eleccion de los tres rotores para Enigma
 * @author facud
 */
public class RotorsChoicePanel extends javax.swing.JPanel {
    private ArrayList<ImageIcon> iconsList;
    private Enigma enigma;
    private JFrame parent;
    
    /**
     * Crea una nueva ventana 
     */
    public RotorsChoicePanel() {
        initComponents();
        myInitComponents();
    }
    
    /**
     * Crea una nueva ventana
     * @param parent Ventana padre que lo invoca
     * @param enigma Maquina enigma
     */
    public RotorsChoicePanel(JFrame parent, Enigma enigma){
        this();
        this.parent = parent;
        this.enigma = enigma;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        checkButton = new javax.swing.JLabel();
        rotorV = new javax.swing.JLabel();
        rotorIV = new javax.swing.JLabel();
        rotorIII = new javax.swing.JLabel();
        rotorII = new javax.swing.JLabel();
        rotorI = new javax.swing.JLabel();
        rightPlace = new javax.swing.JLabel();
        middlePlace = new javax.swing.JLabel();
        leftPlace = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(973, 448));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ImageIcon icon = new ImageIcon(getClass().getResource("/resources/images/check_icon.png"));
        checkButton.setIcon(new ImageIcon(icon.getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT)));
        checkButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        checkButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                checkButtonMouseClicked(evt);
            }
        });
        add(checkButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 120, 50, 50));
        add(rotorV, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 260, 180, 180));
        add(rotorIV, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 260, 180, 180));
        add(rotorIII, new org.netbeans.lib.awtextra.AbsoluteConstraints(397, 260, 180, 180));
        add(rotorII, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 260, 180, 180));
        add(rotorI, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 180, 180));
        add(rightPlace, new org.netbeans.lib.awtextra.AbsoluteConstraints(667, 47, 180, 180));
        add(middlePlace, new org.netbeans.lib.awtextra.AbsoluteConstraints(397, 47, 180, 180));
        add(leftPlace, new org.netbeans.lib.awtextra.AbsoluteConstraints(127, 47, 180, 180));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/background1.jpg"))); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void checkButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_checkButtonMouseClicked
        if (leftPlace.getIcon() != null && middlePlace.getIcon() != null && rightPlace.getIcon() != null) {
            int left = this.iconsList.indexOf(leftPlace.getIcon());
            int middle = this.iconsList.indexOf(middlePlace.getIcon());
            int right = this.iconsList.indexOf(rightPlace.getIcon());
            
            this.enigma.changeRotors(left, middle, right);
            JOptionPane.showMessageDialog(this, "Se cargaron los rotores con éxito", "Éxito", JOptionPane.INFORMATION_MESSAGE);
            parent.dispose();
        } else {
            JOptionPane.showMessageDialog(this, "Faltan cargar rotores", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_checkButtonMouseClicked

    private void myInitComponents(){
        DragAndDropMotion dnd = new DragAndDropMotion();
        TransferDragAndDrop transfer = new TransferDragAndDrop("icon");
        iconsList = new ArrayList<>();
        iconsList.add(new ImageIcon(getClass().getResource("/resources/images/rotors/rotorI.png")));
        iconsList.add(new ImageIcon(getClass().getResource("/resources/images/rotors/rotorII.png")));
        iconsList.add(new ImageIcon(getClass().getResource("/resources/images/rotors/rotorIII.png")));
        iconsList.add(new ImageIcon(getClass().getResource("/resources/images/rotors/rotorIV.png")));
        iconsList.add(new ImageIcon(getClass().getResource("/resources/images/rotors/rotorV.png")));
        
        //Agregacion de los listeners y TransferHandler para el DnD
        leftPlace.addMouseMotionListener(dnd);
        leftPlace.setTransferHandler(transfer);
        middlePlace.addMouseMotionListener(dnd);
        middlePlace.setTransferHandler(transfer);
        rightPlace.addMouseMotionListener(dnd);
        rightPlace.setTransferHandler(transfer);
        
        //Seteo de las imagenes a los rotores y los listeners para el DnD
        rotorI.setIcon(iconsList.get(0));
        rotorI.addMouseMotionListener(dnd);
        rotorI.setTransferHandler(transfer);
        rotorII.setIcon(iconsList.get(1));
        rotorII.addMouseMotionListener(dnd);
        rotorII.setTransferHandler(transfer);
        rotorIII.setIcon(iconsList.get(2));
        rotorIII.addMouseMotionListener(dnd);
        rotorIII.setTransferHandler(transfer);
        rotorIV.setIcon(iconsList.get(3));
        rotorIV.addMouseMotionListener(dnd);
        rotorIV.setTransferHandler(transfer);
        rotorV.setIcon(iconsList.get(4));
        rotorV.addMouseMotionListener(dnd);
        rotorV.setTransferHandler(transfer);
    }
    
    /**
     * Clase interna que controla el movimiento DnD de los rotores con el mouse
     */
    private class DragAndDropMotion implements MouseMotionListener {

        @Override
        public void mouseDragged(MouseEvent e) {
            if (e.getModifiersEx() == MouseEvent.BUTTON1_DOWN_MASK) {
                JComponent c = (JComponent) e.getSource();
                TransferHandler handler = c.getTransferHandler();
                handler.exportAsDrag(c, e, TransferHandler.MOVE);
            }
        }

        @Override
        public void mouseMoved(MouseEvent e) {}

    }
    
    /**
     * Clase interna que controlará que se hace cuando se transfiere un rotor con
     * el DnD
     */
    private class TransferDragAndDrop extends TransferHandler {

        public TransferDragAndDrop(String text) {
            super(text);
        }

        @Override
        public boolean canImport(JComponent comp, DataFlavor[] transferFlavors){
            JLabel label = (JLabel)comp;
            
            return label.getIcon() == null;
        }
        
        @Override
        protected void exportDone(JComponent source, Transferable data, int action) {
            if (action == MOVE) {
                ((JLabel) source).setIcon(null);
            }
        }

        @Override
        public int getSourceActions(JComponent c) {
            return COPY | MOVE;
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel checkButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel leftPlace;
    private javax.swing.JLabel middlePlace;
    private javax.swing.JLabel rightPlace;
    private javax.swing.JLabel rotorI;
    private javax.swing.JLabel rotorII;
    private javax.swing.JLabel rotorIII;
    private javax.swing.JLabel rotorIV;
    private javax.swing.JLabel rotorV;
    // End of variables declaration//GEN-END:variables
}
