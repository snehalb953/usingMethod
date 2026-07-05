import java.util.Scanner;
class Emrip
{
  public static void main(String[] args)
    {
     Scanner sc=new Scanner(System.in);
     System.out.println("enter number");
     int n=sc.nextInt();
     boolean emrip=isEmrip(n);
     System.out.println(emrip);
    }
static boolean isEmrip(int n)
{
  return isPrime(n) && isPrime(reverse(n));
}
static boolean isPrime(int n)
{
    if(n<1)
      return false;
   for(int i=2;i<=n/2;i++)
       {
          if(n%i==0)
             return false;
       }
   return true;
 }
static int reverse(int n)
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

