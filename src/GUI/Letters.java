/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.util.HashMap;
import java.util.Map;
import javax.swing.JLabel;

/**
 *
 * @author facud
 */
public abstract class Letters extends javax.swing.JPanel {
    private Map<Character, JLabel> letters;
    /**
     * Creates new form Keyboard
     */
    public Letters() {
        this.letters = new HashMap<>();
        initComponents();
    }

    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        letterL = new javax.swing.JLabel();
        letterM = new javax.swing.JLabel();
        letterN = new javax.swing.JLabel();
        letterB = new javax.swing.JLabel();
        letterV = new javax.swing.JLabel();
        letterC = new javax.swing.JLabel();
        letterX = new javax.swing.JLabel();
        letterY = new javax.swing.JLabel();
        letterP = new javax.swing.JLabel();
        letterO = new javax.swing.JLabel();
        letterI = new javax.swing.JLabel();
        letterU = new javax.swing.JLabel();
        letterZ = new javax.swing.JLabel();
        letterT = new javax.swing.JLabel();
        letterR = new javax.swing.JLabel();
        letterE = new javax.swing.JLabel();
        letterW = new javax.swing.JLabel();
        letterQ = new javax.swing.JLabel();
        letterK = new javax.swing.JLabel();
        letterJ = new javax.swing.JLabel();
        letterH = new javax.swing.JLabel();
        letterG = new javax.swing.JLabel();
        letterF = new javax.swing.JLabel();
        letterD = new javax.swing.JLabel();
        letterS = new javax.swing.JLabel();
        letterA = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(688, 253));
        setMinimumSize(new java.awt.Dimension(688, 253));
        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(688, 253));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        letters.put('L', letterL);
        add(letterL, new org.netbeans.lib.awtextra.AbsoluteConstraints(576, 130, -1, -1));

        letters.put('M', letterM);
        add(letterM, new org.netbeans.lib.awtextra.AbsoluteConstraints(509, 130, -1, -1));

        letters.put('N', letterN);
        add(letterN, new org.netbeans.lib.awtextra.AbsoluteConstraints(442, 130, -1, -1));

        letters.put('B', letterB);
        add(letterB, new org.netbeans.lib.awtextra.AbsoluteConstraints(375, 130, -1, -1));

        letters.put('V', letterV);
        add(letterV, new org.netbeans.lib.awtextra.AbsoluteConstraints(308, 130, -1, -1));

        letters.put('C', letterC);
        add(letterC, new org.netbeans.lib.awtextra.AbsoluteConstraints(241, 130, -1, -1));

        letters.put('X', letterX);
        add(letterX, new org.netbeans.lib.awtextra.AbsoluteConstraints(174, 130, -1, -1));

        letters.put('Y', letterY);
        add(letterY, new org.netbeans.lib.awtextra.AbsoluteConstraints(107, 130, -1, -1));

        letters.put('P', letterP);
        add(letterP, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, -1, -1));

        letterO.setToolTipText("");
        letters.put('O', letterO);
        add(letterO, new org.netbeans.lib.awtextra.AbsoluteConstraints(591, 10, -1, -1));

        letters.put('I', letterI);
        add(letterI, new org.netbeans.lib.awtextra.AbsoluteConstraints(524, 10, -1, -1));

        letters.put('U', letterU);
        add(letterU, new org.netbeans.lib.awtextra.AbsoluteConstraints(457, 10, -1, -1));

        letters.put('Z', letterZ);
        add(letterZ, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 10, -1, -1));

        letters.put('T', letterT);
        add(letterT, new org.netbeans.lib.awtextra.AbsoluteConstraints(323, 10, -1, -1));

        letters.put('R', letterR);
        add(letterR, new org.netbeans.lib.awtextra.AbsoluteConstraints(256, 10, -1, -1));

        letters.put('E', letterE);
        add(letterE, new org.netbeans.lib.awtextra.AbsoluteConstraints(189, 10, -1, -1));

        letters.put('W', letterW);
        add(letterW, new org.netbeans.lib.awtextra.AbsoluteConstraints(122, 10, -1, -1));

        letters.put('Q', letterQ);
        add(letterQ, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 10, -1, -1));

        letters.put('K', letterK);
        add(letterK, new org.netbeans.lib.awtextra.AbsoluteConstraints(548, 70, -1, -1));

        letters.put('J', letterJ);
        add(letterJ, new org.netbeans.lib.awtextra.AbsoluteConstraints(482, 70, -1, -1));

        letters.put('H', letterH);
        add(letterH, new org.netbeans.lib.awtextra.AbsoluteConstraints(415, 70, -1, -1));

        letters.put('G', letterG);
        add(letterG, new org.netbeans.lib.awtextra.AbsoluteConstraints(348, 70, -1, -1));

        letters.put('F', letterF);
        add(letterF, new org.netbeans.lib.awtextra.AbsoluteConstraints(281, 70, -1, -1));

        letters.put('D', letterD);
        add(letterD, new org.netbeans.lib.awtextra.AbsoluteConstraints(214, 70, -1, -1));

        letters.put('S', letterS);
        add(letterS, new org.netbeans.lib.awtextra.AbsoluteConstraints(147, 70, -1, -1));

        letters.put('A', letterA);
        add(letterA, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 70, -1, -1));
    }// </editor-fold>//GEN-END:initComponents
    
    public Map<Character, JLabel> getLetters(){
        return this.letters;
    }
    
    protected abstract void loadImages();
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    protected javax.swing.JLabel letterA;
    protected javax.swing.JLabel letterB;
    protected javax.swing.JLabel letterC;
    protected javax.swing.JLabel letterD;
    protected javax.swing.JLabel letterE;
    protected javax.swing.JLabel letterF;
    protected javax.swing.JLabel letterG;
    protected javax.swing.JLabel letterH;
    protected javax.swing.JLabel letterI;
    protected javax.swing.JLabel letterJ;
    protected javax.swing.JLabel letterK;
    protected javax.swing.JLabel letterL;
    protected javax.swing.JLabel letterM;
    protected javax.swing.JLabel letterN;
    protected javax.swing.JLabel letterO;
    protected javax.swing.JLabel letterP;
    protected javax.swing.JLabel letterQ;
    protected javax.swing.JLabel letterR;
    protected javax.swing.JLabel letterS;
    protected javax.swing.JLabel letterT;
    protected javax.swing.JLabel letterU;
    protected javax.swing.JLabel letterV;
    protected javax.swing.JLabel letterW;
    protected javax.swing.JLabel letterX;
    protected javax.swing.JLabel letterY;
    protected javax.swing.JLabel letterZ;
    // End of variables declaration//GEN-END:variables
}
