package Day3;
class Stack1{
	private int max;
	private int s1[];
	private int top;
	Stack1(int s){
		top=-1;
		max=s;
		s1=new int[max];
	}
	
	public boolean isFull() {
		return (top>(max-1));
	}
	public boolean isEmpty() {
		return (top<0);
	}
	public void push(int x) {
		if(!isFull()) {
			s1[++top]=x;
		}
		else
		{
			System.out.println("Stack full");
		}
	}
	int pop() {
		if(!isEmpty()) {
		   return s1[top--];
		}
		else {
			System.out.println("Stack is Empty");
			return -1;
		}
	}
//	public void display() {
//		if(isEmpty())
//			System.out.println("Stack is Empty");
//		else
//		{
//			for(int i=0;i<=top;i++) {
//				System.out.println(s1[i]);
//			}
//		}
//	}
}


public class RevStringStack {
	public static void reverse(StringBuffer str) {
		int n=str.length();
		Stack1 st=new Stack1(n);
		for(int i=0;i<n;i++) {
			st.push(str.charAt(i));
		}
		for(int i=0;i<n;i++) {
			char ch=(char)st.pop();
			str.setCharAt(i, ch);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         StringBuffer b=new StringBuffer("Mrinal");
         reverse(b);
         System.out.println("Reverse of Mrinal:"+b);
	}

}
