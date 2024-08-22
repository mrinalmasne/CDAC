public class Calculator{
public static void main(String args[])
{
	int n1=25,n2=5;
	char ch='+';
	switch(ch)
	{
		case '+':
		System.out.println(n1+n2);
		break;
		case '-':
		System.out.println(n1-n2);
		break;
		case '*':
		System.out.println(n1*n2);
		break;
		case '/':
		if(n2==0)
			System.out.println("Cannot divide by zero");
		else
			System.out.println(n1/n2);
			break;
		default:
		System.out.println("Invalid operator");
	}
}
}
	