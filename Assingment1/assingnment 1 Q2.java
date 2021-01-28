class ArmstrongNumBetweenRange
{
	public static void main(String[] arg)
	{
	int x=100,arm;
	System.out.println("Armstrong numbers between 100 to 999");
	while(x<1000)
	{
	arm=armstrongOrNot(x);
	if(arm==x)
	System.out.println(x);
	x++;
	}
	}
static int armstrongOrNot(int number)
{
	int i,a=0;
	while(number!=0)
	{
		i=num%10;
		a=a+(i*i*i);
		number/=10 ;
	}
	return a;
}
}