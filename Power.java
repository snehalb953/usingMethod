class Power
{
  public static void main(String[] args)
    {
      int p1=getPow(2,4);
      System.out.println(p1);
      int p2=getPow(2,0);
      System.out.println(p2);
      int p3=getPow(0,5);
      System.out.println(p3);

   }
   public static int getPow(int n,int p)
    {
        int Product=1;
          while(p>0)
            {
               Product=Product*n;
               p--;
            }
         return Product;
    }
}