public class pyramid {
    public static void Pattern(int a){
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
               if(j<(a-(i+1))){
                System.out.print(" * ");
               }
               else{
                System.out.print("   ");
               }
                
            }
            System.out.println();
            
        }

    }
    public static void main(String[] args) {
        int c=10;
        Pattern(c);
        
    }
    
}
