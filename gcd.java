import java.io.*;
import java.util.Scanner;
public class TestClass {
	 public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     int a=sc.nextInt();
     int b=sc.nextInt();
     int hcf=0;
     hcf=(a>b)?b:a;
     while(true)
       {
     if(a%hcf==0 && b%hcf==0)
       {
       System.out.println(hcf);
       break;
       }
       --hcf;     
       }
      }
}