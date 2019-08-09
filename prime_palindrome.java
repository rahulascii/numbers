import java.util.*;
class prime_palindrome
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int a,n,c=0,i,r=0,s=0;
System.out.print("Enter the number to check for Prime Palindrome :");
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
	for(i=1;i<=a;i++)
	{
		if(a%i==0)
		{
			c++;
		}
	}
	if(c==2)
	{
		System.out.println(a+" is a Prime Palindrome Number");
	}
	else
	{
		System.out.println(a+" is not a Prime Palindrome Number");
	}
}
else
{
	System.out.println(a+" is not a Palindrome Number");
}
}
}
