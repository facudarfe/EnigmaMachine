/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.util.Map;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author facud
 */
public class Leds extends Letters{
    
    public Leds(){
        super();
        loadImages();
    }
    
    @Override
    protected void loadImages(){
        for(Map.Entry<Character, JLabel> entry : getLetters().entrySet()){
            char key = entry.getKey();
            char keyUpper = Character.toUpperCase(key);
            entry.getValue().setIcon(new ImageIcon(getClass().getResource("/resources/"
                    + "images/leds/led"+keyUpper+"off.png")));
        }  
    }
}
