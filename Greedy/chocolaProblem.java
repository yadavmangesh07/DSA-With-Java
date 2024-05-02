package Greedy;

import java.util.Arrays;
import java.util.Collections;

public class chocolaProblem {
    public static int minCost(Integer[]costVert,Integer[]costHori){
        // int n=costVert.length;//cols
        // int m=costHori.length;//rows
        
        //aim is to cut the high cost first bcoz by every cut the pieces are going to be increased 
        Arrays.sort(costVert,Collections.reverseOrder());
        Arrays.sort(costHori,Collections.reverseOrder());
        int h=0;//horiz cut
        int v=0;//vert cut
        int hp=1;//hori pieces
        int vp=1;//vert pieces
        int finalCost=0;
        
        while(h<costHori.length && v<costVert.length){
            if(costHori[h]>costVert[v]){
                //will put horizontal cut
                finalCost+=costHori[h]*vp; //horizontal cut goes through vertical pieces
                hp++;
                h++;
            }
            else{
                finalCost+=costVert[v]*hp;//vertical cut goes through horizontal  pieces
                vp++;
                v++;
            }

        }
        //if something still remains in the array
        while(h<costHori.length){
            finalCost+=costHori[h]*vp; //horizontal cut goes through vertical pieces
                hp++;
                h++;

        }
        while(v<costVert.length){
            finalCost+=costVert[v]*hp;//vertical cut goes through horizontal  pieces
                vp++;
                v++;

        }
        return finalCost;
    }
    public static void main(String[] args) {
        Integer []costVert={2,1,3,1,4};
        Integer[] costHori={4,1,2};
        System.out.println("Minimum cost of cuts => "+minCost(costVert, costHori));
    }
    
}
