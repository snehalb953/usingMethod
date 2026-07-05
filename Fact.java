/* FACTORIAL OF N */


import java.util.Scanner;
class Fact
{
  public static void main(String[] args)
    {
     Scanner sc=new Scanner(System.in);
     System.out.println("enter number");
     int n=sc.nextInt();
      int res=fact(n);
      System.out.println(res);
   }
   public static int fact(int n)
    {
       int res=1;
       for(int i=1;i<=n;i++)
          {
            res=res*i;
          }
       return res;
   }
}
