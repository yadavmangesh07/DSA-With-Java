package Strings;
import java.util.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
		    StringBuilder sb=new StringBuilder();
		    String a=sc.nextLine();
		    String b=sc.nextLine();
		    for(int i=0;i<a.length();i++){
		        if(a.charAt(i)==b.charAt(i)){
		            sb.append("G");
		        }
		        else{
		            sb.append("B");
		        }
		        
		    }
		    System.out.println(sb.toString());
			sc.close();
		    
		}

	}
}

