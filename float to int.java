import java.io.*;
import java.util.Scanner;
public class TestClass {
	 public static void main(String[] args) { 
       
       Scanner input = new Scanner(System.in);
      float a = input.nextFloat();
     // float a = 8.61f;
      int b = (int)Math.round(a);
      System.out.println(+ b);
		
	}
}