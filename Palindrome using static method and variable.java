import java.util.*;
public class TestClass {
	 public static void main(String[] args) { 
		Sample.getInput();
	}
}
class Sample
{
  public static void getInput()
  {
    Scanner ob=new Scanner(System.in);
    String str=ob.next();
    checkPalindrome(str);
  }
  public static void checkPalindrome(String str)
  {
   String str1=new StringBuffer(str).reverse().toString();
   if(str.equals(str1))
  System.out.println(str+" is a palindrome");
    else
      System.out.println(str+" is not a palindrome");
  }
}