package org.example;

public class Test {
    public static void main(String[] args) {
        Test test = new Test();
        test.keyGeneratorTest();
        test.keyEncodeTest();
    }

    private void keyGeneratorTest() {
        Text text = new Text();
        keyGenerator test = new keyGenerator();
        String keyTest = test.Generate();
        System.out.println(text.yourKey() + keyTest);
    }

    private void keyEncodeTest() {
        Text text = new Text();
        Encode testEncoder = new Encode("Привет мир");
        int key = testEncoder.getKey();
        StringBuilder encoded = testEncoder.encode();

        System.out.println(text.trueKey() + key);
        System.out.println(text.encodeMessage() + encoded);
    }
}

class TestDecrypt {
    public static void main(String[] args) {
        System.out.println("Тест расшифровки...");

        // Тестовые данные
        String encrypted = "Фхнжйч";  // "Привет" с ROT5
        String key = "Dt58tM6430u9071";  // ключ с цифрой 5

        System.out.println("Зашифровано: " + encrypted);
        System.out.println("Ключ: " + key);

        Decrypt decryptor = new Decrypt(encrypted, key);

        System.out.println("Расшифровано: " + decryptor.getDecryptedMessage());
        System.out.println("Ключ смещения: " + decryptor.getDecryptKey());
    }
}