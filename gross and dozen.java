import java.io.*;
import java.util.Scanner;
public class TestClass {
	 public static void main(String[] args) { 
     Scanner sc=new Scanner(System.in);
     int a=sc.nextInt();
     int b=a/144;
     int c=(a-b*144)/12;
     int d=(a-b*144)%12;
     System.out.println("Your number of eggs is="+d);
     System.out.println("gross="+b);
     System.out.println("dozen="+c);
		
	}
}