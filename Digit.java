import java.util.Scanner;
class Digit
{
  public static void main(String[] args)
    {
     Scanner sc=new Scanner(System.in);
     System.out.println("enter number");
     int n=sc.nextInt();
      int r=digit(n);
      System.out.println(r);
   }
   public static int digit(int n)
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
