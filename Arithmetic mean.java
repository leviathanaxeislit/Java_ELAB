import java.io.*;
import java.util.Scanner;
public class TestClass {
	 public static void main(String[] args) { 
		Mean obj = new Mean();
       obj.getMean();
       obj.calculateMean();
	}
}
class Mean
{
  int a[] = new int[30];
  int n;
  int i;
  Scanner sc = new Scanner(System.in);
 public void getMean()
 {
   n = sc.nextInt();
   for(int i=0;i<n;i++)
a[i]=sc.nextInt();
 }
  public void calculateMean()
{
    int total = 0;
    for(i=0;i<n;i++)
  {
  total += a[i];
  }
    int mean = total/n;
    System.out.print(mean);
  }
}