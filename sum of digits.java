import java.io.*;
import java.util.Scanner;
public class TestClass {
	 public static void main(String[] args) { 
		int n,res;
       Scanner sc=new Scanner(System.in);
       n=sc.nextInt();
       res=(n/10000)+((n/1000)%10)+((n/100)%10)+((n/10)%10)+(n%10);
       System.out.println(res);
	}
}