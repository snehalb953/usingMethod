/* SUM OF GIVEN DIGITS */

import java.util.Scanner;
class SumofDigit
{
  public static void main(String[] args)
    {
     Scanner sc=new Scanner(System.in);
     System.out.println("enter number");
     int n=sc.nextInt();
      int r=Sumdigit(n);
      System.out.println(r);
   }
   public static int Sumdigit(int n)
    {
       int x=0;
       do{
           int r=n%10;
               x=x+r;
               n=n/10;
         }while(n!=0);
       return x;
   }
}
