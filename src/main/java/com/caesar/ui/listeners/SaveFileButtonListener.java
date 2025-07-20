package com.caesar.ui.listeners;

import com.caesar.core.FileHandler;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SaveFileButtonListener implements ActionListener {
    private final JTextArea outputTextArea;
    private final FileHandler handler;

    public SaveFileButtonListener(JTextArea outputTextArea, FileHandler handler) {
        this.outputTextArea = outputTextArea;
        this.handler = handler;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Загрузка файла...");

        // TODO: логика сохранения файла...
    }
}
