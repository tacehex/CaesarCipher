package com.caesar.ui.listeners;

import com.caesar.core.FileHandler;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoadFileButtonListener implements ActionListener {
    private final JTextArea inputTextArea;
    private final FileHandler handler;

    public LoadFileButtonListener(JTextArea inputTextArea, FileHandler handler) {
        this.inputTextArea = inputTextArea;
        this.handler = handler;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Загрузка файла...");

        // TODO: логика загрузки файла...
    }
}
