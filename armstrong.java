import java.util.*;
class armstrong
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int a,n,r=0,s=0;
System.out.print("Enter the number to check for armstrong :");
a=sc.nextInt();
n=a;
while(n!=0)
{
	r=n%10;
	s=s+r*r*r;
	n=n/10;
}
if(s==a)
{
	System.out.println(a+" is an Armstrong Number");
}
else
{
	System.out.println(a+" is not an Armstrong Number");
}
}
}