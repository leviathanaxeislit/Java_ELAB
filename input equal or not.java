import java.io.*;
import java.util.Scanner;
public class TestClass {
	 public static void main(String[] args) { 
       Scanner sc = new Scanner(System.in);
         double a,b;
         a = sc.nextDouble();
         b = sc.nextDouble();
        if(a == b)
        {
          System.out.println("They are the same");
        }
       else
       {
         System.out.println("They are different");
       }
		
	}
}