import java.util.Scanner;
class EmployeeDetails{
Scanner sc=new Scanner(System.in);
void enterData(){

int option;
System.out.println("1.Enter Data");
System.out.println("\nChoose the option:   ");
option= sc.nextInt();
}

 void displayData()
{

int option;
System.out.println("2.Display Data");
System.out.println("\nChoose the option:   ");
option= sc.nextInt();
}

 void exit()
{

int option;
System.out.println("3.Exit");
System.out.println("\nChoose the option:   ");
option= sc.nextInt();
}

public static void main(String[] args){

 EmployeeDetails h= new EmployeeDetails();
 h.enterData();
 h.displayData();
 h.exit();


}

}
