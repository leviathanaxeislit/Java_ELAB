import java.io.*;
import java.util.Scanner;
public class TestClass {
	 public static void main(String[] args) { 
		Scanner in = new Scanner(System.in);
       String l;
       int ct=0;
       l=in.nextLine();
       for(int i=0; i<l.length(); i++)
         if(l.charAt(i)==' ')
           ct++;
       System.out.print(ct+1);
	}
}