import java.util.Scanner;
class Tempreture{
public static void main(String args[]){

int c;
int f;
System.out.println("Enter tempreture in Celsius");
Scanner sc1=new Scanner(System.in);
c= sc1.nextInt();
f= (c*9/5)+32;
System.out.println("Temprature in Fahrenheit     "+f);
}
}