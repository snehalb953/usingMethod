/* PRINT SUM OF NATURAL NUMBERS WITHIN N*/


import java.util.Scanner;
class Natural
{
  public static void main(String[] args)
    {
     Scanner sc=new Scanner(System.in);
     System.out.println("enter number");
     int n=sc.nextInt();
      int sum=Natural(n);
      System.out.println(sum);; 
   }
   public static int Natural(int n)
    {
       int sum=0;
       for(int i=1;i<=n;i++)
          {
            sum=sum+i;
          }
       return sum;
   }
}
