import java.io.*;
import java.util.*;
public class TestClass {
	 public static void main(String[] args) { 
       Scanner  sc = new Scanner(System.in);
   //    int j = sc.nextInt();
Mango m = new Summer();
       m.display();
		Mango n = new Winter();
m=n;
       m.display();
	}
}
interface Mango
{
  void display();
}
class Summer implements Mango
{
public void display()
{
System.out.println("Summer is famous for Mango Season");
}
}
class Winter implements Mango
{
public void display()
{
System.out.println("Winter is famous for Apple Season");
}
}
