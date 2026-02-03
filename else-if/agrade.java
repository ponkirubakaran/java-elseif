import java.lang.*;
import java.util.Scanner;
class agrade
{
public static void main(String args[])
{
Scanner obj=new Scanner(System.in);
System.out.println("enter the mark:");
int a=obj.nextInt();
if(a>=90)
{
System.out.println("grade:A");
}
else if((a>=75)&&(a<89))
{
System.out.println("grade B");
}
else if((a>=60)&&(a<70))
{
System.out.println("grate C");
}
else
{
System.out.println("fail");
}
}
}