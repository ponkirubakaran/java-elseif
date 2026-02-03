import java.lang.*;
import java.util.Scanner;
class equal
{
public static void main(String args[])
{
Scanner obj=new Scanner(System.in);
System.out.println("enter the a number:");
int a=obj.nextInt();
System.out.println("enter the b number:");
int b=obj.nextInt();
System.out.println("enter the c number:");
int c=obj.nextInt();
if((a==b)&&(a==c))
{
System.out.println("all equal");
}
else if((a==b)||(b==c)||(c==a))
{
System.out.println("two number are equal");
}
else
{
System.out.println("all are diffrent");
}
}
}