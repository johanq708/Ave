/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ave;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.Timer;

/**
 *
 * @author johit
 */
public class avePanel extends JPanel implements ActionListener{
    private int n;
    private int x=0;
    private int y=0;
    private int s;
    private Timer timer;

    public avePanel() {
        addKeyListener(new Teclas());
        setFocusable(true);
        timer = new Timer(100, this);
        timer.start();
    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Image ave = loadImage("ave.png");
        g.drawImage(ave, 10+x, 400-y, 110+x, 500-y, s*182, 0, (s*182)+182, 150, this);
        g.drawLine(0, 495, 1000, 495);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(y==0){
            this.s=0;
        }else
        if(y!=0){
            if(s==5){
                this.s=0;
            }else{
                this.s++;
            }    
        }
        repaint();
    }

    public Image loadImage(String nombre) {
        ImageIcon ii = new ImageIcon(nombre);
        Image image = ii.getImage();
        return image;
    }    

    private class Teclas extends KeyAdapter {

        public void keyTyped(KeyEvent e) {
            int key = e.getKeyCode();
        }

        public void keyPressed(KeyEvent e) {
            int key = e.getKeyCode();
            if(key==KeyEvent.VK_UP){
                if(y<400){
                    y+=2;
                }
            }
            if(key==KeyEvent.VK_DOWN){
                if(y>0){
                    y-=2;
                }
            }
            if(key==KeyEvent.VK_RIGHT){
                if((x<800)&&(y!=0)){
                    x+=2;
                }
            }
            if(key==KeyEvent.VK_LEFT){
                if((x>0)&&(y!=0)){
                    x-=2;
                }
            }
        }

        public void keyReleased(KeyEvent e) {

        }
    }
}

