package ua.com.foxminded.studyproject;

public class Anagram {

    public String reverseText(String text) {
        StringBuilder concatWords = new StringBuilder();
        String[] words = text.split("\\s+");
        for (String word : words) {
            String reversed = reverseWord(word);
            concatWords.append(reversed).append(" ");
        }
        return concatWords.toString();
    }

        public String reverseWord (String startString){
            char[] ifNotEmptyArray = new char[startString.length()];
            char[] chars = startString.toCharArray();
            int indexRight = chars.length - 1;
            int indexLeft = 0;

            while (chars.length / 2 >= indexLeft || chars.length / 2 < indexRight) {
                if (!Character.isLetter(chars[indexLeft])) {
                    indexLeft++;
                }
                if (!Character.isLetter(chars[indexRight])) {
                    indexRight--;
                }
                if (Character.isLetter(chars[indexLeft]) && Character.isLetter(chars[indexRight])) {
                    char temp = chars[indexLeft];
                    chars[indexLeft] = chars[indexRight];
                    chars[indexRight] = temp;
                    indexLeft++;
                    indexRight--;
                }
            }
            return String.valueOf(chars);
        }
    }
