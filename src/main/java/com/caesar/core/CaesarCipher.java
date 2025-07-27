package com.caesar.core;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class CaesarCipher {
    private static final char[] RUSSIAN_ALPHABET = {
            'а', 'б', 'в', 'г', 'д', 'е', 'ж', 'з', 'и', 'й', 'к', 'л', 'м', 'н', 'о', 'п',
            'р', 'с', 'т', 'у', 'ф', 'х', 'ц', 'ч', 'ш', 'щ', 'ъ', 'ы', 'ь', 'э', 'ю', 'я',
            '.', ',', '«', '»', '"', '\'', ':', '!', '?', ' '
    };

    private static final Set<Character> ALLOWED_CHARS = new HashSet<>();

    static {
        for (char c : RUSSIAN_ALPHABET) {
            ALLOWED_CHARS.add(c);
        }
    }

    public String encrypt(String text, int key) throws IllegalArgumentException {
        validateText(text);
        return processText(text, key);
    }

    public String decrypt(String text, int key) throws IllegalArgumentException {
        validateText(text);
        return processText(text, -key);
    }

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

    /**
     * Проверка текста на содержание только разрешённых символов
     * @throws IllegalArgumentException если найден недопустимый символ
     */
    private void validateText(String text) throws IllegalArgumentException {
        for (int i = 0; i < text.length(); i++) {
            char c = Character.toLowerCase(text.charAt(i));

            if (!ALLOWED_CHARS.contains(c)) {
                throw new IllegalArgumentException(
                        String.format("Недопустимый символ '%c' в позиции %d. " +
                                        "Разрешены только русские буквы и знаки пунктуации: %s",
                                text.charAt(i), i, Arrays.toString(RUSSIAN_ALPHABET))
                );
            }
        }
    }
}