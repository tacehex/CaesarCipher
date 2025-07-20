package com.caesar.ui.listeners;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BruteForceButtonListener implements ActionListener {
    private final JTextArea inputTextArea;
    private final JTextArea outputTextArea;

    public BruteForceButtonListener(JTextArea inputTextArea, JTextArea outputTextArea) {
        this.inputTextArea = inputTextArea;
        this.outputTextArea = outputTextArea;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("BruteForce...");
        String text = inputTextArea.getText();

        // TODO: логика BruteForce
    }
}
