import java.util.Scanner;
class HappyNumber
{
  public static void main(String[] args)
    {
     Scanner sc=new Scanner(System.in);
     System.out.println("enter number");
     int n=sc.nextInt();
     
     boolean num=isHappy(n);
     System.out.println(num);
    }
static boolean isHappy(int n)
{
  while(n>9)
   {
     n=sumofSquare(n);
   }
  return n==1 || n==7;
}
static int sumofSquare(int n)
{
   int sum=0;
    do{
        int d=n%10;
        sum=sum+d*d;
        n=n/10;
       }while(n!=0);
     return sum;
}
}