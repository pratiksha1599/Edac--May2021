import java.util.*;
 class btoh
  {
   public static void main(String args[])
    {
	int[] hex=new int[1000];
        int i=1,j=0,r,d=0,b;
        Scanner in=new Scanner(System.in);
     System.out.print(" input a binary number: ");
      b=in.nextInt();
    while(b>0)
      {
       r=b%2;
       d=d+r*i;
	i=i*2;
       b=b/10;
       }

     i=0;
      while(d!=0)
       {
        hex[i]=d%16;
         d=d/16;
         i++;
         }
      System.out.print("hexadecimal value:");
       for(j=i-1;j>=0;j--)
	{
          if(hex[j]>9)
            {
	       System.out.println((char)(hex[j]+55)+"\n");
	}else
	{
	System.out.print(hex[j]+"\n");
}
}
}
}
               
 
