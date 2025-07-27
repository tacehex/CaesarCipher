package com.caesar.core;

import java.util.Arrays;

public class CaesarCipher {

    private static final char[] RUSSIAN_ALPHABET = {'а', 'б', 'в', 'г', 'д', 'е', 'ж', 'з',
            'и','к', 'л', 'м', 'н', 'о', 'п', 'р', 'с', 'т', 'у', 'ф', 'х', 'ц', 'ч', 'ш', 'щ',
            'ъ', 'ы', 'ь', 'э', 'я', '.', ',', '«', '»', '"', '\'', ':', '!', '?', ' '};

    /**
     * Зашифровка текста.
     * @param text текст для зашифровки.
     * @param key ключ (сдвиг).
     * @return зашифрованный текст.
     */
    public String encrypt(String text, int key) {
        return processText(text, key);
    }

    /**
     * Расшифровка текста.
     * @param text текст для расшифровки.
     * @param key ключ (сдвиг).
     * @return расшифрованный текст.
     */
    public String decrypt(String text, int key) {
        return processText(text, -key); // Используем отрицательный ключ для расшифровки
    }

    /**
     * Основной метод обработки текста.
     * @param text исходный текст.
     * @param key ключ (может быть положительным или отрицательным).
     * @return обработанный текст.
     */
    private String processText(String text, int key) {
        StringBuilder result = new StringBuilder();
        text = text.toLowerCase();

        for (char c : text.toCharArray()) {
            int index = Arrays.binarySearch(RUSSIAN_ALPHABET, c);

            if (index >= 0) {
                int newIndex = (index + key) % RUSSIAN_ALPHABET.length;

                if (newIndex < 0) {
                    newIndex += RUSSIAN_ALPHABET.length;
                }

                result.append(RUSSIAN_ALPHABET[newIndex]);
            } else {
                result.append(c);
            }
        }

        return result.toString();
    }
}
