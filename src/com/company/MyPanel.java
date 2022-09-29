package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.Map;

public class MyPanel extends JPanel {
    GridBagConstraints constraints = new GridBagConstraints();

    private JButton solveButton = new JButton("Solve");
    private JLabel jLabelResultHead = new JLabel("Result:");
    private JLabel jLabelResult = new JLabel("");
    private JLabel jLabelA = new JLabel("A = ");
    private JLabel jLabelB = new JLabel("B = ");
    private JLabel jLabelC = new JLabel("C = ");
    private JLabel jLabelX = new JLabel("X = ");
    private JLabel jLabelY = new JLabel("Y = ");
    private JLabel jLabelR = new JLabel("R = ");
    private JTextField jTextFieldA = new JTextField(10);
    private JTextField jTextFieldB = new JTextField(10);
    private JTextField jTextFieldC = new JTextField(10);
    private JTextField jTextFieldX = new JTextField(10);
    private JTextField jTextFieldY = new JTextField(10);
    private JTextField jTextFieldR = new JTextField(10);

    public MyPanel() {
        this.setLayout(new GridBagLayout());
        constraints.anchor = GridBagConstraints.WEST;
        constraints.insets = new Insets(10, 10, 10, 10);
    }

    public MyPanel ex3(){
        constraints.gridx = 0;
        constraints.gridy = 0;
        this.add(jLabelA, constraints);
        constraints.gridx = 1;
        this.add(jTextFieldA, constraints);

        constraints.gridx = 0;
        constraints.gridy = 1;
        this.add(jLabelB, constraints);
        constraints.gridx = 1;
        this.add(jTextFieldB, constraints);

        constraints.gridx = 0;
        constraints.gridy = 2;
        this.add(jLabelC, constraints);
        constraints.gridx = 1;
        this.add(jTextFieldC, constraints);

        constraints.gridx = 0;
        constraints.gridy = 3;
        this.add(jLabelX, constraints);
        constraints.gridx = 1;
        this.add(jTextFieldX, constraints);

        constraints.gridx = 0;
        constraints.gridy = 5;
        this.add(jLabelY, constraints);
        constraints.gridx = 1;
        this.add(jTextFieldY, constraints);

        constraints.gridx = 2;
        constraints.gridy = 0;
        this.add(jLabelResultHead, constraints);
        constraints.gridy = 1;
        this.add(jLabelResult, constraints);

        solveButton.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String result = new Functions().ex3(
                        Double.parseDouble(jTextFieldA.getText()),
                        Double.parseDouble(jTextFieldB.getText()),
                        Double.parseDouble(jTextFieldC.getText()),
                        Double.parseDouble(jTextFieldX.getText()),
                        Double.parseDouble(jTextFieldY.getText()));
                jLabelResult.setText(result);
            }
        });

        constraints.gridx = 0;
        constraints.gridy = 6;
        constraints.gridwidth = 2;
        constraints.anchor = GridBagConstraints.CENTER;
        this.add(solveButton, constraints);
        return this;
    }

    public MyPanel ex6(){
        constraints.gridx = 0;
        constraints.gridy = 0;
        this.add(jLabelA, constraints);
        constraints.gridx = 1;
        this.add(jTextFieldA, constraints);

        constraints.gridx = 0;
        constraints.gridy = 1;
        this.add(jLabelB, constraints);
        constraints.gridx = 1;
        this.add(jTextFieldB, constraints);

        constraints.gridx = 0;
        constraints.gridy = 2;
        this.add(jLabelC, constraints);
        constraints.gridx = 1;
        this.add(jTextFieldC, constraints);

        constraints.gridx = 2;
        constraints.gridy = 0;
        this.add(jLabelResultHead, constraints);
        constraints.gridy = 1;
        this.add(jLabelResult, constraints);

        solveButton.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Map<String, Double> result = new Functions().ex6(
                        Double.parseDouble(jTextFieldA.getText()),
                        Double.parseDouble(jTextFieldB.getText()),
                        Double.parseDouble(jTextFieldC.getText()));
                jLabelResult.setText("A = " + result.get("A").toString());
            }
        });

        constraints.gridx = 0;
        constraints.gridy = 3;
        constraints.gridwidth = 2;
        constraints.anchor = GridBagConstraints.CENTER;
        this.add(solveButton, constraints);
        return this;
    }

    public MyPanel ex9(){
        constraints.gridx = 0;
        constraints.gridy = 0;
        this.add(jLabelA, constraints);
        constraints.gridx = 1;
        this.add(jTextFieldA, constraints);

        constraints.gridx = 0;
        constraints.gridy = 1;
        this.add(jLabelR, constraints);
        constraints.gridx = 1;
        this.add(jTextFieldR, constraints);

        constraints.gridx = 2;
        constraints.gridy = 0;
        this.add(jLabelResultHead, constraints);
        constraints.gridy = 1;
        this.add(jLabelResult, constraints);

        solveButton.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String result = new Functions().ex9(
                        Double.parseDouble(jTextFieldA.getText()),
                        Double.parseDouble(jTextFieldR.getText()));
                jLabelResult.setText(result);
            }
        });

        constraints.gridx = 0;
        constraints.gridy = 2;
        constraints.gridwidth = 2;
        constraints.anchor = GridBagConstraints.CENTER;
        this.add(solveButton, constraints);
        return this;
    }

    public MyPanel ex12(){
        constraints.gridx = 0;
        constraints.gridy = 0;
        this.add(jLabelA, constraints);
        constraints.gridx = 1;
        this.add(jTextFieldA, constraints);

        constraints.gridx = 0;
        constraints.gridy = 1;
        this.add(jLabelB, constraints);
        constraints.gridx = 1;
        this.add(jTextFieldB, constraints);

        constraints.gridx = 2;
        constraints.gridy = 0;
        this.add(jLabelResultHead, constraints);
        constraints.gridy = 1;
        this.add(jLabelResult, constraints);

        solveButton.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Map<String, Double> result = new Functions().ex12(
                        Double.parseDouble(jTextFieldA.getText()),
                        Double.parseDouble(jTextFieldB.getText()));
                jLabelResult.setText("A = " + result.get("A") + "  B = " + result.get("B"));
            }
        });

        constraints.gridx = 0;
        constraints.gridy = 2;
        constraints.gridwidth = 2;
        constraints.anchor = GridBagConstraints.CENTER;
        this.add(solveButton, constraints);
        return this;
    }

    public MyPanel ex15(){
        constraints.gridx = 0;
        constraints.gridy = 0;
        this.add(jLabelA, constraints);
        constraints.gridx = 1;
        this.add(jTextFieldA, constraints);

        constraints.gridx = 0;
        constraints.gridy = 1;
        this.add(jLabelB, constraints);
        constraints.gridx = 1;
        this.add(jTextFieldB, constraints);

        constraints.gridx = 2;
        constraints.gridy = 0;
        this.add(jLabelResultHead, constraints);
        constraints.gridy = 1;
        this.add(jLabelResult, constraints);

        solveButton.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Map<String, Double> result = new Functions().ex15(
                        Double.parseDouble(jTextFieldA.getText()),
                        Double.parseDouble(jTextFieldB.getText()));
                jLabelResult.setText("A = " + result.get("A") + "  B = " + result.get("B"));
            }
        });

        constraints.gridx = 0;
        constraints.gridy = 6;
        constraints.gridwidth = 2;
        constraints.anchor = GridBagConstraints.CENTER;
        this.add(solveButton, constraints);
        return this;
    }
}
