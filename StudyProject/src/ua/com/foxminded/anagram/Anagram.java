package ua.com.foxminded.anagram;

public class Anagram {

    public String reverseText(String text) {
        StringBuilder result = new StringBuilder();
        if (text == null) {
            throw new IllegalArgumentException("The variable 'text' should not be null");
        }
        String[] words = text.split("\\s+");
        for (int i = 0; i < words.length; i++) {
            String reversedWord = reverseWord(words[i]);
            result.append(reversedWord);
            if (i < words.length - 1) {
                result.append(" ");
            }
        }
        return result.toString();
    }

    private String reverseWord(String word) {
        char[] chars = word.toCharArray();
        int indexRight = chars.length - 1;
        int indexLeft = 0;

        while (indexLeft < indexRight) {
            if (!Character.isLetter(chars[indexLeft])) {
                indexLeft++;
            } else if (!Character.isLetter(chars[indexRight])) {
                indexRight--;
            } else {
                char leftSymbol = chars[indexLeft];
                chars[indexLeft] = chars[indexRight];
                chars[indexRight] = leftSymbol;
                indexLeft++;
                indexRight--;
            }
        }
        return String.valueOf(chars);
    }
}
