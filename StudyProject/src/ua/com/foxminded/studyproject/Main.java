package ua.com.foxminded.studyproject;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Enter some text: ");
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        scanner.close();
        Anagram anagram = new Anagram();
        System.out.println(anagram.reverseText(text));
       }
}