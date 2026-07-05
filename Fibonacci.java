/* RETURN NTH FIBONACCI NUMBER */
import java.util.Scanner;
class Fibonacci
{
  public static void main(String[] args)
   {
     Scanner sc=new Scanner(System.in);
     System.out.println("enter number");
     int n=sc.nextInt();
     
     int num=countFib(n);
     System.out.println(num);
    }
static int countFib(int n)
{
  int count=0;
  int f1=1,f2=2;
   while(f1<n)
    {
     count++;

      int f3=f1+f2;
          f1=f2;
          f2=f3;
     }
return f1;

  }
}





/* COUNT ALL FIBONACCI NUMBER WITHIN N 

import java.util.Scanner;
class Fibonacci
{
  public static void main(String[] args)
   {
     Scanner sc=new Scanner(System.in);
     System.out.println("enter number");
     int n=sc.nextInt();
     
     int num=countFib(n);
     System.out.println(num);
    }
static int countFib(int n)
{
  int count=0;
  int f1=0,f2=1;
   while(f1<=n)
    {
      count++;
      int f3=f1+f2;
          f1=f2;
          f2=f3;
     }
return count;
}
}
*/




/* PRINT FIRST N PRIME NUMBER 


import java.util.Scanner;
class Fibonacci
{
  public static void main(String[] args)
    {
     Scanner sc=new Scanner(System.in);
     System.out.println("enter number");
     int n=sc.nextInt();
     
     printFib(n);
    }
static void printFib(int n)
{
  int f1=0,f2=1;
   while(n>0)
    {
      System.out.println(f1);
      n--;
      int f3=f1+f2;
          f1=f2;
          f2=f3;
     }
}
}
*/


/* PRINT FIBONACCI NUMBER WITHIN N


import java.util.Scanner;
class FibonacciNum
{
  public static void main(String[] args)
   {
     Scanner sc=new Scanner(System.in);
     System.out.println("enter number");
     int n=sc.nextInt();
     
     printFib(n);
    }
static void printFib(int n)
{
  int f1=0,f2=1;
   while(f1<=n)
    {
      System.out.println(f1);
      int f3=f1+f2;
          f1=f2;
          f2=f3;
     }
}
}
*/