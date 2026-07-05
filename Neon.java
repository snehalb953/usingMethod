import java.util.Scanner;
class Neon
{
  public static void main(String[] args)
    {
     Scanner sc=new Scanner(System.in);
     System.out.println("enter number");
     int n=sc.nextInt();
     
     boolean num=isNeon(n);
     System.out.println(num);
    }
static boolean isNeon(int n)
{
  return n==sumofDigit(n*n);
}
static int sumofDigit(int x)
 {
  int sum=0;
   do{
       sum=sum+x%10;
       x=x/10;
      }while(x!=0);
   return sum;
  }
}