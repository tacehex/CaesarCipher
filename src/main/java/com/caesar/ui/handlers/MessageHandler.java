package com.caesar.ui.handlers;

import javax.swing.*;

public class MessageHandler {
    public static void showErrorDialog(String message) {
        JOptionPane.showMessageDialog(
                null,
                message,
                "Ошибка",
                JOptionPane.ERROR_MESSAGE
        );
    }
}
