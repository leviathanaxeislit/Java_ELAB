import java.io.*;
import java.util.*;
public class TestClass
{
public static void main(String[] args) 
{
        Scanner in = new Scanner(System.in);
        int x1 = in.nextInt();
        int v1 = in.nextInt();
        int x2 = in.nextInt();
        int v2 = in.nextInt();
        int x1sum=x1;
        int x2sum=x2;
        boolean test=false;
       
       while (x1sum<x2sum || x1sum>=0 && x1sum<=10000  || x2sum>=0 && x2sum<=10000)  {
            x1sum=x1sum+v1;
            x2sum=x2sum+v2;
            
            if(x1sum==x2sum){
                test=true;
                System.out.println("YES");break;
            }
        }
        if(test==false){
            System.out.println("NO");
        }       
    }
}
 