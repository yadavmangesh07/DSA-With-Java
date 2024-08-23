package LeetCode;

class frcationAddition_592 {
    public static String fractionAddition(String expression) {
        int num=0;
        int deno=1;
        int i=0;
        while(i<expression.length()){
            int currentNum=0;
            int currentDeno=0;
            boolean isNegative=false;
            if(expression.charAt(i)=='-'){
                isNegative=true;
                i++;
            }
            int numStart=i;
            while(expression.charAt(i)!='/'){
                i++;

            }
            
            currentNum=Integer.parseInt(expression.substring( numStart,i));
            if(isNegative){
                currentNum*=-1;
            }
            i++;
            int denoStart=i;
            while(i<expression.length() && expression.charAt(i)!='+' && expression.charAt(i)!='-' ){
                i++;

            }
            
            currentDeno=Integer.parseInt(expression.substring(denoStart,i));

            num=(num*currentDeno)+(currentNum*deno);
            deno=deno*currentDeno;



        }
        int gcd=Math.abs(findGCD(num,deno));
        num/=gcd;
        deno/=gcd;
        return num+"/"+deno;
    }
    private static int findGCD(int num, int deno) {
        if(num==0){
            return deno;
        }
        return findGCD(deno%num, num);
        
    }
    public static void main(String[] args) {
        String expression = "-1/2+2/1";
        System.out.println(fractionAddition(expression));;

    }
}
