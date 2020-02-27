package flappyBird;

import java.awt.Graphics;

import javax.swing.JPanel;

/**
 * Write a description of class Renderer here.
 *
 * @author HanifImam
 * @version 0.01
 */
public class Renderer extends JPanel{
    private static final long serialVersionUID = 1L;
    
    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        
        FlappyBird.flappyBird.repaint(g); 
    }
}
