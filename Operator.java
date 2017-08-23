
class Operator {
public static void main(String args[])
{
int a=5;
int b=9;

int and;
int or;
int not1;
int not2;
int xor;
or=a|b;
and=a&b;
not1=~a;
not2=~b;
xor=a^b;
System.out.println("ANS   "+and);
System.out.println("ANS   "+or);
System.out.println("ANS   "+not1);
System.out.println("ANS   "+not2);
System.out.println("ANS   "+xor);
}
}