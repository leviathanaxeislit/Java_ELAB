import java.io.*;
import java.util.Scanner;
public class TestClass {
	 public static void main(String[] args) { 
		Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       System.out.println("First "+n+" prime numbers are :-");
       for(int i=1,k=1;k<=n;i++){
         int f=0;
       	for(int j=1;j<=i;j++){
        	if(i%j==0)
              f++;
        }
         if(f==2){
           System.out.println(i);
           k++;
         }
         
       }
	}
}