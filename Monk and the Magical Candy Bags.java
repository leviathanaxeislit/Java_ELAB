import java.util.*;
import java.io.*;
import java.lang.*;
class TestClass
{
    public static void main(String args[] ) 
    {
        Scanner cin=new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int t=cin.nextInt();
        while(t-->0){
            long sum=0;
            PriorityQueue<Long>pq=new PriorityQueue<Long>(100000,new Comparator<Long>(){
                public int compare(Long x,Long y){
                    if(y>x)
                    return 1;
                    return -1;
                }
            });
            int n=cin.nextInt();
            int k=cin.nextInt();
            for(int i=0;i<n;i++)
            pq.add(cin.nextLong());
            
            while(k-->0){
                long x=pq.poll();
                sum+=x;
                x=(long)Math.ceil(x/2);
                pq.add(x);
            }
            System.out.println(sum);
        }
      
    }
}