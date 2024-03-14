
public class check {
   
        public static int rangeBitwiseAnd(int left, int right) {
            int res=left & left+1;
            
           for(int i=left+2;i<right;i++){
               res= res & i;
               
    
    
           }
           return res;
            
        }
   
    
    
    
    public static void main(String[] args) {
        int a=5;
        int b=7;
        System.out.println(rangeBitwiseAnd(a, b));
        
        
    }
    
}
