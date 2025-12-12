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


