import java.util.Scanner;
 class avg
 {
 	public static void main(String args[])
	  {
	   Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
	         int b=sc.nextInt();
	         int c=sc.nextInt();
	         int avg;
           
             int sum;
        System.out.println("enter 3 no.s:");
	  
        avg=((a+b+c)/3);
        System.out.println("avg:"+ (a+b+c)/3);
            }
}