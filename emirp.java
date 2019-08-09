import java.util.*;
class emirp
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int a,n,c=0,d,s=0,e=0,i;
System.out.println("Enter a number ");
a=sc.nextInt();
n=a;
for(i=1;i<=a;i++)
{
	if(a%i==0)
		c++;
}
if(c==2)
{
	while(a!=0)
	{
		d=a%10;
		s=s*10+d;
		a=a/10;
	}
	for(i=1;i<=s;i++)
	{
		if(s%i==0)
		{
			e++;
		}
	}
	if(e==2)
	{
		System.out.println(n+" is a emirp number");
	}
	else
	{
		System.out.println(n+" is not a emirp number");
	}
}
else
{
	System.out.println(n+" is not a emirp number");
}
}
}