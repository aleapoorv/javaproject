import java.util.Scanner;
class vowel{
   public static void main(String args[])
   {
  
 Scanner sc = new Scanner(System.in);
    
System.out.println("enter an alphabet");
 
  char A =sc.nextLine().charAt(0);

      if ('a' == A)
      {
 	System.out.println("its a vowel");
      }
      else
      {
         if ('A' == A)
         {
    System.out.println("its a vowel");
         }
         else
         {
            if ('e' == A)
            {
               System.out.println("its a vowel");
            }
            else
            {
               if ('E' == A)
               {
                  System.out.println("its a vowel");
               }
               else
               {
                  if ('i' == A)
                  {
                     System.out.println("its a vowel");
                  }
                  else
                  {
                     if ('I' == A)
                     {
                       System.out.println("its a vowel");
                     }
                     else
                     {
                        if ('o' == A)
                        {
                         System.out.println("its a vowel");
                        }
                        else
                        {
                           if ('O' == A)
                           {
                            System.out.println("its a vowel");
                           }
                           else
                           {
                              if ('u' == A)
                              {
                              System.out.println("its a vowel");
                              }
                              else
                              {
                                 if ('U' == A)
                                 {
                                 System.out.println("its a vowel");
                                 }
                                 else
                                 {
                                   System.out.println("its a consonent");
                                 }
                              }
                           }
                        }
                     }
                  }
               }
            }
         }
      }
  else {
  System.out.println("invalid input")}
   }
} 
