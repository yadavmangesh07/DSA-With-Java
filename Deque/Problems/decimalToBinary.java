package Deque.Problems;

public class decimalToBinary {
    public static String decToBinary(int x) {
        StringBuilder sb = new StringBuilder();
        
        for (int i = 1; i <= x; i++) {
            int num = i;
            StringBuilder binaryRepresentation = new StringBuilder();

            while (num > 0) {
                binaryRepresentation.insert(0, num % 2);
                num = num / 2;
            }

            sb.append(binaryRepresentation);
            if (num<1) {
                sb.append(" ");
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        int x = 5;
        System.out.println(decToBinary(x));
    }
}
