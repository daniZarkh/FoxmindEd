import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    public static String reverseString(String startString) {
        char[] ifNotEmptyArray = new char[startString.length()];
        char[] fromStartStringArray = startString.toCharArray();
        char temp = 0;

        if (startString.isEmpty()) {
            return startString;
        }

        for (int i = 0; i < startString.length(); i++) {
            if (Character.isLetter(fromStartStringArray[i])
                    == Character.isLetter(fromStartStringArray[fromStartStringArray.length - 1 - i])) {
                temp = fromStartStringArray[i];
                fromStartStringArray[i] = fromStartStringArray[fromStartStringArray.length - 1 - i];
                fromStartStringArray[fromStartStringArray.length - 1 - i] = temp;
            }
        }

        return fromStartStringArray.toString()
                .replace("[", "")
                .replace("]", "")
                .replace(",", "")
                .replace(" ", "");
    }
}
