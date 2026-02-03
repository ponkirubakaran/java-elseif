import java.lang.*;
import java.util.Scanner;
class pastive
{
public static void main(String args[])
{
Scanner obj=new Scanner(System.in);
System.out.println("enter the number:");
int a=obj.nextInt();
if(a>0)
{
System.out.println("pastive number");
}
else if(a<0)
{
System.out.println("neagative number");
}
else
{
System.out.println("Zero");
}
}
}