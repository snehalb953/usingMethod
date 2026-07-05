import java.util.Scanner;
class Difference
{
  public static void main(String [] args)
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter number");
      int n=sc.nextInt();
      int diff=getDigit(n);
      System.out.println(diff);
  }
static int getDigit(int n)
  {
    int diff,digit;
    int big=-9;
    int small=9;
    do{
        digit=n%10;
         if(digit>big)
           big=digit;
         if(digit<small)
           small=digit;
        n=n/10;
     }while(n!=0);
 diff=big-small;
return diff;
}
}
