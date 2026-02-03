import java.lang.*;
import java.util.Scanner;
class income
{
public static void main(String args[])
{
Scanner obj=new Scanner(System.in);
System.out.println("enter your salary:");
int a=obj.nextInt();
if(a>=50000)
{
System.out.println("high income");
}
else if((a>=30000)&&(a<=49999))
{
System.out.println("medium income");
}
else
{
System.out.println("low income");
}
}
}