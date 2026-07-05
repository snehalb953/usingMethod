/* RETURN NTH PRIME NUMBER */
import java.util.Scanner;
class PrimeNum
{
  public static void main(String[] args)
    {
     Scanner sc=new Scanner(System.in);
     System.out.println("enter number");
     int n=sc.nextInt();
     
     int num=countPrime(n);
     System.out.println(num);
    }
static int countPrime(int n)
{
  int count=0,num=2;
   while(count<n)
     {
        if(isPrime(num))
         count++;
         num++;
     }
  return num-1;
}
static boolean isPrime(int n)
  {
    for(int i=2;i<=n/2;i++)
      {
        if(n%i==0)
          return false;
     }
     return true;
  }

}



/* CALCULATE THE SUM OF FIRST N PRIME NUMBERS 
import java.util.Scanner;
class PrimeNum
{
  public static void main(String[] args)
    {
     Scanner sc=new Scanner(System.in);
     System.out.println("enter number");
     int n=sc.nextInt();
     
     printPrime(n);
    }
static void printPrime(int n)
{
  int sum=0;
  for(int i=2;n>0;i++)
    {
      if(isPrime(i))
        {
          sum=sum+i;
          System.out.println(sum);
          n--;
        }
    }
}
static boolean isPrime(int n)
  {
    for(int i=2;i<=n/2;i++)
      {
        if(n%i==0)
          return false;
     }
     return true;
  }
}
*/




/*SUM OF ALL THE PRIME NUMBERS WITHIN N 
import java.util.Scanner;
class PrimeNum
{
  public static void main(String[] args)
    {
     Scanner sc=new Scanner(System.in);
     System.out.println("enter number");
     int n=sc.nextInt();
     
     printPrime(n);
    }
static void printPrime(int n)
{
  int sum=0;
  for(int i=2;i<=n;i++)
    {
      if(isPrime(i))
        {
          sum=sum+i;
          System.out.println(sum);
        }
    }
}
static boolean isPrime(int n)
  {
    for(int i=2;i<=n/2;i++)
      {
        if(n%i==0)
          return false;
     }
     return true;
  }

}
*/



/* COUNT PRIME NUMBERS WITHIN N 
import java.util.Scanner;
class PrimeNum
{
  public static void main(String[] args)
    {
     Scanner sc=new Scanner(System.in);
     System.out.println("enter number");
     int n=sc.nextInt();
     
     int num=countPrime(n);
     System.out.println(num);
    }
static int countPrime(int n)
{
  int count=0;
  for(int i=2;i<=n;i++)
    {
      if(isPrime(i))
        {
          count++;
        }
    }
return count;
}
static boolean isPrime(int n)
  {
    for(int i=2;i<=n/2;i++)
      {
        if(n%i==0)
          return false;
     }
     return true;
  }

}
*/
 



/* PRINT FIRST N PRIME NUMBER 
import java.util.Scanner;
class PrimeNum
{
  public static void main(String[] args)
    {
     Scanner sc=new Scanner(System.in);
     System.out.println("enter number");
     int n=sc.nextInt();
     
     printPrime(n);
    }
static void printPrime(int n)
{
  for(int i=2;n>0;i++)
    {
      if(isPrime(i))
        {
          System.out.println(i);
          n--;
        }
    }
}
static boolean isPrime(int n)
  {
    for(int i=2;i<=n/2;i++)
      {
        if(n%i==0)
          return false;
     }
     return true;
  }
}
*/





/* PRINT  ALL PRIME NUMBER WITHIN N
import java.util.Scanner;
class PrimeNum
{
  public static void main(String[] args)
    {
     Scanner sc=new Scanner(System.in);
     System.out.println("enter number");
     int n=sc.nextInt();
     
     printPrime(n);
    }
static void printPrime(int n)
{
  for(int i=2;i<=n;i++)
    {
      if(isPrime(i))
        {
          System.out.println(i);
        }
    }
}
static boolean isPrime(int n)
  {
    for(int i=2;i<=n/2;i++)
      {
        if(n%i==0)
          return false;
     }
     return true;
  }

}
*/
