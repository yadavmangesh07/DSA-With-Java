package Strings;

public class shortestPath {
    public static float path(String a){
        char arr[]=a.toCharArray();
        int x=0,y=0;
        for (char c : arr) {
            if(c=='E'){
                x++;
            }
            else if(c=='W'){
                x--;
            }
            else if(c=='N'){
                y++;
            }
            else{
                y--;
            }
            
        }
        float temp1=x*x;
        float temp2=y*y;
        
        return (float)Math.sqrt(temp1+temp2);
        

    }
public static void main(String[] args) {
    String a="WNEENESENN";
    System.out.println(path(a));
    
    
    
}
    
}
