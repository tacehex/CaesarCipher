package com.caesar.ui.listeners;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DecryptButtonListener implements ActionListener {
    private final JTextArea inputTextArea;
    private final JTextArea outputTextArea;

    public DecryptButtonListener(JTextArea inputTextArea, JTextArea outputTextArea) {
        this.inputTextArea = inputTextArea;
        this.outputTextArea = outputTextArea;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Расшифровка текста...");
        String text = inputTextArea.getText();

        // TODO: логика Caesar
    }
}
