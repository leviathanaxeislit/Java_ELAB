import java.io.*;
import java.util.Scanner;
public class TestClass {
	 public static void main(String[] args) { 
        Scanner input = new Scanner(System.in);
        int minutes = input.nextInt();
    int year = minutes / 525600;
    int day = minutes / 21600;
       int remainingMinutes = day % 21600;
       
    System.out.println( year);
	System.out.println(remainingMinutes);	
	}
}