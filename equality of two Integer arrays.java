import java.io.*;
import java.util.*;
public class TestClass {
	 public static void main(String[] args) { 
		Scanner sc=new Scanner(System.in);
       int n,n2;
       n=sc.nextInt();
       n2=sc.nextInt();
       int a[]=new int[n];
       int b[]=new int[n];
       for(int i=0;i<n;i++){
       		a[i]=sc.nextInt();
       }
       for(int i=0;i<n;i++){
       		b[i]=sc.nextInt();
       }
       if(Arrays.equals(a,b)){
       		System.out.println("YES");
       }
       else{
       		System.out.println("NO");
       }
	}
}