package org.example;

import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));
        System.setProperty("console.encoding", "utf-8");
        Text text = new Text();
        System.out.println(text.hello());
        Scanner scanner = new Scanner(System.in, "UTF-8");
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
                    System.out.println("DEBUG: Получено сообщение: '" + userMessage + "'");
                    System.out.println("DEBUG: Длина: " + userMessage.length());

                    System.out.println(text.askKey());
                    String userKey = scanner.nextLine();
                    System.out.println("DEBUG: Получен ключ: '" + userKey + "'");

                    Decrypt messageDecrypt = new Decrypt(userMessage, userKey);

                    System.out.println("DEBUG: Ключ смещения: " + messageDecrypt.getDecryptKey());
                    System.out.println("DEBUG: Расшифрованное сообщение: '" + messageDecrypt.getDecryptedMessage() + "'");

                    System.out.println(text.generatingMessage());
                    Thread.sleep(1000);
                    System.out.println(text.yourMessage() + userMessage);
                    System.out.println(text.yourDecrypt() + messageDecrypt.getDecryptedMessage());
                    Thread.sleep(1000);
                    System.out.println(text.trueKey() + messageDecrypt.getDecryptKey());
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