package Assignment1;

import java.util.Scanner;

public class Leapyear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int y=sc.nextInt();
		if((y%4==0 && y%100!=0) || y%400==0) {
			System.out.println("true");
		}
		else
			System.out.println("false");

	}

}
