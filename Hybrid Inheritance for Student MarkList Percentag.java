import java.io.*;
import java.util.Scanner;
interface Exam
{
  void percent_cal();
}
class Student
{
  String name;
  int roll_no, mark1, mark2;
  Student(String n, int r, int m1, int m2)
  {
    name=n;
    roll_no=r;
    mark1=m1;
    mark2=m2;
  }
  void display()
  {
    System.out.println("Name of Student="+name);
    System.out.println("Roll No of Student="+roll_no);
    System.out.println("Marks of Subject 1="+mark1);
    System.out.println("Marks of Subject 2="+mark2);
  }
}
class Result extends Student implements Exam
{
  Result(String n, int r, int m1, int m2)
  {
    super(n,r,m1,m2);
  }
  public void percent_cal()
  {
    int total = mark1+mark2;
    float percentage = total/(float)2;
    System.out.print("Percentage="+percentage+"%");
  }
  void display()
  {
    super.display();
  }
}
public class TestClass {
	 public static void main(String[] args) { 
		Scanner in = new Scanner(System.in);
        String name=in.next();
        int regno=in.nextInt();
        int mark1=in.nextInt();
        int mark2=in.nextInt();
        Result R = new Result(name,regno,mark1,mark2);
        R.display();
        R.percent_cal();
	}
}