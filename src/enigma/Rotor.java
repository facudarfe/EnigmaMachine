/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enigma;

/**
 * Clase que representa cada uno de los rotores de la maquina enigma
 * @author facud
 */
public class Rotor {
    private final int moves;
    private String outerRotor, innerRotor;
    private int remainingMoves;
    
    /**
     * 
     * @param outerRotor Alfabeto externo del rotor
     * @param innerRotor Alfabeto interno del rotor
     * @param firstLetter Primera letra con la que empezará el rotor
     */
    public Rotor(String outerRotor, String innerRotor, char firstLetter){
        this.outerRotor = outerRotor;
        this.innerRotor = innerRotor;
        this.moves = this.outerRotor.length();
        this.remainingMoves = this.outerRotor.length();
        positionRotor(firstLetter);
    }
    
    /**
     * 
     * @param outerRotor Alfabeto externo del rotor
     * @param innerRotor Alfabeto interno del rotor
     */
    public Rotor(String outerRotor, String innerRotor){
        this(outerRotor, innerRotor, 'A');
    }
    
    /**
     * Crear el rotor en base a otro rotor
     * @param another Otro rotor
     */
    public Rotor(Rotor another){
        this(another.getOuterRotor(), another.getInnerRotor());
    }
    
    /**
     * Posicionar el rotor respecto a una letra
     * @param firstLetter Primera letra con la que empezará a cifrar el rotor
     */
    public void positionRotor(char firstLetter){
       int pos = this.outerRotor.indexOf(firstLetter);
       
       this.innerRotor = this.innerRotor.substring(pos) + this.innerRotor.substring(0, pos);
       this.outerRotor = this.outerRotor.substring(pos) + this.outerRotor.substring(0, pos);
    }
    
    /**
     * Rotar el rotor en una letra
     */
    public void rotateRotor(){
        this.innerRotor = this.innerRotor.substring(1) + this.innerRotor.charAt(0);
        this.outerRotor = this.outerRotor.substring(1) + this.outerRotor.charAt(0);
        this.remainingMoves -= 1;
    }
    
    /**
     * Obtener la posicion de la letra del alfabeto interno conectada a una letra 
     * del alfabeto externo
     * @param letter Letra del alfabeto externo
     * @return Posicion en el alfabeto externo, de la letra conexion
     */
    public int getInnerFromOuterPosition(char letter){
        int pos1 = this.outerRotor.indexOf(letter);
        char encryptedLetter = this.innerRotor.charAt(pos1);
        int pos2 = this.outerRotor.indexOf(encryptedLetter);
        
        return pos2;
    }
    
    /**
     * Obtener la posicion de la letra del alfabeto externo conectada a una letra
     * del alfabeto interno
     * @param letter Letra del alfabeto interno
     * @return Posicion en el alfabeto interno, de la letra conexion
     */
    public int getOuterFromInnerPosition(char letter){
        int pos1 = this.innerRotor.indexOf(letter);
        char encryptedLetter = this.outerRotor.charAt(pos1);
        int pos2 = this.innerRotor.indexOf(encryptedLetter);
        
        return pos2;
    }
    
    public char getOuterLetter(int pos){
        return this.outerRotor.charAt(pos);
    }
    
    public char getInnerLetter(int pos){
        return this.innerRotor.charAt(pos);
    }
    
    public String getOuterRotor(){
        return this.outerRotor;
    }
    
    public String getInnerRotor(){
        return this.innerRotor;
    }
    
    public int getRemainingMoves(){
        return this.remainingMoves;
    }
    
    public void setRemainingMoves(int moves){
        this.remainingMoves = moves;
    }
    
    public int getMoves(){
        return this.moves;
    }
}
