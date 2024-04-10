package Queue;
import java.util.*;

public class nonRepeatingLetterInStream {
    public static char func(String s){
    int []freq=new int[26];
    char c=' ';
    Queue<Character> q=new LinkedList<>();
    for (int i = 0; i < s.length(); i++) {
        char ch=s.charAt(i);
        q.add(ch);
        freq[ch-'a']++;//determine the character and increase the frequency at the required index
        while(!q.isEmpty() && freq[q.peek()-'a']>1){
            
                q.remove();
           
        }
        if(q.isEmpty()){}//if all the  characters are removed from the queue
            
        else{//if a breaking point is found in the queue where freq of character from the starting of the queue
            c=q.peek();
            //print the non reapeating character
        }
        
        
    }
    return c;



    }
    public static void main(String[] args) {
        String a="aabccxb";
        System.out.println(func(a));
    }
    
}
