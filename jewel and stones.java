import java.io.*;
import java.util.Scanner;
public class TestClass {
	 public static void main(String[] args) { 
		Scanner sc=new Scanner(System.in);
       int test=sc.nextInt();
       while(test-->0){
       	 String jewel=sc.next();
         String mine=sc.next();
         int i=mine.length(),count=0;
         while(i-->0){
           if(jewel.contains(""+mine.charAt(i)))
              count++;
       }
              System.out.println(count);
       }
	}
}