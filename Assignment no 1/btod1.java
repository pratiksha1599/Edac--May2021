import java.util.Scanner;
class btod1

 {
   public static void main(String args[])
    {
     
    
   Scanner in=new Scanner(System.in);
  System.out.print("enter any binary number");
	int n=in.nextInt();
        int d=0;
        int t=n;
        int i=0;

       while(t>0)
     { 
       int r=t%10;
        t=t/10;
        d=d+r*(int) Math.pow(2,i++);
    
	}
	System.out.println( d);
        }
}


	



	