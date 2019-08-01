import java.util.*;
class palindrome
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int a,n,r=0,s=0;
System.out.print("Enter the number to check for Palindrome :");
a=sc.nextInt();
n=a;
while(n!=0)
{
	r=n%10;
	s=s*10+r;
	n=n/10;
}
if(s==a)
{
	System.out.println(a+" is a Palindrome Number");
}
else
{
	System.out.println(a+" is not a Palindrome Number");
}
}
}