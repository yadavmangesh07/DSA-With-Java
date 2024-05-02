package Greedy;

import java.util.Arrays;
import java.util.Comparator;

//greedy about value concept
public class fractionalKnapsack {
    public static int fKnapsack(int []weight,int []value,int capacity){
        int profit=0;
        double ratio[][]=new double[weight.length][weight.length];
        for (int i = 0; i < ratio.length; i++) {
            ratio[i][1]=(double)value[i]/(double)weight[i];//type casted to double in order to get accurate values of rati=>value/weight-->weight at denominator becoz we want to reduce the weight and increase the value
            ratio[i][0]=i;//store index

        }
       
        Arrays.sort(ratio,Comparator.comparingDouble(o->o[1]));//sort on the basis of ratio
        for (int i = ratio.length-1; i >=0; i--) {//to pick greatest ratio loop taken reversed
            int index=(int)ratio[i][0];//index of highest ratio
            if(weight[index]<=capacity){
                capacity=capacity-weight[index];
                profit+=value[index];

            }
            else{
                profit+=capacity*ratio[i][1 ];
                capacity=0;
                break;
            }
            
        }
        return profit;
    }
    public static void main(String[] args) {
        int weight[]={10,20,30};
        int value[]={60,100,120};
        int capacity=50;
        System.out.println("Total profit :"+fKnapsack(weight, value, capacity));
    }
    
}
