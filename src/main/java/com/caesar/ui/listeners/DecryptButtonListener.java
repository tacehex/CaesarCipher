package com.caesar.ui.listeners;

import com.caesar.core.CaesarCipher;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DecryptButtonListener implements ActionListener {
    private final JTextArea inputTextArea;
    private final JTextArea outputTextArea;
    private final CaesarCipher cipher;

    public DecryptButtonListener(JTextArea inputTextArea, JTextArea outputTextArea, CaesarCipher cipher) {
        this.inputTextArea = inputTextArea;
        this.outputTextArea = outputTextArea;
        this.cipher = cipher;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Расшифровка текста...");
        String text = inputTextArea.getText();

        // TODO: логика Caesar
    }
}
