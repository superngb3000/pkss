package com.company;

import javax.swing.*;
import java.awt.*;

public class FunctionsFrame {

    private void createGUI(){
        JFrame jFrame = new JFrame("Functions");
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JMenuBar jMenuBar = new MyMenuBar(jFrame);
        jFrame.setJMenuBar(jMenuBar);

        JPanel jPanel = new MyPanel().ex3();
        jFrame.setContentPane(jPanel);

        jFrame.setPreferredSize(new Dimension(500, 400));
        jFrame.pack();
        jFrame.setVisible(true);
    }

    public FunctionsFrame() {
        JFrame.setDefaultLookAndFeelDecorated(true);
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createGUI();
            }
        });
    }
}
