package Day13;

import java.util.Scanner;

interface Collection{
	void acceptRecord();
	void printRecord();
	int [] getArray();
	default void sort() {
			int[] arr = this.getArray();
			for( int i = 0 ;i < arr.length - 1; ++ i ) {
				for( int j = 0; j < arr.length - 1 - i; ++ j ) {
					if( arr[ j ] > arr[ j + 1 ] ) {
						int temp = arr[ j ];
						arr[ j ] = arr[ j + 1 ];
						arr[ j + 1 ] = temp;
					}
				}
			}
		
	}
	
}
class Array implements Collection{
	private int arr[];
	public Array() {
		this(5);
	}
	public Array(int size) {
		this.arr=new int [size];
	}
	@Override
	public void acceptRecord() {
		try(Scanner sc=new Scanner(System.in)){
			for(int i=0;i<arr.length;i++) {
				System.out.println("Enter element: 	");
				arr[i]=sc.nextInt();
			}
		}
	}
	@Override
	public void printRecord(){
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]+" ");
			System.out.println();
		}
	}
	public  int[] getArray() {
		return arr;
	}
	@Override
	public void sort() {
		for( int i = 0; i < arr.length - 1; ++ i ) {
			for( int  j = i + 1; j < arr.length; ++ j ) {
				if( arr[ i ] > arr[ j ] ) {
					int temp = arr[ i ];
					arr[ i ] = arr[ j ];
					arr[ j ] = temp;
				}
			}
		}
	}
}
public class demo6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collection c=new Array();
		c.acceptRecord();
		c.sort();
		c.printRecord();

	}

}
