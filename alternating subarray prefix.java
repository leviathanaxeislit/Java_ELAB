import java.io.*;
import java.util.Scanner;
public class TestClass {
	 public static void main(String[] args) { 
       Sample objname=new Sample();
       objname.subarray();
		
	}
}
class Sample{
  public void subarray(){
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    while(t-->0){
      int n=sc.nextInt();
      int arr[]=new int[n];
      for(int i=0;i<n;i++){
        int x=sc.nextInt();
        if(x>0)
          arr[i]=1;
        else
          arr[i]=-1;
       }
     for(int i=0;i<n;i++){
        int sum=1;
        for(int j=i;j<n-1;j++){
          if(arr[j]==-arr[j+1]){
            sum++;
          }
          else{
            j=n;
          }
         }
        System.out.print(sum+" ");
      }
      System.out.println();
    }
  }
}