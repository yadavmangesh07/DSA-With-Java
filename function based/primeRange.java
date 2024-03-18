import java.util.ArrayList;

public class primeRange {
    public static ArrayList<Integer> isPrime(int a, int b) {
        boolean flag = true;
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = a; i <= b; i++) {
            flag=true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i%2==0 || i % j == 0) {
                    flag = false;
                    break;

                } 
                
            }
            if(flag==true && i!=1){

                    list.add(i);
                }
            

        }

    return list;

    }

    public static void main(String[] args) {
        int a = 1;
        int b = 50;
        System.out.println(isPrime(a, b));

    }

}
