package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class MyMenuBar extends JMenuBar {
    private final JFrame jFrame;

    private JMenu createMenu(){
        JMenu jMenu = new JMenu("functions");

        JRadioButtonMenuItem jRadioButtonMenuItemEx3 = new JRadioButtonMenuItem(new AbstractAction("ex3") {
            @Override
            public void actionPerformed(ActionEvent e) {
                JPanel contentPane = (JPanel) jFrame.getContentPane();

                contentPane.removeAll();
                contentPane.add(new MyPanel().ex3());
                contentPane.revalidate();
                contentPane.repaint();
            }
        });
        jRadioButtonMenuItemEx3.setSelected(true);

        JRadioButtonMenuItem jRadioButtonMenuItemEx6 = new JRadioButtonMenuItem(new AbstractAction("ex6") {
            @Override
            public void actionPerformed(ActionEvent e) {
                JPanel contentPane = (JPanel) jFrame.getContentPane();

                contentPane.removeAll();
                contentPane.add(new MyPanel().ex6());
                contentPane.revalidate();
                contentPane.repaint();
            }
        });

        JRadioButtonMenuItem jRadioButtonMenuItemEx9 = new JRadioButtonMenuItem(new AbstractAction("ex9") {
            @Override
            public void actionPerformed(ActionEvent e) {
                JPanel contentPane = (JPanel) jFrame.getContentPane();

                contentPane.removeAll();
                contentPane.add(new MyPanel().ex9());
                contentPane.revalidate();
                contentPane.repaint();
            }
        });

        JRadioButtonMenuItem jRadioButtonMenuItemEx12 = new JRadioButtonMenuItem(new AbstractAction("ex12") {
            @Override
            public void actionPerformed(ActionEvent e) {
                JPanel contentPane = (JPanel) jFrame.getContentPane();

                contentPane.removeAll();
                contentPane.add(new MyPanel().ex12());
                contentPane.revalidate();
                contentPane.repaint();
            }
        });

        JRadioButtonMenuItem jRadioButtonMenuItemEx15 = new JRadioButtonMenuItem(new AbstractAction("ex15") {
            @Override
            public void actionPerformed(ActionEvent e) {
                JPanel contentPane = (JPanel) jFrame.getContentPane();

                contentPane.removeAll();
                contentPane.add(new MyPanel().ex15());
                contentPane.revalidate();
                contentPane.repaint();
            }
        });

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(jRadioButtonMenuItemEx3);
        buttonGroup.add(jRadioButtonMenuItemEx6);
        buttonGroup.add(jRadioButtonMenuItemEx9);
        buttonGroup.add(jRadioButtonMenuItemEx12);
        buttonGroup.add(jRadioButtonMenuItemEx15);

        jMenu.add(jRadioButtonMenuItemEx3);
        jMenu.add(jRadioButtonMenuItemEx6);
        jMenu.add(jRadioButtonMenuItemEx9);
        jMenu.add(jRadioButtonMenuItemEx12);
        jMenu.add(jRadioButtonMenuItemEx15);

        return jMenu;
    }

    public MyMenuBar(JFrame jFrame) {
        this.jFrame = jFrame;

        add(createMenu());
    }
}
