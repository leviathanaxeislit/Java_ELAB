import java.io.*;
import java.lang.*;
import java.util.*;
public class TestClass {
	 public static void main(String[] args) { 
		  Scanner sc =new Scanner(System.in);
                int i= sc.nextInt();
                int j,k,c1=0;
                j=i/2;
                int c=0;
                for(k=2;k<=j;k++){
                        if(i%k==0){
                                if((k*k*k)==i){
                                        c1=1;           
                                }
                        }
                }
                if(c1==1){
                        System.out.println("Perfect Cube");
                }
                else{
                        System.out.println("Not A perfect cube");
                }
	}
}