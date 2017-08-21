import java.util.Scanner;
public class DistanceCalculator{

public static void main(String args[])
{
Scanner sc1=new Scanner(System.in);
   int d;
   int u;
   int a;
   int t;
  System.out.println("Enter velocity");
   u= sc1.nextInt();
 sc1.nextLine();
  System.out.println("Enter accleration");
      a= sc1.nextInt();

   System.out.println("Enter time");
    t=sc1.nextInt();
   
   d=u*t+a*t*t/2;
 System.out.println("distance       "+d);
}

}	