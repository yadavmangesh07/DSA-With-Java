public class prime {
    public static boolean checkPrime(int a) {
        boolean flag = true;

        // <----optimized----->
        // if(a!=1){
        // for (int i = 2; i<=Math.sqrt(a); i++) {
        // if(a%i==0 ){
        // flag=false;
        // break;

        // }

        // }

        // }
        // else{
        // flag=false;
        // }
        if (a != 1) {
            for (int i = 2; i < a; i++) {
                if (a % i == 0) {
                    flag = false;
                    break;

                }

            }

        } else {
            flag = false;
        }
        return flag;
    }

    public static void main(String[] args) {
        int a = 2;
        System.out.println(checkPrime(a));

    }

}
