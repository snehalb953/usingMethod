import java.util.Scanner;
class Date
{
  public static void main(String[] args)
    {
     Scanner sc=new Scanner(System.in);
     System.out.println("enter number");
     int n=sc.nextInt();
     
     boolean  num=isGetDate(n);
     System.out.println(num);
    }
static Boolean isGetDate(int n)
{
  return isDate(n) || isMonth(n) || isYear(n);
}
static boolean isDate(int n)
{
  int d=3;
{
  if(d>=1 && d<=31)
  return false;
}
return true;
}
static boolean isMonth(int n)
{
 int m=4;
 {
  if(m>=1 && m<=12)
  return false;
}
return true;
}
static boolean isYear(int n)
{
  int yr=2002;
 {
   if(yr<1)
   return false;
}
return true	;
}
}