package com.caesar.ui.listeners;

import com.caesar.core.CaesarCipher;
import com.caesar.ui.handlers.MessageHandler;

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
        String text = inputTextArea.getText();

        if (text == null || text.trim().isEmpty()) {
            MessageHandler.showErrorDialog("Текст для зашифровки оказался пустым.");
            return;
        }

        String keyString = JOptionPane.showInputDialog("Введите числовое значения ключа:");

        try {
            int keyInt = Integer.parseInt(keyString);
            String decryptText = cipher.decrypt(text, keyInt);
            outputTextArea.setText(decryptText);
        } catch (NumberFormatException ex) {
            MessageHandler.showErrorDialog("Ошибка: ключ должен быть числом!");
        }
    }
}
