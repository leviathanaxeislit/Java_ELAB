import java.io.*;
import java.util.Scanner;
public class TestClass {
	 public static void main(String[] args) { 
		Average obj=new Average();
       obj.getMarks();
       obj.displayPercentage();
	}
}
class Average{
  double total;
   public void getMarks(){
    Scanner sc=new Scanner(System.in);
    int t=5;
    while(t-->0)
    total+=sc.nextDouble();
  }
   public void displayPercentage(){
    System.out.println(total/5+"\n"+total/5.0+"%");
  }
}