import java.io.*;
import java.util.Scanner;
public class TestClass {
	 public static void main(String[] args) { 
		Scanner in = new Scanner(System.in);
       int a=in.nextInt();
       System.out.println(a+" days");
       System.out.println("Month="+a/30);
       System.out.println("Days="+a%30);
	}
}