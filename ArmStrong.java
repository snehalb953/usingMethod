import java.util.Scanner;
class ArmStrong
{
  public static void main(String [] args)
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter number");
      int x=sc.nextInt();
      boolean rs=isArmStrong(x);
      if(rs)
      System.out.println(x+" is arm strong number");
      else
       System.out.println(x+" is not arm strong number");
    }
   static boolean isArmStrong(int n)
     {
        int sum=0,t=n;
         int dc=countDigit(n);
           do{
               int d=n%10;
               sum=sum+getPow(d,dc);
               n=n/10;
              }while(n!=0);
        return sum==t;
   }
static int countDigit(int n)
 {
   int count=0;
    do{
        count++;
        n=n/10;
       }while(n!=0);
   return count;
  }
static int getPow(int n,int p)
  {
    int prod=1;
     while(p>0)
       {
          prod=prod*n;
          p--;
       }
    return prod;
  }
}
  