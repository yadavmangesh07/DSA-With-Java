package HashMap;

import java.util.*;

public class HashMapImplementation {
    static class HashMap<K,V> { //used generic because which type of data will be filled int the hashmap is not known
        private class Node{
            K key;
            V value;
            public Node(K key,V value){
                this.key=key;
                this.value=value;
            }
        }
        private int n;//total no. of nodes in hashmap
        private int N;// length of bucket array
        private LinkedList<Node> bucket[]; 
        @SuppressWarnings("unchecked") //because we have not defined the data type stored by the linkedlist
        public HashMap(){
            this.N=4; // initial n =4
            this.bucket=new LinkedList[4];// initial n of the bucket array is set to 4
            //now initializing every index of array with a empty linkedlist
            for (int i = 0; i < bucket.length; i++) {
                this.bucket[i]=new LinkedList<>();
            }
        }
        public int hashFunction(K key){
            int hc=key.hashCode();
            return Math.abs(hc)%N ; //this will always return values in range of the index of the bucket array;
        }
        public int searchInLinkedList(int bucketIndex,K key){
            LinkedList<Node> ll=bucket[bucketIndex];
             for (int i = 0; i < ll.size(); i++) {
                if (ll.get(i).key==key) {
                    return i;
                    
                }
                
                
             }
             return -1;
        }
        @SuppressWarnings("unchecked")
        private void rehash(){
            LinkedList<Node> oldBucket[]=bucket;
            bucket=new LinkedList[N*2];
            N=N*2;
            for (int i = 0; i < bucket.length; i++) {
                bucket[i]=new LinkedList<>(); 
                
            }
            //now migrating values to new bucket
            for (int i = 0; i < oldBucket.length; i++) {
                LinkedList<Node> ll=oldBucket[i];
                for (int j = 0; j < ll.size(); j++) {
                    Node node=ll.remove();
                    put(node.key, node.value);
                    
                }
                
            }
        }
        public void put(K key,V value){ //O(lambda)
            int bucketIndex=hashFunction(key);
            int dataIndex=searchInLinkedList(bucketIndex,key);
            if(dataIndex!=-1){
                Node node=bucket[bucketIndex].get(dataIndex);
                node.value=value;

            }
            else{
                bucket[bucketIndex].add(new Node(key,value));
                n++;
            }
            double lambda=(double)n/N;
            if(lambda>2.0){
                rehash();
            }


        }
        public boolean containsKey(K key){//O(lambda)
            int bucketIndex=hashFunction(key);
            int dataIndex=searchInLinkedList(bucketIndex,key);
            if(dataIndex!=-1){
                return true;

            }
            return false;
             
        }
        public V get(K key){//O(lambda)
            int bucketIndex=hashFunction(key);
            int dataIndex=searchInLinkedList(bucketIndex,key);
            if(dataIndex!=-1){
                Node node=bucket[bucketIndex].get(dataIndex);
                return node.value;

            }
            else{
                return null;
            }

        }
        public V remove(K key){//O(lambda)
            int bucketIndex=hashFunction(key);
            int dataIndex=searchInLinkedList(bucketIndex,key);
            if(dataIndex!=-1){
                Node node=bucket[bucketIndex].remove(dataIndex);
                n--;
                return node.value;

            }
            return null;
        }
        public ArrayList<K> keySet(){
            ArrayList<K> keys=new ArrayList<>();
            for (int i = 0; i < bucket.length; i++) {
                LinkedList<Node> ll=bucket[i];
                for (Node node : ll) {
                    keys.add(node.key);
                    
                }

                
            }
            return keys;
        }
        public boolean isEmpty(){
            return n==0?true:false;
        }
        
    }
    public static void main(String[] args) {
        HashMap<String,Integer> hm=new HashMap<String,Integer>();
            hm. put ("India", 100);
            hm. put ("China", 150);
            hm. put ( "US", 50);
            hm. put ("Nepal", 5);
            ArrayList<String> keys = hm. keySet () ;
            for (String string : keys) {
                System.out.println(string  );
           }
           System.out.println(hm.remove("China"));
           System.out.println(hm.get("China"));

    }
    
}
