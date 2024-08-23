package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class letterCombination_17 {

    public List<String> letterCombinations(String digits) {
        if (digits == null || digits.length() == 0) {
            System.out.println("Input is empty. Returning an empty list.");
            return new ArrayList<>();
        }

        // Mapping digits to corresponding letters
        String[] digitToLetters = new String[]{
            "",     // 0
            "",     // 1
            "abc",  // 2
            "def",  // 3
            "ghi",  // 4
            "jkl",  // 5
            "mno",  // 6
            "pqrs", // 7
            "tuv",  // 8
            "wxyz"  // 9
        };

        List<String> result = new ArrayList<>();
        result.add("");
        System.out.println("Initial result list: " + result);

        // Iterate over each digit in the input string
        for (char digit : digits.toCharArray()) {
            System.out.println("Processing digit: " + digit);
            List<String> currentCombinations = new ArrayList<>();
            String letters = digitToLetters[digit - '0'];
            System.out.println("Corresponding letters for digit " + digit + ": " + letters);

            // Expand the current combinations
            for (String combination : result) {
                for (char letter : letters.toCharArray()) {
                    currentCombinations.add(combination + letter);
                    System.out.println("Adding combination: " + combination + letter);
                }
            }

            // Update the result list with the current combinations
            result = currentCombinations;
            System.out.println("Updated result list: " + result);
        }

        return result;
    }

    public static void main(String[] args) {
        letterCombination_17 solution = new letterCombination_17();
        String digits = "23";
        System.out.println("Input digits: " + digits);
        List<String> combinations = solution.letterCombinations(digits);
        System.out.println("Final combinations: " + combinations);
    }
}
