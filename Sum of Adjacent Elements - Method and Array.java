import java.io.*;
import java.util.Scanner;
class Sample{
  Scanner sc=new Scanner(System.in);
    int temp;
  public int adjacentElementsSum(int[] arr,int n){
    temp=arr[0]+arr[1];
    for(int i=0;i<n-1;i++){
      if((arr[i]+arr[i+1])>temp){
        temp=arr[i]+arr[i+1];
        }
      }
    return temp;
    }
  }
public class TestClass {
	 public static void main(String[] args) { 
       Scanner sc=new Scanner(System.in);
       Sample obj=new Sample();
       int a=sc.nextInt();
       int[] b=new int[a];
       for(int i=0;i<a;i++){
         b[i]=sc.nextInt();
         }
       int c=obj.adjacentElementsSum(b,a);
       System.out.println(c);
 }
}