import java.util.Scanner;
public class TestClass {
	 public static void main(String[] args) { 
       Scanner ob=new Scanner(System.in);
       double d=ob.nextDouble();
       System.out.println("Loaves Discount");
       int a=(int)d;
       System.out.println("Regular Price "+a*185);
       double t1=Math.round(d*0.60*185);
       System.out.println("Total Discount "+t1);
       double t2=Math.round(d*0.40*185);
       System.out.println("Total Amount to be paid "+t2);
		
	}
}