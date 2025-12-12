package org.example;

public class Text {
    public String hello() {
        return "Приветствую! Необходимо Зашифровать или расшифровать сообщение? ( Encode / Decrypt )";
    }

    public String askMessage() {
        return "Введите Сообщение: ";
    }

    public String askKey() {
        return "Введите ключ: ";
    }

    public String generatingKey() {
        return "Генерирую ключ...";
    }

    public String generatingMessage() {
        return "Генерирую сообщение... Подождите...";
    }

    public String somethingWrong() {
        return "Упс! Что-то пошло не так, попробуй снова!";
    }
    public String trueKey() {
        return "Ключ смещения (число): ";
    }

    public String yourMessage() {
        return "ваше сообщение: ";
    }

    public String yourDecrypt() {
        return "Переводится как: ";
    }

    public String itsEmpty() {
        return "Сообщение пустое";
    }

    public String encodeMessage() {
        return "Его закодированный вид: ";
    }

    public String yourKey() {
        return "Ключ от сообщения: ";
    }

    public String[] alphabet() {
        return new String[] {"а", "б", "в", "г", "д", "е", "ё", "ж", "з", "и", "й", "к", "л", "м", "н", "о", "п", "р",
                "с", "т", "у", "ф", "х", "ц", "ч", "ш", "щ", "ъ", "ы", "ь", "э", "ю", "я"};
    }

    public String[] ALPHABET() {
        return new String[] {"А", "Б", "В", "Г", "Д", "Е", "Ё", "Ж", "З", "И", "Й", "К", "Л", "М", "Н", "О", "П", "Р",
                "С", "Т", "У", "Ф", "Х", "Ц", "Ч", "Ш", "Щ", "Ъ", "Ы", "Ь", "Э", "Ю", "Я"};
    }

    public String[] engAlphabet() {
        return new String[] {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r",
                "s", "t", "u", "v", "w", "x", "y", "z"};
    }

    public String[] engALPHABET() {
        return new String[] {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R",
                "S", "T", "U", "V", "W", "X", "Y", "Z"};
    }
}
