import java.lang.*;
import java.util.Scanner;
class people
{
public static void main(String args[])
{
Scanner obj=new Scanner(System.in);
System.out.println("enter the age:");
int a=obj.nextInt();
if(a<=13)
{
System.out.println("child");
}
else if((a<=19)&&(a>13))
{
System.out.println("teenager");
}
else if((a<=59)&&(a>20))
{
System.out.println("Adult");
}
else
{
System.out.println("senior citizen");
}
}
}