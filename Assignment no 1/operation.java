import java.util.Scanner;
class operation
{
  public static void main(String args[])
   {
     Scanner sc=new Scanner(System.in);
    System.out.println("enter 2 integer nos.:");
     int a=sc.nextInt();
     int b=sc.nextInt();
    int c=a+b;
    System.out.println("Addition:"+c);
    int d=a-b;
    System.out.println("substraction:"+d);
    int e=a*b;
    System.out.println("multiplication:"+e);
    int f=a/b;
    System.out.println("division:"+f);
    int m=a%b;
    System.out.println("mod:"+m);
}
}