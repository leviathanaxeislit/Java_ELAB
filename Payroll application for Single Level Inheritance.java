import java.io.*;
import java.util.*;
public class TestClass extends SingleInheritance  {
	 public static void main(String[] args) { 
		SingleInheritance tc = new SingleInheritance();
       tc.getDetails();
       System.out.println("Name="+name);
       System.out.println("Gender="+gender);
       System.out.println("Age="+age);
       System.out.println("Salary="+salary);
	}
}
class  SingleInheritance
{
  static String name,gender;
  static int salary,age;
 public  void  getDetails()
 {
   Scanner sc = new Scanner(System.in);
   name = sc.nextLine();
   gender = sc.nextLine();
   age = sc.nextInt();
   salary = sc.nextInt();
 }

}
  