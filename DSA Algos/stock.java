// import java.util.ArrayList;
// import java.util.Arrays;
// import java.util.Collections;

public class stock {
    public static int profitPrize(int arr[]) {
        int bp = arr[0];
        int profit = 0;

        for (int i = 0; i < arr.length; i++) {
            bp=Math.min(bp,arr[i]);
            for (int j = i + 1; j < arr.length; j++) {
                int sp = arr[j];
                if (sp > bp) {
                    profit = Math.max(profit, sp - bp);

                }

            }

        }
        return profit;
       
    }
    public static void main(String[] args) {
        int stockPrize[]={7,6,4,3,1};
        System.out.println(profitPrize(stockPrize));

    }


}
