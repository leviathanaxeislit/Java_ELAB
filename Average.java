import java.io.*;
import java.util.Scanner;
class Average
{
 static Scanner in = new Scanner(System.in);
  static int num1,num2,num3,total;
  static void getInput()
  {
    num1=in.nextInt();
    num2=in.nextInt();
    num3=in.nextInt();
    findAverage();
  }
  static void findAverage()
  {
    total=(num1+num2+num3)/3;
    System.out.println(total);
  }
}

public class TestClass {
  
	 public static void main(String[] args) { 
	   Average.getInput();
	}
}