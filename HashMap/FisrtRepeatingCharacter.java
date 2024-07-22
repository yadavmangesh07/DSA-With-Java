package HashMap;

import java.util.HashSet;
import java.util.Scanner;

public class FisrtRepeatingCharacter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
     
        int T = scanner.nextInt();
        scanner.nextLine(); 

        for (int t = 0; t < T; t++) {
            String str = scanner.nextLine();
            System.out.println(findFirstRepeatingCharacter(str));
        }
        
        scanner.close();
    }
    
    private static String findFirstRepeatingCharacter(String str) {
        HashSet<Character> set = new HashSet<>();
        
        for (char c : str.toCharArray()) {
            if (set.contains(c)) {
                return Character.toString(c);
            } else {
                set.add(c);
            }
        }
        
        return ".";
    }
}
