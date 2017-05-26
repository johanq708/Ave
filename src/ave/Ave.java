/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ave;

import javax.swing.*;
/**
 *
 * @author Johan Quiñonez
 */
public class Ave extends JFrame {

    public Ave() {
        add(new avePanel());
    }

    public static void main(String[] args) {
        Ave frame = new Ave();
        frame.setTitle("Ave");
        frame.setSize(1000, 650);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

}
