import java.io.*;
import java.util.Scanner;
import java.util.Arrays;
public class TestClass 
{
private static void moveZeroToEnd(int[] inputArray)
{
		int index = 0,i=0;
		int nonZeros = 0;
		int length = inputArray.length;
		while (index < length)
        {

			if (inputArray[index] != 0) 
            {
				inputArray[nonZeros++] = inputArray[index];
			}
			index++;
		}

		while (nonZeros < length) 
        {
			inputArray[nonZeros++] = 0;
		}
  for(i=0;i<length;i++)
		System.out.print(inputArray[i]+" ");
	}

	public static void main(String[] args)
    {
     Scanner in=new Scanner(System.in);
      int a=in.nextInt();
		int arr[] =new int[a];
      for(int i=0;i<a;i++)
        arr[i]=in.nextInt();
		String sArray = Arrays.toString(arr);
		//System.out.printf("1. Move zeros of array %s to end :", sArray);
		moveZeroToEnd(arr);
	}
}