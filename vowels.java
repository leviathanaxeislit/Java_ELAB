import java.io.*;
import java.util.Scanner;
public class TestClass {
	 public static void main(String[] args) { 
		Scanner sc=new Scanner(System.in);
       String s=sc.next().toLowerCase();
       int l=s.length();
       int i=0,count=0;
       while(i<l){
         char c=s.charAt(i);
         if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
           count++;
         i++;
       }
       System.out.print(count);
	}
}