import java.io.*;
import java.util.Scanner;
class Automorphic
{
  Scanner in = new Scanner(System.in);
  public void calculate()
  {
    
  long n = in.nextInt();
  long sq = n*n;
  String num = Integer.toString((int)n);
  String square = Integer.toString((int)sq);
  boolean a = square.endsWith(num);
    System.out.print(sq);
  if(a)
    System.out.print("\nAutomorphic Number");
  else
    System.out.print("\nNot an Automorphic Number");
  }
}
public class TestClass {
	 public static void main(String[] args) { 
		Scanner in = new Scanner(System.in);
       Automorphic objname = new Automorphic();
       objname.calculate();
	}
}