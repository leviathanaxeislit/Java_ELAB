import java.util.*;
public class TestClass {
	 public static void main(String[] args) { 
       Scanner ob=new Scanner(System.in);
       String str=ob.nextLine();
       String str1=ob.nextLine();
       if(str.contains(str1))
         System.out.println("YES");
       else
         System.out.println("NO");
		
	}
}