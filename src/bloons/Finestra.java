/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bloons;

import java.awt.Toolkit;
import javax.swing.JFrame;

/**
 *
 * @author utente
 */
public class Finestra extends JFrame{
    public int width = (int) Toolkit.getDefaultToolkit().getScreenSize().getWidth();
    public int height = (int) Toolkit.getDefaultToolkit().getScreenSize().getHeight();
    public Campo campo;
    
    public Finestra(){
        setSize(width,height);
        campo=new Campo(width,height);
        add(campo);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }    
}
