package common;

import java.util.HashMap;

public  final class EnglishToMorseAlphabet {
    public static HashMap<String, String> englishAlphabet = new HashMap<>();

    static {
        englishAlphabet.put("A", ".-");
        englishAlphabet.put("B", "-...");
        englishAlphabet.put("C", "-.-.");
        englishAlphabet.put("D", "-..");
        englishAlphabet.put("E", ".");
        englishAlphabet.put("F", "..-.");
        englishAlphabet.put("G", "--.");
        englishAlphabet.put("H", "....");
        englishAlphabet.put("I", "..");
        englishAlphabet.put("J", ".---");
        englishAlphabet.put("K", "-.-");
        englishAlphabet.put("L", ".-..");
        englishAlphabet.put("M", "--");
        englishAlphabet.put("N", "-.");
        englishAlphabet.put("O", "---");
        englishAlphabet.put("P", ".--.");
        englishAlphabet.put("Q", "--.-");
        englishAlphabet.put("R", ".-.");
        englishAlphabet.put("S", "...");
        englishAlphabet.put("T", "-");
        englishAlphabet.put("U", "..-");
        englishAlphabet.put("V", "...-");
        englishAlphabet.put("W", ".--");
        englishAlphabet.put("X", "-..-");
        englishAlphabet.put("Y", "-.--");
        englishAlphabet.put("Z", "--..");
        englishAlphabet.put("1", ".----");
        englishAlphabet.put("2", "..---");
        englishAlphabet.put("3", "...--");
        englishAlphabet.put("4", "....-");
        englishAlphabet.put("5", ".....");
        englishAlphabet.put("6", "-....");
        englishAlphabet.put("7", "--...");
        englishAlphabet.put("8", "---..");
        englishAlphabet.put("9", "----.");
        englishAlphabet.put("0", "-----");
        englishAlphabet.put(".", ".-.-.-");
        englishAlphabet.put(",", "--..--");
        englishAlphabet.put("?", "..--..");
        englishAlphabet.put(":", "---...");
        englishAlphabet.put("/", "-..-.");
        englishAlphabet.put("-", "-....-");
        englishAlphabet.put("=", "-...-");
        englishAlphabet.put("!", "-.-.--");
        englishAlphabet.put(";", "-.-.-.");
        englishAlphabet.put("''", ".-..-.");
        englishAlphabet.put("$", "...-..-");
    }
}
