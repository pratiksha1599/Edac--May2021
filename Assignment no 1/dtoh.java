
 import java.util.Scanner;
class dtoh

 {
   public static void main(String args[])
{
	Scanner in=new Scanner(System.in);
	System.out.println("enter any decimal number");
	int n=in.nextInt();
	 int r;
	String b=" ";
	char hex[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
	
       while(n>0)
    {
	 r=n%16;
	b=hex[r]+b;
	n=n/16;
     }
	System.out.println(b);
}
}

	