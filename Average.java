import java.util.Scanner;
class Average
{
  public static void main(String [] args)
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter number");
      int n=sc.nextInt();
      double avg=getAvg(n);
      System.out.println(avg);
    }
 static double getAvg(int n)
   {
      int res=0;
      res=sumofDigits(n)/noofDigits(n);
    return res;   
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
static int noofDigits(int n)
   {
     int count=0;
      do{
             int d=n%10;
             count++;
             n=n/10;
        }while(n!=0);
  return count;
  }
}
    