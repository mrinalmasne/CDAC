package Day15_1_6;
@FunctionalInterface
interface IMath{
	double sum(float num1,double num2);
}
public class Program6 {
	public static void main(String[] args) {
		IMath math=(num1 ,num2)->num1+num2;
		double result=math.sum(10.2f, 2.4d);
		System.out.println("Result:"+result);
	}
	public static void main1(String args[]) {
		IMath math=(float num1,double num2)->{
			double result=0;
			result =num1+num2;
			return result;
		};
		double result=math.sum(10.1f, 20.2d);
		System.out.println("result:"+result);
	}
}
