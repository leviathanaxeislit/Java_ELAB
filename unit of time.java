import java.io.*;
import java.util.*;
public class TestClass {
	 public static void main(String[] args) { 
	   int d,h,m,s,res;
       Scanner sc=new Scanner(System.in);
       d=sc.nextInt();
       h=sc.nextInt();
       m=sc.nextInt();
       s=sc.nextInt();
       res=(d*24*60*60)+(h*60*60)+(m*60)+s;
       System.out.println("The Total Seconds for "+d+" days "+h+" hours "+m+" minutes "+s+" seconds is "+res);
     
	}
}