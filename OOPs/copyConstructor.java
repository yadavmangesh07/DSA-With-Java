package OOPs;

public class copyConstructor {
    public static void main(String[] args) {
        Student s1=new Student();
        s1.name="Mangesh";
        s1.rollNumber=7090;
        s1.marks[0]=100;
        s1.marks[1]=99;
        s1.marks[2]=98;
        // Student s2=new Student(s1);
        for (int i = 0; i < 3; i++) {
            System.out.println(s1.marks[i]);
            
        }
        Student s2=new Student(s1);
        s1.marks[0]=10;
        s1.marks[1]=20;
        s1.marks[2]=30;
        
        for (int i = 0; i < 3; i++) {
            System.out.println(s2.marks[i]);
            
        }
        


        
    }
    
}
class Student{
    String name;
    int rollNumber;
    int [] marks;
    //shawallo copy constructor(changes are reflected if changes are made after calling the copy constructor)
    // Student(Student s1){
    //     int marks[]=new int[3];
    //     this.name=s1.name;
    //     this.rollNumber=s1.rollNumber;
    //     this.marks=s1.marks;
    // }
    //deep copy constructor(changes are not reflected if changes are made after calling the copy constructor)
    Student(){
        // this.marks=new int[3];
        // this.name=name;
        // this.rollNumber=rollNumber;
        // this.marks=marks;

    }
    Student(Student s1){
        this.marks=new int[3];
        this.name=s1.name;
        this.rollNumber=s1.rollNumber;
        for (int i = 0; i <marks.length; i++) {
            this.marks[i]=s1.marks[i];
            
        }

    }
    
}