package Greedy;

import java.util.*;

public class jobScheduling {
    public static class job {
        int deadline;
        int profit;
        int id;//0=A,1=B,....

        public job(int i,int d,int p){
            deadline=d;
            profit=p;
            id=i;
        }
        public static void jobSchedule(int arr[][]){
            ArrayList<job> list=new ArrayList<>();
            for (int i = 0; i < arr.length; i++) {
                list.add(new job(i,arr[i][0],arr[i][1]));
                
            }
            Collections.sort(list,(a,b)->b.profit-a.profit);//descending order of profit
            ArrayList<Integer> sequence=new ArrayList<>();
            int time=0;//to track the current time
            for (int i = 0; i < list.size(); i++) {
                //current job
                job current=list.get(i);
                if(current.deadline>time){//comparing selected job deadline with current time
                    sequence.add(current.id);
                    time++;
                }

                
            }
            System.out.println("Maximum jobs that can be performed :"+list.size());
            //print sequence list
            for (int i = 0; i < sequence.size(); i++) {
                System.out.print(sequence.get(i)+" ");
                
            }

        }
        
    
        
        public static void main(String[] args) {
            int jobInfo[][]={
                {4,20},
                {1,10},
                {1,40},
                {1,30}
            };
            jobSchedule(jobInfo);
    
    
        }
    }
    
    
}
