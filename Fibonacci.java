import java.util.*;
class Fibonacci
{
public static void main(String args[])
{
int res=0;
Scanner sc=new Scanner(System.in);
System.out.println("enter the n value");
int n=sc.nextInt();
fib f=new fib();		
f.nonrecfib(n);
System.out.println("The fibonacci series for recursion");
for(int i=0;i<=n;i++)
{
res=f.recfib(i);			System.out.println(res);
}
}
}
class fib
{
	
	int recfib(int n)
	{
		if(n==0)
		return 0;		
		if(n==1)
		return 1;
		else
	return(recfib(n-1)+recfib(n-2));
	}
	void nonrecfib(int n)
	{
		int a=0,b=1,c;
System.out.println("The fibonacci series for non recursion");
	System.out.println(a+"\n"+b);
		c=a+b;
		while(c<=n)
		{
System.out.println(c);				
	a=b;
	b=c;
	c=a+b;
	}
	}
}
		
