/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bloons;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author utente
 */
public class Campo extends JPanel{
    
    public int x,y;
    public Campo(int width,int height){
        setSize(x,y);
        x=width;y=height;
        this.repaint();
    }
    
    
    @Override
    public void paint(Graphics g){
        g.setColor(Color.yellow);
        g.fillRect(0,0 ,x/2, y/2);
        g.setColor(Color.BLACK);     
        g.fillRect(0,y/4 ,100, 20);//1° linea
        g.fillRect(100,y/8+16, 20, 100);//2° linea
        g.fillRect(120,y/8+16 , 300, 20);//3° linea
        g.fillRect(420,y/8+16,20,200);//4° linea
        g.fillRect(0,y/8+200 ,440, 20);//5° linea
    }
}
