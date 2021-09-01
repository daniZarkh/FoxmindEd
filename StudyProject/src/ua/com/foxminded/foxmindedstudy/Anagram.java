package ua.com.foxminded.foxmindedstudy;

import java.util.Arrays;

public class Anagram {
    public static String reverseString(String startString) {
        char[] ifNotEmptyArray = new char[startString.length()];
        char[] fromStartStringArray = startString.toCharArray();

        if (startString.isEmpty()) {
            return startString;
        }

        for (int i = 0; i < fromStartStringArray.length / 2; i++) {
            if (Character.isLetter(fromStartStringArray[i])
                    == Character.isLetter(fromStartStringArray[fromStartStringArray.length - 1 - i])) {
                char temp = fromStartStringArray[i];
                fromStartStringArray[i] = fromStartStringArray[fromStartStringArray.length - 1 - i];
                fromStartStringArray[fromStartStringArray.length - 1 - i] = temp;
            }
        }

        return Arrays.toString(fromStartStringArray)
                .replace("[", "")
                .replace("]", "")
                .replace(",", "")
                .replace(" ", "");
    }
}
