import java.io.*;
import java.util.Scanner;
class Sample
{
  public double distanceBetweenTwoPoints(double lat1, double lon1, double lat2, double lon2)
  {
        lat1 = Math.toRadians(lat1);
        lon1 = Math.toRadians(lon1);
        lat2 = Math.toRadians(lat2);
        lon2 = Math.toRadians(lon2);
        double earthRadius = 6371.01;
        return earthRadius * Math.acos(Math.sin(lat1)*Math.sin(lat2) + Math.cos(lat1)*Math.cos(lat2)*Math.cos(lon1 - lon2));
  }
}
    public class TestClass 
    {
   public static void main(String[] args)
   {
        Scanner input = new Scanner(System.in);
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        Sample obj=new Sample();
        double a;
        a=obj.distanceBetweenTwoPoints(x1, y1, x2, y2);
        System.out.printf("%.2f", a);    
    }
}