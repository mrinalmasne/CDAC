package Day4;

public class Queue {
	int size=5;
	int Q[]=new int [5];
	int front,rear;
	Queue() {
		front=-1;
		rear=-1;
	}
	boolean isEmpty() {
		return (front==-1);
			
	}
	boolean isFull() {
		return (rear==size-1);
	}
	void enqueue(int x) {
		if(isFull()) {
			System.out.println("Queue is full");
		}
		else
		{
			if(front==-1) {
				front=0;
			}
			rear++;
			Q[rear]=x;
			System.out.println(x+" Inserted");
		}
	}
	int dequeue() {
		if(isEmpty()) {
			System.out.println("Queue is empty");
			return -1;
		}
		else {
			int x=Q[front];
			System.out.println(x+" Deleted");
			if(front>rear) {
				front=-1;
				rear=-1;
			}
			else
			{
				front++;
			}
			return x;
		}	
	}
 void display() {
	 if(isEmpty()) {
		 System.out.println("Empty Queue!!!");
	 }
	 else {
	 for(int i=front;i<=rear;i++) {
		 System.out.print(Q[i]+" ");
	 }
	 System.out.println();
	 }
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue q1=new Queue();
		q1.enqueue(10);
		q1.enqueue(20);
		q1.enqueue(30);
		q1.display();
		q1.dequeue();
		q1.display();

	}

}
