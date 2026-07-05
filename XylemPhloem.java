import java.util.Scanner;
class XylemPhloem
{
  public static void main(String[] args)
    {
     Scanner sc=new Scanner(System.in);
     System.out.println("enter number");
     int n=sc.nextInt();
     String res=isXylemPhloem(n);
     System.out.println(res);
    }
 static String isXylemPhloem(int n)
   {
     int es=0,ms=0,t=n;
      do{
          int d=n%10;
          if(n==t || n==d)
           es=es+d;
          else
           ms=ms+d;
         n=n/10;
        }while(n!=0);
    if(es==ms)
       return "xylem";
     else
        return "phloem";
  }
}
