import java.util.ArrayList;

public class decimalToBinary {
    public static ArrayList<Integer> change(int a){
        ArrayList<Integer> mylist=new ArrayList<>();
        while(a>0){
            
            int c=a%2;
            mylist.add(0,c);//**trick---->(adding every element at 0 such that the exisitng element will automatically shifted to higher index)
            a=a/2;
        }
        System.out.print("Binary Value is :");
        for (int string : mylist) {
            System.out.print(string);
            
        }
        System.out.println();
        
        return mylist;
    }
    public static void main(String[] args) {
        int a=108;
       change(a);
    //    System.out.println(change(a));
        
    }
}
