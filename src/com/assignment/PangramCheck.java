package com.assignment;

import java.util.Scanner;

public class PangramCheck {
    public static boolean isPangram(String str) {
        // Create a boolean array to mark the presence of each letter
        boolean[] alphabet = new boolean[26];

        // Convert the input to lowercase for case insensitivity
        str = str.toLowerCase();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // Check if the character is an alphabet letter
            if (ch >= 'a' && ch <= 'z') {
                alphabet[ch - 'a'] = true;
            }
        }

        // Check if all letters from 'a' to 'z' are present
        for (boolean letter : alphabet) {
            if (!letter) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String input = scanner.nextLine();

        boolean isPangram = isPangram(input);
        if (isPangram) {
            System.out.println("The input is a pangram.");
        } else {
            System.out.println("The input is not a pangram.");
        }

        scanner.close();
    }
}
