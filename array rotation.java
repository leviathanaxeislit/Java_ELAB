import java.io.*;
import java.util.Scanner;
public class TestClass {
	 public static void main(String[] args) { 
		Scanner sc=new Scanner(System.in);
       int a[]=new int[7];
       for(int i=0;i<7;i++){
       		a[i]=sc.nextInt();
         	if(i>1){
            	System.out.print(a[i]+" ");
            }
       }
       System.out.print(a[0]+" "+a[1]);
	}
}