import java.io.*;
import java.util.Scanner;
public class TestClass {
	 public static void main(String[] args) { 
       Scanner sc =new Scanner (System.in);
       double temperature = sc.nextDouble();
       double v=sc.nextDouble();
       double twc=35.74+0.6215*temperature-35.75*Math.pow(v,0.16)+0.4275*temperature*Math.pow(v,0.16);
       String output = String.format("%.2f",twc);
       System.out.println("The wind chill index is "+output);
	}
}