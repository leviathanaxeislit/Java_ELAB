import java.io.*;
import java.util.Scanner;
public class TestClass {
	 public static void main(String[] args) { 
		Scanner sc=new Scanner(System.in);
       int x,y;
       x=sc.nextInt();
       y=sc.nextInt();
       int a[]=new int[x];
       int b[]=new int[y];
       for(int i=0;i<x;i++){
       		a[i]=sc.nextInt();
       }
       for(int i=0;i<y;i++){
       		b[i]=sc.nextInt();
       }
       for(int i=0;i<x;i++){
       		for(int j=0;j<y;j++){
            	if(a[i]==b[j]){
                	System.out.print(a[i]+" ");
                }
            }
       }
	}
}