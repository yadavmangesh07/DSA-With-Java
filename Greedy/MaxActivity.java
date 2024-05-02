package Greedy;
import java.util.*;

public class MaxActivity {
    public static void main(String[] args) {
        int start[]={1,3,0,5,8,5};
        int end[]={2,4,6,7,9,9};

        //if the end array is not sorted ,sort it using a 2-D Array/Matrix
        int activities[][]=new int[start.length][3];//array with 1col=>index,2col=>start,3col=>end
        for (int i = 0; i < start.length; i++) {//loop should be run 5 times cozno of activities are 5
            activities[i][0]=i;
            activities[i][1]=start[i];
            activities[i][2]=end[i];

            
        }
        //now we will use lambda function to sort the 2D array
        Arrays.sort(activities,Comparator.comparingDouble(o->o[2]));
        //to store the the activity index
        ArrayList<Integer> list=new ArrayList<>();

        //intially no. of activities
        int maxAct=1;

        //to store the index of last activity performed
        int lastAct=end[0];//first act selected and added to the list
        list.add(0);
        for (int i = 1; i < end.length; i++) {
            if(start[i]>=lastAct){
                list.add(i);
                maxAct++;
                lastAct=end[i];
            }
            
        }
        System.out.println("Maximum activity that can be performd are :"+maxAct);
        for (int i = 0; i < list.size(); i++) {
            System.out.print("A"+list.get(i)+" ");
            
        }

        

    }
    
}
