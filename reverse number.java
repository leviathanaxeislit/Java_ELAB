import java.io.*;
import java.util.Scanner;
public class TestClass {
	 public static void main(String[] args) { 
       
       int num , reversed = 0;
       Scanner in = new Scanner(System.in);
       num = in.nextInt();

        while(num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }

        System.out.println( + reversed);
		
	}
}