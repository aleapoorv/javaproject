	
import java.util.Scanner;
public class SalaryCalculator{

public static void main(String args[])	
{
	int hra;
	int specialallowance;
	int pf;
	int netpayablesalary;
	int basicsalary;
	System.out.println("Enter Your Basicsalary");
	Scanner sc1= new Scanner(System.in);
	basicsalary= sc1.nextInt();
	hra=(50*basicsalary)/100;
	specialallowance=(75*basicsalary)/100;
	pf=(12*basicsalary/100);
	netpayablesalary=basicsalary+hra+specialallowance-pf;
	System.out.println("Basicsalary        ="+basicsalary);
	System.out.println("HRA                ="+hra);
	System.out.println("PF                 ="+pf);
	
	System.out.println("--------------------");
	System.out.println("Net payable salary"+netpayablesalary);

}
}