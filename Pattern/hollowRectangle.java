// package Pattern;

import java.util.Scanner;

public class hollowRectangle {
    public static void pattern_1(int length,int breadth){
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < breadth; j++) {
                if(i==0 || j==0 || i==(length-1) || j==(breadth-1)){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
                
                
            }
            System.out.println();
            
        }
        

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the length of the rectangle :");
        int a=sc.nextInt();
        System.out.print("Enter the breadth of the rectangle :");
        int b=sc.nextInt();
        pattern_1(b,a);
        sc.close();
    }
    
}
