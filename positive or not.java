import java.io.*;
import java.util.Scanner;
public class TestClass {
	 public static void main(String[] args) { 
       
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        if(number>0) {
            System.out.println (number+" is Positive");
        }
       else{
          System.out.println (number+" is Negative");
       }
		
	}
}