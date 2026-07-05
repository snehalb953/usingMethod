/* PRINT MULTIPLE OF 3 */


import java.util.Scanner;
class Multiple
{
  public static void main(String[] args)
    {
     Scanner sc=new Scanner(System.in);
     System.out.println("enter number");
     int n=sc.nextInt();
      int multi=Multi3(n);
      System.out.println(multi);
   }
   public static int Multi3(int n)
    {
       int a=3;
       int x=0;
       for(int i=1;i<=3;i++)
          {
            x=a*i;
          }
       return x;
   }
}
