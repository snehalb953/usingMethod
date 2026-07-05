/* PRINT SMALLEST NUMBER IN THE GIVEN NUMBER */


import java.util.Scanner;
class Smallest
{
  public static void main(String[] args)
    {
     Scanner sc=new Scanner(System.in);
     System.out.println("enter number");
     int n=sc.nextInt();
      int rev=Small(n);
      System.out.println(rev);
   }
   public static int Small(int n)
    {
       int smallest=9;
       do{
           int r=n%10;
           if(r<smallest)
             {
               smallest=r;
             }
           n=n/10;
         }while(n!=0);
       return smallest;
   }
}
