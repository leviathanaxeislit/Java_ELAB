import java.io.*;
import java.util.Scanner;
class Sample
{
  Scanner in = new Scanner(System.in);
   int a=1,b=1,n;
  public void getInput()
  {
    n=in.nextInt();
  }
  public void displayFib()
  {
    System.out.print(a+" "+b);
    for(int i=2;i<n; i++)
    {
      int c=a+b;
      System.out.print(" "+c);
      a=b;
      b=c;
    }
  }
}  
    
public class TestClass {
	 public static void main(String[] args) { 
		Sample objname= new Sample();
        objname.getInput();
       objname.displayFib();
	}
}