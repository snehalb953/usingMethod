import java.util.Scanner;
class HarshadNumber
{
  public static void main(String[] args)
    {
     Scanner sc=new Scanner(System.in);
     System.out.println("enter number");
     int n=sc.nextInt();
     
     boolean num=isHarshad(n);
     System.out.println(num);
    }
static boolean isHarshad(int n)
{
   return n%sumofDigits(n)==0;  
}
static int sumofDigits(int n)
{
   int sum=0;
    do{
        int d=n%10;
        sum=sum+d;
        n=n/10;
       }while(n!=0);
     return sum;
}
}