import java.lang.*;
import java.util.Scanner;
class divisable
{
public static void main(String args[])
{
Scanner obj=new Scanner(System.in);
System.out.println("enter the number:");
int a=obj.nextInt();
if((a%5==0)&&(a%11==0))
{
System.out.println("divisable both");
}
else if(a%5==0)
{
System.out.println("divisable 5");
}
else if(a%11==0)
{
System.out.println("divisabl 11");
}
else
{
System.out.println("not divisable 5 or 11");
}
}
}