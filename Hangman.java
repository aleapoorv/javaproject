
import java.util.Scanner;

class Hangman{
public void showMenu()
{
 int option;
 Switch(option)
{
case 1: playGame();
       break;
case 2: instructGame();
      break;
case 3: exitGame();
     break;
default:System.out.println("Incorect menu option");
      showMenu();
    break;


}
}
public static void main(String[] args)
{
Hangman hg = new Hangman();
hg.showMenu();

}

}