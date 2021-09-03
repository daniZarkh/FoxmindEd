package ua.com.foxminded.studyproject;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String startString = "";
        System.out.println("Enter some text: ");
        Scanner scanner = new Scanner(System.in);
        startString = scanner.nextLine();
        scanner.close();
        String[] words = Anagram.stringSplit(startString);
        Anagram.reverseString(words);
       }
}