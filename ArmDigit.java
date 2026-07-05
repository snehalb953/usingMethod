/* PRINT 3 DIGIT ARM STRONG NUMBER */
import java.util.Scanner;
class ArmDigit
{
  public static void main(String[] args)
   {
     Scanner sc=new Scanner(System.in);
     System.out.println("enter number");
     int n=sc.nextInt();
     
     armDigit();
    }
static void armDigit()
{
   for(int i=100;i<=999;i++)
     {
        if(isArmDigit(i))
          {
           System.out.println(i);
         }       
    }
}
static boolean isArmDigit(int n)
 {
   int sum=0,t=n;
     do{
         int r=n%10;
         sum=sum+r*r*r;
         n=n/10;
        }while(n!=0);
   return sum==t;
  }
}

