import java.util.*;
import java.lang.*;
import java.io.*;
class TestClass
{
	public static void main (String[] args) throws java.lang.Exception
	{
	  Scanner sc= new Scanner(System.in);
		int T=sc.nextInt();
		for( int test=0; test<T ; test++)
		{
			int N=sc.nextInt();
		    int a[]=new int[N];
			int minDueMonth = -1;
			int sumZeros=0;
			for(int i=0; i<N ; i++)
			{
			a[i]=sc.nextInt();
				if(a[i]==0)
				{
					sumZeros++;
					if(sumZeros==1)
						minDueMonth=i;
				}
			}
			if(minDueMonth==-1)
				minDueMonth=N;
			System.out.println(sumZeros*1000+(N-minDueMonth)*100);			
		}		
	}
} 