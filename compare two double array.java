import java.io.*;
import java.util.Scanner;
public class TestClass {
	 public static void main(String[] args) { 
		Scanner sc=new Scanner(System.in);
       int x=sc.nextInt();
       int y=sc.nextInt();
       double a[]=new double[x];
       double b[]=new double[y];
       for(int i=0;i<x;i++)
         a[i]=sc.nextDouble();
       for(int i=0;i<y;i++)
         b[i]=sc.nextDouble();
       for(int i=0;i<x;i++){
         for(int j=0;j<y;j++){
           if(a[i]==b[j])
             System.out.println(a[i]);
         }
       }
	}
}