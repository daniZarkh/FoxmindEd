package ua.com.foxminded.studyproject;

import java.util.Scanner;

public class Main {
    public void main(String[] args) {
        String startString;

        System.out.println("Enter some text: ");
        Scanner scanner = new Scanner(System.in);
        startString = scanner.nextLine();
        scanner.close();
        String[] words = startString.split("\\s+");
        for (String word : words) {
            String reversed = Anagram.reverseString(word);
            System.out.println("The reversed string is: " + reversed);
        }
    }
}
