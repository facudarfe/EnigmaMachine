/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enigma;

import java.util.Map;
import org.apache.commons.collections4.BidiMap;
import org.apache.commons.collections4.bidimap.DualHashBidiMap;

/**
 * Clase que modelo el panel de conexiones de cables para hacer el swap de caracteres
 * antes de entrar a los rotores y despues de salir de los rotores
 * @author facud
 */
public class Plugboard {
    private Map<Character, Character> connections;
    
    public Plugboard(){
        this.connections = new DualHashBidiMap<>();
    }
    
    /**
     * Agregar una nueva conexion en el plugboard
     * @param letter1 Primer caracter a conectar
     * @param letter2 Segundo caracter a conectar
     */
    public void addConnection(char letter1, char letter2){
        connections.put(letter1, letter2);
    }
    
    /**
     * Obtener el swap de un caracter determinado
     * @param letter Caracter a intercambiar
     * @return Caracter intercambiado si es que existe una conexion,
     * sino retorna el mismo caracter letter
     */
    public char getSwappedLetter(char letter){
        Character swappedLetter = connections.get(letter);
        
        if(swappedLetter != null)
            return swappedLetter;
        else{
            swappedLetter = (Character) ((BidiMap)connections).getKey(letter);
            if(swappedLetter != null)
                return swappedLetter;
            else
                return letter;
        }
    }
    
    /**
     * Resetear plugboard y eliminar todas las conexiones existentes
     */
    public void resetPlugboard(){
        this.connections = new DualHashBidiMap<>();
    }

    public Map<Character, Character> getConnections() {
        return connections;
    }
    
}
