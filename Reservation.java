

class Reservation
{
String id,n;
int p;

Reservation(String ticket_id, String name, int phone_no)
{
id=ticket_id;
n=name;
p=phone_no;
}
public void showTicket()
{
 System.out.println("-------Reservations--------");
 System.out.println("Ticket No "+id);
 System.out.println("Name  "+n);
 System.out.println("Phone No  "+p);
}
public static void main(String[] aa)
{
Reservation r = new Reservation("qw96565","Vishesh",897684);
Reservation r1= new Reservation("qw96566","Tanvi",8976546);
Reservation r2= new Reservation("qw96567","Varuni",864465);
Reservation r3= new Reservation("qw96568","Mukul",8945447);
Reservation r4= new Reservation("qw96569","Apoorv",897684);
Reservation r5= new Reservation("qw96570","Robin",8976843);
r.showTicket();
r1.showTicket();
r2.showTicket();
r3.showTicket();
r4.showTicket();
r5.showTicket();
}
}