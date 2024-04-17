package Strings;

// import java.util.ArrayList;

public class stringBuilder {
    public static void main(String[] args) {
    StringBuilder sb=new StringBuilder("");
    for(char i='A';i<='Z';i++){
        sb.append(i);
    }
    System.out.println(sb);
    
    System.out.println(sb.toString());
    }
    // if we initialize the sb with String instead of StringBuilder then the time complexity will be 26*n^2 where n is the length if the String (each time the loop runs every char of the previous string will be copied first the append would take place ,but this does not happens in Stringbuilder ,here the time complexity is O(26) i.e a constant)
    
}
