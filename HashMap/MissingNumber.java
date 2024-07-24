package HashMap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class MissingNumber {

    public static ArrayList<Integer> helper(int arr1[], int arr2[]) {
        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> ans = new ArrayList<>();
        
       
        for (int num : arr2) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        
       
        for (int num : arr1) {
            if (map.containsKey(num)) {
                map.put(num, map.get(num) - 1);
            }
        }
        
        
        for (int num : map.keySet()) {
            if (map.get(num) > 0) {
                ans.add(num);
            }
        }
        
        return ans;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
     
        int n = scanner.nextInt();
        int arr1[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr1[i] = scanner.nextInt();
        }
        int m = scanner.nextInt();
        
       
        int arr2[] = new int[m];
        for (int i = 0; i < m; i++) {
            arr2[i] = scanner.nextInt();
        }
        
       
        ArrayList<Integer> ans = helper(arr1, arr2);
        Collections.sort(ans);
        
        
        for (int num : ans) {
            System.out.print(num + " ");
        }
        
        scanner.close();
    }
}
