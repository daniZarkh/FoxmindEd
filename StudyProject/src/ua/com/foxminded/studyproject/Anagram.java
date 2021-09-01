package ua.com.foxminded.studyproject;

public class Anagram {

    public static String reverseString(String startString) {
        char[] ifNotEmptyArray = new char[startString.length()];
        char[] chars = startString.toCharArray();

        if (startString.isEmpty()) {
            return startString;
        }
        for (int i = 0; i < chars.length / 2; i++) {
            if (Character.isLetter(chars[i])
                    == Character.isLetter(chars[chars.length - 1 - i])) {
                char temp = chars[i];
                chars[i] = chars[chars.length - 1 - i];
                chars[chars.length - 1 - i] = temp;
            }
        }
        return String.valueOf(chars);
    }
}
