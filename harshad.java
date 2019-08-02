import java.util.*;
class harshad
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int a,n,r=0,s=0;
System.out.print("Enter the number:");
a=sc.nextInt();
n=a;
while(n!=0)
{
	r=n%10;
	s=s+r;
	n=n/10;
}
if(a%s==0)
{
	System.out.println(a+" is a Harshad Number");
}
else
{
	System.out.println(a+" is not a Harshad Number");
}
}
}