import java.io.*;
import java.util.Scanner;
public class TestClass {
	 public static void main(String[] args) { 
       Scanner s =new Scanner (System.in);
		int feet = s.nextInt();
       int inch = s.nextInt();
       double result= (feet*12*2.54)+(inch*2.54);
       System.out.println("Your height in centimeters is "+result);
	}
}