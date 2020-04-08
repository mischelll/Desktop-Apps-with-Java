package businesslogic;

import common.MorseToEnglishAlphabet;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static common.EnglishToMorseAlphabet.*;
import static common.MorseToEnglishAlphabet.*;

public class MorseCodeTranslatorImpl implements MorseCodeTranslator {

    @Override
    public String englishToMorse(String text) {
        List<String> englishWords = Arrays
                .stream(text.split("\\s+"))
                .collect(Collectors.toList());

        StringBuilder translatedText = new StringBuilder();

        englishWords.stream()
                .map(String::toUpperCase)
                .forEach(word -> {
                    for (char aChar : word.toCharArray()) {
                        String letter = String.valueOf(aChar);
                        if (englishAlphabet.get(letter) == null){
                            translatedText.append("?");
                            translatedText.append(" ");
                        }else {
                            String translation = englishAlphabet.get(letter);
                            translatedText.append(translation);
                            translatedText.append(" ");
                        }

                    }

                    translatedText.append("//");
                    translatedText.append(" ");

                });

        return translatedText.toString();
    }

    @Override
    public String morseToEnglish(String text) {
        List<String> morseWords = Arrays
                .stream(text.split("\\s+"))
                .collect(Collectors.toList());
        StringBuilder translatedText = new StringBuilder();

        morseWords
                .forEach(word -> {
                    if (word.equals("//")) {
                        translatedText.append(" ");

                    } else {
                        String translation = morseAlphabet.get(word);
                        translatedText.append(translation);
                    }
                });

        return translatedText.toString();
    }
}
