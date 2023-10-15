package com.assignment;
import java.util.Scanner;
import java.util.HashMap;

public class RomanToInteger {
    public static int romanToInt(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        
        HashMap<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);
        
        int result = 0;
        int prevValue = 0;
        
        for (int i = s.length() - 1; i >= 0; i--) {
            int curValue = romanMap.get(s.charAt(i));
            
            if (curValue < prevValue) {
                result -= curValue;
            } else {
                result += curValue;
            }
            
            prevValue = curValue;
        }
        
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a Roman numeral: ");
        String romanNumeral = scanner.nextLine().toUpperCase(); // Convert to uppercase for consistency

        int integerEquivalent = romanToInt(romanNumeral);
        System.out.println(romanNumeral + " = " + integerEquivalent);
        
        scanner.close();
    }
}
