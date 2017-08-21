import java.util.Scanner;
public class Volume{

public static void main(String args[]){
Scanner sc1= new Scanner(System.in);
int r;
int h;
int volume;
System.out.println("Enter radius");
 r=sc1.nextInt();
System.out.println("Enter height");
 h=sc1.nextInt();
volume=r*r*h*22/7;
System.out.println("Volume of Cylinder     "+volume);
}
}