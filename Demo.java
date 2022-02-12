import java.io.*;
import java.util.*;

class Palindrome
{

 	
	String str;
	Palindrome(String str){
		this.str=str;
	}
	public int check(){
	      int l=str.length();
	      if(l==1) {
		return 1;
	      }
	      for(int i=0;i<l/2;i++){
		if(str.charAt(i)!=str.charAt(l- 1-i)){
		   return 0;
		}
	      }
	      return 1;
	}
 }






public class Demo{

     public static void main(String []args) {
   
      
         Scanner sc=new Scanner(System.in);
   
	String str=sc.nextLine(); 
                Palindrome p=new Palindrome(str);
	int x;
	x=p.check();
	if(x==1){
	  System.out.println("String is Palindrome");
	}
	else {
	  System.out.println("String is not Palindrome");
	}
 
       }

}
