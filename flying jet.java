import java.io.*;
import java.util.Scanner;
public class TestClass {
	 public static void main(String[] args) { 
		Scanner scan = new Scanner(System.in);
       int testCase=scan.nextInt();
       while (testCase-- != 0)
       {
         int n = scan.nextInt();
         long[] array = new long[n];
         int evenCount=1;
         int oddCount=0;
         for (int i=0;i<n;i++)
         {
           if (i%2 == 0)
           {
             array[i]= (long)Math.pow(evenCount,4);
             evenCount++;
           }
           else 
           {
             array[i]=7*((long)Math.pow(3,oddCount));
             oddCount++;
           }
         }
         System.out.println(array[n-1]);
       }
	}
}