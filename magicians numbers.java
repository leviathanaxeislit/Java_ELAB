import java.io.*;
import java.util.Scanner;
public class TestClass {
	 public static void main(String[] args) { 
		Scanner sc=new Scanner(System.in);
       int t=sc.nextInt();
       while(t-->0){
       int n=sc.nextInt();
         while(n>0){
         System.out.print(n%10);
           n/=10;
         }
         System.out.println();
       }
	}
}