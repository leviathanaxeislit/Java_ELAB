import java.io.*;
import java.util.Scanner;
public class TestClass {
	 public static void main(String[] args) { 
Scanner input=new Scanner(System.in);
       double x=input.nextDouble();
       double ar= Math.PI*x*x;
       System.out.printf("%.2f",ar);
	}
}