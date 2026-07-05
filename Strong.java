import java.util.Scanner;
class Strong
{
  public static void main(String [] args)
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter number");
      int x=sc.nextInt();
      boolean rs=isStrong(x);
       if(rs)
         System.out.println(x+" is strong number");
       else
         System.out.println(x+" is not strong number");

    }
  static boolean isStrong(int n)
   {
     int sum=0,t=n;
     do{
         int d=n%10;
         sum=sum+getFact(d);
         n=n/10;
        }while(n!=0);
     return sum==t;
    }
 static int getFact(int n)
  {
    int fact=1;
     while(n>1)
       {
          fact=fact*n;
           n--;
       }
    return fact;
  }
}