/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enigma;

/**
 * Clase que modela la maquina enigma con sus respectivos rotores, reflector
 * plugboard, teclado y leds
 * @author facud
 */
public class Enigma {
    private static final String ALPHABET = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private final Rotor[] allRotors;
    private Rotor leftRotor, middleRotor, rightRotor;
    private Rotor reflector;
    private Plugboard plugboard;
    
    public Enigma(){
        this.allRotors = new Rotor[5];
        this.allRotors[0] = new Rotor(ALPHABET, "EKMFLGDQVZNTOWYHXUSPAIBRCJ");
        this.allRotors[1] = new Rotor(ALPHABET, "AJDKSIRUXBLHWTMCQGZNPYFVOE");
        this.allRotors[2] = new Rotor(ALPHABET, "BDFHJLCPRTXVZNYEIWGAKMUSQO");
        this.allRotors[3] = new Rotor(ALPHABET, "ESOVPZJAYQUIRHXLNFTGKDCMWB");
        this.allRotors[4] = new Rotor(ALPHABET, "VZBRGITYUPSDNHLXAWMJQOFECK");
        
        this.leftRotor = new Rotor(this.allRotors[0]);
        this.middleRotor = new Rotor(this.allRotors[1]);
        this.rightRotor = new Rotor(this.allRotors[2]);
        this.reflector = new Rotor(ALPHABET, "YRUHQSLDPXNGOKMIEBFZCWVJAT");
        
        this.plugboard = new Plugboard();
    }
    
    /**
     * Encriptar un caracter en otro caracter respecto a la ultimo estado
     * de configuracion de enigma
     * @param letter Caracter a ser encriptado
     * @return Caracter encriptado
     */
    public char encryptLetter(char letter){
        letter = Character.toUpperCase(letter);
        char swappedLetter = plugboard.getSwappedLetter(letter);
        
        //Camino de ida
        int pos = ALPHABET.indexOf(swappedLetter);
        //Rotor derecho
        char letter1 = this.rightRotor.getOuterLetter(pos);
        pos = this.rightRotor.getInnerFromOuterPosition(letter1);
        //Rotor central
        letter1 = this.middleRotor.getOuterLetter(pos);
        pos = this.middleRotor.getInnerFromOuterPosition(letter1);
        //Rotor izquierdo
        letter1 = this.leftRotor.getOuterLetter(pos);
        pos = this.leftRotor.getInnerFromOuterPosition(letter1);
        
        //Reflector
        letter1 = this.reflector.getOuterLetter(pos);
        pos = this.reflector.getInnerFromOuterPosition(letter1);
        
        //Camino de vuelta
        //RotorIzquierdo
        letter1 = this.leftRotor.getInnerLetter(pos);
        pos = this.leftRotor.getOuterFromInnerPosition(letter1);
        //Rotor central
        letter1 = this.middleRotor.getInnerLetter(pos);
        pos = this.middleRotor.getOuterFromInnerPosition(letter1);
        //Rotor derecho
        letter1 = this.rightRotor.getInnerLetter(pos);
        pos = this.rightRotor.getOuterFromInnerPosition(letter1);
        
        letter1 = ALPHABET.charAt(pos); 
        letter1 = plugboard.getSwappedLetter(letter1);
        
        //Rotacion de los rotores
        this.rightRotor.rotateRotor();
        if(this.rightRotor.getRemainingMoves() == 0){
            this.rightRotor.setRemainingMoves(ALPHABET.length());
            this.middleRotor.rotateRotor();
        }
        if(this.middleRotor.getRemainingMoves() == 0){
            this.middleRotor.setRemainingMoves(ALPHABET.length());
            this.leftRotor.rotateRotor();
        }
        if(this.leftRotor.getRemainingMoves() == 0)
            this.leftRotor.setRemainingMoves(ALPHABET.length());
        
        return letter1;
    }
    
    /**
     * Cambiar los tres rotores de la maquina eligiendo 3 de los 5 disponibles
     * @param left De entre los 5 rotores, cual irá en la izquierda
     * @param middle De entre los 5 rotores, cual irá en el medio
     * @param right De entre los 5 rotores, cual irá en la derecha
     */
    public void changeRotors(int left, int middle, int right){
        this.leftRotor = new Rotor(this.allRotors[left]);
        this.middleRotor = new Rotor(this.allRotors[middle]);
        this.rightRotor = new Rotor(this.allRotors[right]);
    }
    
    /**
     * Resetear la maquina enigma con la configuración por defecto
     */
    public void resetEnigma(){
        this.leftRotor = new Rotor(this.allRotors[0]);
        this.middleRotor = new Rotor(this.allRotors[1]);
        this.rightRotor = new Rotor(this.allRotors[2]);
        this.plugboard = new Plugboard();
    }

    public Rotor getLeftRotor() {
        return leftRotor;
    }

    public Rotor getMiddleRotor() {
        return middleRotor;
    }

    public Rotor getRightRotor() {
        return rightRotor;
    }

    public Rotor getReflector() {
        return reflector;
    }

    public Plugboard getPlugboard() {
        return plugboard;
    }

    public void setReflector(Rotor reflector) {
        this.reflector = reflector;
    }

    public void setPlugboard(Plugboard plugboard) {
        this.plugboard = plugboard;
    }
  
}
