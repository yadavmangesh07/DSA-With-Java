package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class LexicographicalNumbers_386 {

    public List<Integer> lexicalOrder(int n) {
        List<Integer> ls = new ArrayList<>();
        int num = 1;
        for (int i = 1; i <= n; i++) {
            ls.add(num);
            if (num * 10 <= n) {
                num = num * 10;
            } else {
                while (num % 10 == 9 || num == n) {
                    num /= 10;
                }

                num++;// we cannot go 20 after 19 therefore while is used above before incrementing;
            }

        }
        return ls;

    }
    // public static void dfs(int currNum,int target,List<Integer> ls){
    // //base case
    // if(currNum>target){
    // return;
    // }
    // ls.add(currNum);
    // //ten possible combinations like for 1--> 10,11,12,...,19
    // for(int i=0;i<10;i++){
    // if(currNum*10+i>target){
    // break;
    // }
    // dfs(currNum*10+i,target,ls);
    // }
    // }

}
