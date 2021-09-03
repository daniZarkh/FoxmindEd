package ua.com.foxminded.anagram;

public class Anagram {

    public String obtainResult(String text) {
        StringBuilder concatWords = new StringBuilder();
        String[] words = text.split("\\s+");
        for (String word : words) {
            String reversed = reverseWord(word);
            concatWords.append(reversed).append(" ");
        }
        return concatWords.toString();
    }

        public String reverseWord(String word){
            char[] chars = word.toCharArray();
            int indexRight = chars.length - 1;
            int indexLeft = 0;

            while (chars.length / 2 >= indexLeft || chars.length / 2 < indexRight) {
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
