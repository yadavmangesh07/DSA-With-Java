import java.util.Scanner;

public class BinaryToDecimal {
    public static int convert(int a) {
        String b = Integer.toString(a);
        int c = b.length();
        int power = 0;
        int deci = 0;

        while (c > 0) {
            int d = a % 10;
            deci += d * Math.pow(2, power);
            a /= 10;  
            power++;
            c--;
        }
        return deci;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the binary number:");
        int a = sc.nextInt();
        System.out.println(convert(a));
        sc.close();
    }
}
