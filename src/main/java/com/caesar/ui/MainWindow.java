package com.caesar.ui;

import javax.swing.*;
import java.awt.*;

public class MainWindow extends JFrame {
    private JTextArea inputTextArea;
    private JTextArea outputTextArea;
    private JButton encryptButton;
    private JButton decryptButton;
    private JButton bruteForceButton;
    private JButton loadFileButton;
    private JButton saveFileButton;


    public MainWindow() {
        super("Шифр цезаря");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 600);
        setLayout(new BorderLayout()); // автоматическое управление расположением компонентов внутри контейнера

        initUI();
        setupListeners();
    }

    /**
     * Инициализация UI заданными компонентами.
     */
    private void initUI() {
        // Панель с кнопками
        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 10));

        encryptButton = new JButton("Зашифровать");
        decryptButton = new JButton("Расшифровать");
        bruteForceButton = new JButton("Brute Force");
        loadFileButton = new JButton("Загрузить файл");
        saveFileButton = new JButton("Сохранить в файл");

        buttonPanel.add(loadFileButton);
        buttonPanel.add(encryptButton);
        buttonPanel.add(decryptButton);
        buttonPanel.add(bruteForceButton);
        buttonPanel.add(saveFileButton);

        inputTextArea = new JTextArea();
        outputTextArea = new JTextArea();
        JScrollPane inputScrollPane = new JScrollPane(inputTextArea);
        JScrollPane outputScrollPane = new JScrollPane(outputTextArea);

        JPanel textPanel = new JPanel(new GridLayout(1, 2, 10, 10));
        textPanel.add(inputScrollPane);
        textPanel.add(outputScrollPane);

        add(buttonPanel, BorderLayout.NORTH);
        add(textPanel, BorderLayout.CENTER);
    }

    /**
     * Установка прослушиваний при нажатии на кнопки
     */
    private void setupListeners() {
        loadFileButton.addActionListener(e -> {
            System.out.println("Загрузка файла...");
        });

        decryptButton.addActionListener(e -> {
            System.out.println("Текст для шифровки: " + inputTextArea.getText());
        });

        encryptButton.addActionListener(e -> {
            System.out.println("Текст для расшифровки: " + inputTextArea.getText());
        });

        bruteForceButton.addActionListener(e -> {
            System.out.println("метод bruteForce: " + inputTextArea.getText());
        });

        saveFileButton.addActionListener(e -> {
            System.out.println("Сохранение файла...");
        });
    }
}
