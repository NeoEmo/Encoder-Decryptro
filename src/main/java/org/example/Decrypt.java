package org.example;

import java.util.ArrayList;

public class Decrypt {
    private int key;
    private StringBuilder decryptedMessage;

    public Decrypt(String userMessage, String userKey) {
        this.key = decryptKey(userKey);
        this.decryptedMessage = decryptMessage(userMessage);
    }

    private int decryptKey(String userKey) {
        char digitChar = userKey.charAt(2);

        if (Character.isDigit(digitChar)) {
            this.key = Character.getNumericValue(digitChar);
        } else {
            this.key = 0;
        }

        return this.key;
    }

    private StringBuilder decryptMessage(String userMessage) {
        Text text = new Text();

        if (userMessage == null || userMessage.isEmpty()) {
            return new StringBuilder(text.itsEmpty());
        }

        ArrayList<String> messageList = new ArrayList<>();
        String[] russianAlphabet = text.alphabet();
        String[] RUSSIANALPHABET = text.ALPHABET();

        for (int i = 0; i < userMessage.length(); i++) {
            char currentChar = userMessage.charAt(i);
            String charStr = String.valueOf(currentChar);

            if (currentChar == ' ') {
                messageList.add(" ");
                continue;
            }

            boolean found = false;

            for (int j = 0; j < russianAlphabet.length && !found; j++) {
                if (charStr.equals(russianAlphabet[j])) {
                    int newIndex = (j - key + 33) % 33;
                    messageList.add(russianAlphabet[newIndex]);
                    found = true;
                }
            }

            for (int j = 0; j < RUSSIANALPHABET.length && !found; j++) {
                if (charStr.equals(RUSSIANALPHABET[j])) {
                    int newIndex = (j - key + 33) % 33;
                    messageList.add(RUSSIANALPHABET[newIndex]);
                    found = true;
                }
            }

            if (!found) {
                messageList.add(charStr);
            }
        }

        StringBuilder decryptMessage = new StringBuilder();
        for (String s : messageList) {
            decryptMessage.append(s);
        }

        return decryptMessage;
    }

    public int getDecryptKey() {
        return this.key;
    }

    public StringBuilder getDecryptedMessage() {
        return this.decryptedMessage;
    }
}
