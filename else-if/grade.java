import java.lang.*;
import java.util.Scanner;
class grade
{
public static void main(String args[])
{
Scanner obj=new Scanner(System.in);
System.out.println("enter your mark");
int a=obj.nextInt();
if((a>35&&a<70))
{
System.out.println("your grate:d");
}
else if((a>70)&&(a<80))
{
System.out.println("your grate:C");
}
else if((a>80)&&(a<90))
{
System.out.println("your grade:B");
}
else if((a>35)&&(a<0))
{
System.out.println("fail");
}
else
{
System.out.println("worng input");
}
}
}