package Assignment1;

import java.util.Scanner;

public class NonRepChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		char firstc='\0';
		int count[]=new int[256];
		for(char c :s.toCharArray()) {
			count[c]++;
		}
		for(char c :s.toCharArray()) {
			if(count[c]==1) {
				firstc=c;
				break;
		}
		}
		  if (firstc == '\0') {
	            System.out.println("Output: null");
	        } else {
	            System.out.println("Output: " + firstc);
	        }

	}

}
