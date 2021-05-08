import java.util.Scanner;
class dtoo

 {
   public static void main(String args[])
{
        int d,i=0,t;
        int o[]=new int[100];
	Scanner sc=new Scanner(System.in);
	System.out.println("enter any decimal number");
	
	d=sc.nextInt();
	t=d;


	while(t!=0)
	{
	  o[i]=t%8;
	  t=t/8;
	  i++;
	}
	System.out.println(d);
	 for(int j=i-1;j>=0;j--)
          {
           System.out.println(o[j]);
           }
}
} 


	