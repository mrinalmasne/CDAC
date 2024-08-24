public class LargeDigit{
public static void main(String args[])
{
	int num=4825,rem1=0,rem2=0,rem3=0,rem4=0;
	while(num!=0)
	{
		rem1=num%10;
		num/=10;
		rem2=num%10;
		num/=10;
		rem3=num%10;
		rem4=num/10;
	}
	if(rem1>rem2 && rem1>rem3)
	{
		if(rem1>rem4)
			System.out.print(rem1);
	}
	else if(rem2>rem3 && rem2>rem4)
	{
		System.out.print(rem2);
	}
	else if (rem3>rem4)
	{
		System.out.println(rem3);
	}
	else
	{
		System.out.println(rem4);
	}
}
}
		