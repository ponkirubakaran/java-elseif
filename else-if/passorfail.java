import java.lang.*;
import java.util.Scanner;
class passorfail
{
public static void main(String args[])
{
Scanner obj=new Scanner(System.in);
System.out.println("enter your mark:");
int a=obj.nextInt();
if(a>=35){
System.out.println("pass");
}
else if((a<35)&&(a>=0)){
System.out.println("fail");
}
else{
System.out.println("worng input");
}
}
}