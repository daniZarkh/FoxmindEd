package ua.com.foxminded.studyproject;

public class Anagram {

    public static String[] stringSplit(String startString) {
        return startString.split("\\s+");
    }

    public static String reverseWord(String startString) {
        char[] ifNotEmptyArray = new char[startString.length()];
        char[] chars = startString.toCharArray();
        int indexRight = chars.length - 1;
        int indexLeft = 0;

        if (startString.isEmpty()) {
            return startString;
        }
        while (chars.length / 2 >= indexLeft) {
            if (!Character.isLetter(chars[indexLeft])) {
                indexLeft++;
            } else if (!Character.isLetter(chars[chars.length - 1 - indexRight])) {
                indexRight--;
            } else {
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
