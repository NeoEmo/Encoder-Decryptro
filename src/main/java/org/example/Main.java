package org.example;

import java.util.Scanner;

public class Main {

    static void main(String[] args) throws InterruptedException {
        Text text = new Text();
        System.out.println(text.hello());
        Scanner scanner = new Scanner(System.in);
        String userAnswer = scanner.nextLine();
        boolean isValid = false;
        while (!isValid) {
            switch (userAnswer) {
                case "Encode" -> {
                    System.out.println(text.askMessage());
                    String userMessage = scanner.nextLine();

                    Encode messageEncoder = new Encode(userMessage);
                    String userKey = messageEncoder.getEncodeKey();
                    StringBuilder userEncodeMessage = messageEncoder.encode();

                    System.out.println(text.generatingKey());
                    Thread.sleep(1000);
                    System.out.println(text.generatingMessage());
                    Thread.sleep(1000);

                    System.out.println(text.yourMessage() + userMessage);
                    System.out.println(text.encodeMessage() + userEncodeMessage);
                    System.out.println(text.yourKey() + userKey);
                    System.out.println(text.trueKey() + messageEncoder.getKey());
                    isValid = true;
                }
                case "Decrypt" -> {
                    System.out.println(text.askMessage());
                    String userMessage = scanner.nextLine();
                    System.out.println(text.askKey());
                    String userKey = scanner.nextLine();
                    Decrypt messageDecrypt = new Decrypt(userMessage, userKey);

                    System.out.println(text.generatingMessage());
                    Thread.sleep(1000);
                    System.out.println(text.yourMessage() + userMessage);
                    System.out.println(text.yourDecrypt() + messageDecrypt.getDecryptMessage(userMessage)); // +DECRYPT!!!
                    Thread.sleep(1000);
                    System.out.println(text.trueKey() + messageDecrypt.getDecryptKey(userKey));
                    isValid = true;
                }
                default -> {
                    System.out.println(text.somethingWrong());
                    System.out.println(text.hello());
                    userAnswer = scanner.nextLine();
                }
            }
        }
    }
}