/* NUMBER CONVERSION USING METHODS */

import java.util.Scanner;
class Conversion
{
  public static void main(String[] args)
    {
     Scanner sc=new Scanner(System.in);
     System.out.println("enter decimal number");
     int dec=sc.nextInt();
     String bin=dectobin(dec);
     String oct=dectooct(dec);
     String hexa=dectohexa(dec);

     System.out.println(bin);
     System.out.println(oct);
     System.out.println(hexa);
   }
static String dectobin(int dec)
  {
     String bin="";
      do{
           int r=dec%2;
           bin=r+bin;
           dec=dec/2;
        }while(dec!=0);
      return bin;
  }

static String dectooct(int dec)
  {
     String oct="";
      do{
           int r=dec%8;
           oct=r+oct;
           dec=dec/8;
        }while(dec!=0);
      return oct;
  }

static String dectohexa(int dec)
  {
     String hexa="";
      do{
           int r=dec%16;
           if(r<9)
            hexa=r+hexa;
           else
            hexa=(char)(r+55)+hexa;
           dec=dec/16;
        }while(dec!=0);
      return hexa;
  }


}