import java.io.*;
import java.util.Scanner; 
import java.util.*;
class Century{
  Scanner sc=new Scanner(System.in);
  int year;
   public void getInput(){
   year=sc.nextInt();
   centuryFromYear(year);
     }
   public void centuryFromYear(int year){
    if(year%100==0){
      year=year/100;
      System.out.println(year);
      }
     else{
       year=year/100+1;
     System.out.println(year);
       }
  }
}
public class TestClass {
	 public static void main(String[] args) { 
       Scanner sc=new Scanner(System.in);
       Century objname=new Century();
       objname.getInput();
   	}
}