
import java.util.Scanner;
	public class prime{

   public static void main(String[] args)
   {
    Scanner sc1=new Scanner(System.in);
    
      int N;
      
     System.out.println("enter a number");
    N= sc1.nextInt(); 
     
     int i = 2;
      if (i <= N / 2)
      {
         while (N % i == 0)
         {
            i = i + 1;
         }
         if ( 'N' == i)
         {
             System.out.println("Number is prime");
         }
         else
         {
           System.out.println("Number is not prime");
         }
      }
      else
      {
        System.out.println("Number is prime");
      }
   }
}
