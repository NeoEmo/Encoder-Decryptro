package org.example;

class keyGenerator {
    String Generate() {
        Text text = new Text();
        String[] alphabet = text.engAlphabet();
        String[] ALPHABET = text.engALPHABET();

        // Генерируем случайные значения
        int random1 = (int) (Math.random() * 9);
        int random2 = (int) (Math.random() * 26);
        int random3 = (int) (Math.random() * 26);
        int random4 = (int) (Math.random() * 26);
        int random5 = (int) (Math.random() * 26);
        int random6 = (int) (Math.random() * 99);
        int random7 = (int) (Math.random() * 99);
        int random8 = (int) (Math.random() * 99);
        int random9 = (int) (Math.random() * 99);
        int random10 = (int) (Math.random() * 99);

        int guaranteedDigit = random1 + 1;


        return ALPHABET[random2] + alphabet[random3] + guaranteedDigit + random6 +
                alphabet[random3] + ALPHABET[random4] + random7 + random8 +
                alphabet[random5] + random9 + random10;
    }
}

