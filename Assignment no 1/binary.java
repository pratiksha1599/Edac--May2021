import java.util.Scanner;
class binary

 {
   public static void main(String args[])
{
	Scanner in=new Scanner(System.in);
	System.out.println("enter any decimal number");
	int num=in.nextInt();
	String b=" ";
	
	int t=num;
	while(t>0)
{
	int r=t%2;
	t=t/2;
	b=r+b;
}
	System.out.println(b);
}
}

	