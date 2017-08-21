import java.util.Scanner;
public class calculator{
  public static void main(String args[])
{
Scanner sc1=new Scanner(System.in);  
int a;
   int b;
  int result;
  System.out.println("Enter first number");
   
        a= sc1.nextInt();
  System.out.println("Enter second number");
    
     b= sc1.nextInt();
    sc1.nextLine();
System.out.println("Enter the operator");

char q=sc1.nextLine().charAt(0);

if(q=='+'){
 result=a+b;
System.out.println("Result         "+result);
 }
 else if(q=='-'){
  result=a-b;
System.out.println("Result         "+result); 
}
 else if(q=='*'){
result=a*b;
System.out.println("Result         "+result); 
} 
 else if(q=='/'){
result=a/b;
System.out.println("Result        "+result);
}
 else {
System.out.println("INVALID CHARACTER");
} 
}
}
