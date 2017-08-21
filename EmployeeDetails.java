import java.util.Scanner;
class EmployeeDetails{
public void showmenu()
{
int option;
Scanner sc= new Scanner(System.in);
System.out.println("1.Enter Data");
System.out.println("2.Update");
System.out.println("3.Display Data");
System.out.println("4.Exit");
System.out.print("\nChoose the option:");
option = sc.nextInt();
}
public static void main(String[] args)
{
   EmployeeDetails h= new EmployeeDetails();
     h.showmenu();
}
}