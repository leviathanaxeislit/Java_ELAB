import java.io.*;
import java.util.Scanner;
import java.util.Arrays;
public class TestClass {
	 public static void main(String[] args) { 
		Scanner sc=new Scanner(System.in);
       int t=sc.nextInt();
       while(t-->0){
       	 int n=sc.nextInt();
         int m=sc.nextInt()+n;
         int a[]=new int[m];
         for(int i=0;i<m;i++)
           a[i]=sc.nextInt();
          
         Arrays.sort(a);
         
         for(int i=m-1;i>=0;--i)
         System.out.print(a[i]+" ");
      
         System.out.println();
       }
	}
}