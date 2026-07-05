/* PRINT REVERSE OF GIVEN NUMBER */


import java.util.Scanner;
class Reverse
{
  public static void main(String[] args)
    {
     Scanner sc=new Scanner(System.in);
     System.out.println("enter number");
     int n=sc.nextInt();
      int rev=rev(n);
      System.out.println(rev);
   }
   public static int rev(int n)
    {
       int rev=0;
       do{
           int r=n%10;
           rev=rev*10+r;
           n=n/10;
         }while(n!=0);
       return rev;
   }
}
