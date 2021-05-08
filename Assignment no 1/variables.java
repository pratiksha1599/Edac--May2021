import java.util.*;
 class variables
   {
     public static void main(String args[])
      {
       Scanner sc=new Scanner(System.in);
        System.out.println("enter two integer no.s:");
         int a=sc.nextInt();
         int b=sc.nextInt();
        int temp;
       System.out.println("a:"+a);
       System.out.println("b:"+b);
       temp=a;
	a=b;
	b=temp;
       System.out.println("After swapping:");
        System.out.println("a:"+a);
	System.out.println("b:"+b);
      }
}