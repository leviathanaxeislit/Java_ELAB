import java.io.*;
import java.util.*;
public class TestClass {
	 public static void main(String[] args) { 
		Scanner sc = new Scanner(System.in);
       int rows= sc.nextInt();
       for(int i = 1;i<=rows;i++)
       {
         for(int j= rows;j>=i;j--)
         {
           System.out.print(j+" ");
         }
         System.out.println();
       }
       sc.close();
	}
}