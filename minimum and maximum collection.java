import java.io.*;
import java.util.*;
public class TestClass {
	 public static void main(String[] args) { 
		Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       Integer arr[]=new Integer[n];
       for(int i=0;i<n;i++)
         arr[i]=sc.nextInt();
       
       int mini=(int) Collections.min(Arrays.asList(arr));
       int maxi=(int) Collections.max(Arrays.asList(arr));
       System.out.println(mini+"\n"+maxi);
	}
}