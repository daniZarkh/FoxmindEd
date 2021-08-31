package ua.com.foxminded.foxmindedstudy;

import java.util.Arrays;
import java.util.Scanner;

public class  Anagrams {
    public static void main(String[] args) {
        String str;

        System.out.println("Enter some text: ");
        Scanner scanner = new Scanner(System.in);
        str = scanner.nextLine();
        scanner.close();
        String[] words = str.split("\\s+");
        for (int i = 0; i < words.length; i++) {
            String reversed = reverseString(words[i]);
            System.out.println("The reversed string is: " + reversed);
        }
    }

    public static String reverseString(String str) {
        if (str.isEmpty()) {
            return str;
        }
        char[] ifNotEmptyArray = new char[str.length()];
        char[] fromString = str.toCharArray();
        for (int i = 0; i < str.length(); i++) {
            if (!Character.isLetter(fromString[i])) {
                ifNotEmptyArray[i] = str.charAt(i);
            }
        }
        for (int i = 0; i < str.length(); i++) {
            if (Character.isLetter(fromString[i]) && !Character.isLetter(ifNotEmptyArray[i])) {
                ifNotEmptyArray[str.length() - 1 - i] = str.charAt(i);
            }
        }

        return Arrays.toString(ifNotEmptyArray)
                .replace("[", "")
                .replace("]", "")
                .replace(",", "")
                .replace(" ", "");
    }
}
