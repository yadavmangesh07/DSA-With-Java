package PriorityQueue;

import java.util.ArrayList;

public class operationsInMinHeap {
    public static class minHeap {
        public ArrayList<Integer> ls=new ArrayList<>();

        //funnc to add data
        public  void add(int data){
            ls.add(data);
            int childIndex=ls.size()-1;
            int parentIndex=(childIndex-1)/2;

            while( parentIndex >= 0 && ls.get(parentIndex)>ls.get(childIndex)){

                //swap
                int temp=ls.get(parentIndex);
                ls.set(parentIndex,ls.get(childIndex));
                ls.set(childIndex, temp);
                childIndex=parentIndex;
                parentIndex=(childIndex-1)/2;
                
            }
            
        }
        //func to peek 
        public int peekElement(){
            return ls.get(0);
        }
        //func to remove
        public int remove(){
            //store first index el to return it in last becoz it is to be deleted
            int data=ls.get(0);


            //swap first and last index el from ls
            int first=ls.get(0);
            
            ls.set(0, ls.get(ls.size()-1));
            ls.set(ls.size()-1,first);

            //delete last form ls
            ls.remove(ls.size()-1); 

            heapify(0 ) ;

            return data;



        }
        private void heapify(int i){
            //leftNode index
            int left=2*i+1;

            //rightNode Index
            int right=2*i+2;

            //assume that the currentNode is minimum
            int minIndx=i;
            if(left<ls.size() && ls.get(minIndx)>ls.get(left)){//if i is not the leaf root and left of i is smaller than i
                minIndx=left;

            }
            if(right<ls.size() && ls.get(minIndx)>ls.get(right)){
                minIndx=right;
            }

            //if minIndx is changed
            if(minIndx!=i){

                //swap 
                int temp=ls.get(i);
                ls.set(i, ls.get(minIndx));
                ls.set(minIndx,temp);

                heapify(minIndx);
            }


        }
        public boolean isEmpty(){
            return ls.size()==0;
        }
    
        
    }
    public static void main(String[] args) {
       minHeap h=new minHeap();
       h.add(1);
       h.add(23);
       h.add(12);
       h.add(2);
       h.add(64);

    //    System.out.print("Min heap elements After insertion :");
    //    for (Integer a  : minHeapInstance.ls) {
    //     System.out.print(a+" ");
        
    //    }
    //    System.out.println();
    //    System.out.println(minHeapInstance.peekElement());
    //    minHeapInstance.remove();
    
    // while (!h.isEmpty()) {
    //     System.out.print(h.peekElement()+" ");
    //     h.remove();
        
    // }
       System.out.print("Min heap elements After removal :");
       h.remove();
       for (Integer i : h.ls) {
        System.out.print(i+" ");
        
       }
}
}
    

