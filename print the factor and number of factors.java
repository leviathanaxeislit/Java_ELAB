import java.io.*;
import java.util.*;
public class TestClass {
	 public static void main(String[] args) {
       int i,count=0;
		Scanner sc = new Scanner (System.in);
       int number = sc.nextInt();
        for( i=1; i <= number; ++i)
    {
        if (number%i == 0)
        {
            System.out.print(i+" ");
          count++;
        }
        }
       System.out.println();
       System.out.println(count);
	}
}