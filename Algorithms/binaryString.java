public class binaryString {
    public static void b_string(int givenSizeOfString,String sb,int lastplace){
        if(givenSizeOfString==0){
            System.out.println(sb);
            return;
        }
        b_string(givenSizeOfString-1, sb+"0", 0);
        if(lastplace==0){
            b_string(givenSizeOfString-1, sb+"1", 1);
           
            
        }
        
    }
    public static void main(String[] args) {
        int n=3;
        String s="";
        int lp=0;
        b_string(n, s, lp);

    }
    
}
