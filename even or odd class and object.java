import java.io.*;
import java.util.Scanner;
public class TestClass {
  	int a;
	public void read(){
    	Scanner sc=new Scanner(System.in);
      	a=sc.nextInt();
       
    }
  	public void disp(){
    	if(a%2==0){
        	System.out.println(a+" is Even");
        }
        else{
        	System.out.println(a+" is Odd");
        }
    }
  	public static void main(String[] args) { 
		TestClass tc=new TestClass();
    	tc.read();
      	tc.disp();
    }
}