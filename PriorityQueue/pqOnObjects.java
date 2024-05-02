package PriorityQueue;

import java.util.Comparator;
import java.util.PriorityQueue;

public class pqOnObjects {
    public static class Student implements Comparable<Student>{
        int rank;
        String name;
        public Student(String name,int rank){
            this.name=name;
            this.rank=rank;
        }
        
        //abstract method is overrriden form the interface Comparable
        @Override
        public int compareTo(Student s1){
            return this.rank-s1.rank;//compares the current student rank with the next one
        }
    }
    public static void main(String[] args) {
        PriorityQueue<Student> pq=new PriorityQueue<>(Comparator.reverseOrder());
        pq.add(new Student("Mangesh", 3));
        pq.add(new Student("Arpita", 1));
        pq.add(new Student("Astha", 2));

        while (!pq.isEmpty()) {
            System.out.println(pq.peek().name+" -->"+pq.peek().rank);
            pq.remove();
            
        }
    }
    
    
}
