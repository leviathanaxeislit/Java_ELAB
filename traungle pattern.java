import java.io.*;
import java.util.Scanner;
public class TestClass {
	 public static void main(String[] args) { 
		Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();int i,j;
       for(i=1;i<=n;i++)
       {for(j=1;j<=i;j++)
       {
				System.out.print(((i+j)%2)+" ");
			}
			System.out.print("\n");}
	}
}