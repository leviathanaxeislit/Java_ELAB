import java.io.*;
import java.util.Scanner;
public class TestClass {
	 public static void main(String[] args) {
       int n,count = 0, a;
       String x = "";
		Scanner s = new Scanner(System.in);
       n=s.nextInt();
       while(n>0)
       {
         a=n%2;
        /* if(a==1){count++;}*/ //for counting the no. of 1's
         x=a+""+x;
         n=n/2;
       }
       System.out.println(x);
       
         
	}
}