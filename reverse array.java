import java.io.*;
import java.util.Scanner;
public class TestClass {

	 public static void main(String[] args) {
       Reverse obj=new Reverse();
       obj.getInput();
       obj.arrayReverse();
	}
}
class Reverse{
  public int n,arr[];
	public void getInput(){
      Scanner sc=new Scanner(System.in);
      n=sc.nextInt();
      arr=new int[n];
      for(int i=0;i<n;i++)
        arr[i]=sc.nextInt();
    }
  public void arrayReverse(){
    for(int i=n-1;i>=0;i--)
      System.out.print(arr[i]+" ");
  }
}