package org.example;

import java.util.ArrayList;

public class Encode {
    private int key;
    private String message;
    private String generateKey;


    public Encode(String message) {
        this.message = message;
        generateKey();
    }

    private void generateKey() {
        keyGenerator test = new keyGenerator();
        String generateKey = test.Generate();
        this.generateKey = generateKey;
        char digitChar = generateKey.charAt(2);

        if (Character.isDigit(digitChar)) {
            this.key = Character.getNumericValue(digitChar);
        } else {
            this.key = 0;
        }


        System.out.println("Сгенерированный ключ смещения: " + this.key);
    }

    public StringBuilder encode() {
        Text text = new Text();

        if (message == null || message.isEmpty()) {
            return new StringBuilder(text.itsEmpty());
        }

        ArrayList<String> messageList = new ArrayList<>();
        String[] russianAlphabet = text.alphabet();
        String[] RUSSIANALPHABET = text.ALPHABET();

        for (int i = 0; i < message.length(); i++) {
            char currentChar = message.charAt(i);
            String charStr = String.valueOf(currentChar);

            if (currentChar == ' ') {
                messageList.add(" ");
                continue;
            }

            boolean found = false;

            for (int j = 0; j < russianAlphabet.length && !found; j++) {
                if (charStr.equals(russianAlphabet[j])) {
                    int newIndex = (j + key) % 33;
                    messageList.add(russianAlphabet[newIndex]);
                    found = true;
                }
            }

            for (int j = 0; j < RUSSIANALPHABET.length && !found; j++) {
                if (charStr.equals(RUSSIANALPHABET[j])) {
                    int newIndex = (j + key) % 33;
                    messageList.add(RUSSIANALPHABET[newIndex]);
                    found = true;
                }
            }

            if (!found) {
                messageList.add(charStr);
            }
        }

        StringBuilder encodedMessage = new StringBuilder();
        for (String s : messageList) {
            encodedMessage.append(s);
        }

        return encodedMessage;
    }

    public int getKey() {
        return key;
    }

    public String getOriginalMessage() {
        return message;
    }

    public String getEncodeKey() {
        return generateKey;
    }
}


