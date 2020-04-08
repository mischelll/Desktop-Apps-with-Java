package common;

import java.util.HashMap;

public  final class MorseToEnglishAlphabet {
    public static HashMap<String, String> morseAlphabet = new HashMap<>();

    static {
        morseAlphabet.put(".-", "a");
        morseAlphabet.put("-...", "b");
        morseAlphabet.put("-.-.", "c");
        morseAlphabet.put("-..", "d");
        morseAlphabet.put(".", "e");
        morseAlphabet.put("..-.", "f");
        morseAlphabet.put("--.", "g");
        morseAlphabet.put("....", "h");
        morseAlphabet.put("..", "i");
        morseAlphabet.put(".---", "j");
        morseAlphabet.put("-.-", "k");
        morseAlphabet.put(".-..", "l");
        morseAlphabet.put("--", "m");
        morseAlphabet.put("-.", "n");
        morseAlphabet.put("---", "o");
        morseAlphabet.put(".--.", "p");
        morseAlphabet.put("--.-", "q");
        morseAlphabet.put(".-.", "r");
        morseAlphabet.put("...", "s");
        morseAlphabet.put("-", "t");
        morseAlphabet.put("..-", "u");
        morseAlphabet.put("...-", "v");
        morseAlphabet.put(".--", "w");
        morseAlphabet.put("-..-", "x");
        morseAlphabet.put("-.--", "y");
        morseAlphabet.put("--..", "z");
        morseAlphabet.put(".----", "1");
        morseAlphabet.put("..---", "2");
        morseAlphabet.put("...--", "3");
        morseAlphabet.put("....-", "4");
        morseAlphabet.put(".....", "5");
        morseAlphabet.put("-....", "6");
        morseAlphabet.put("--...", "7");
        morseAlphabet.put("---..", "8");
        morseAlphabet.put("----.", "9");
        morseAlphabet.put("-----", "0");
        morseAlphabet.put(".-.-.-", ".");
        morseAlphabet.put("--..--", ",");
        morseAlphabet.put("..--..", "?");
        morseAlphabet.put("---...", ":");
        morseAlphabet.put("-..-.", "/");
        morseAlphabet.put("-....-", "-");
        morseAlphabet.put("-...-", "=");
        morseAlphabet.put("-.-.--", "!");
        morseAlphabet.put("-.-.-.", ";");
        morseAlphabet.put(".-..-.", "''");
        morseAlphabet.put("...-..-", "$");

    }
}
