import java.io.*;
import java.util.Scanner;
public class TestClass {
	 public static void main(String[] args) { 
	   int n;
       Scanner sc = new Scanner(System.in);
       n = sc.nextInt();
       /*while(n ! = 0)
       {
         r = n % 2;
         n /=2;
         s += r;
       }*/
       if ( (n & 1) == 0)
       {
         System.out.println("Even");
       }
       else
       {
         System.out.println("Odd");
       }
	}
}