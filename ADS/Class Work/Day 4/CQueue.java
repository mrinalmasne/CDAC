package Day4;

public class CQueue {
	int size=5;
	int CQ[]=new int [size];
	int front,rear;
	CQueue(){
		front=-1;
		rear=-1;
	}
	boolean isEmpty() {
		return(front==-1);
	}
	boolean isFull() {
		return ((rear+1)%size==front);
	}
	void enqueue(int x) {
		if(isFull()) {
			System.out.println("Queue is full");
		}
		else {
			if(front==-1)
			{
				front=0;
			}
			rear=(rear+1)%size;
			CQ[rear]=x;
			System.out.println(x+" Inserted");
		}
	}
	int dequeue() {
		if(isEmpty()) {
			System.out.println("Empty Queue");
			return -1;
		}
		else {
			int x=CQ[front];
			System.out.println(x+" Deleted");
			if(front==rear) {
				front=-1;
				rear=-1;
			}
			else {
				front=(front+1)%size;
			}
			return x;
		}
	}
	void display() {
		if(isEmpty()) {
			System.out.println("Queue Empty");
		}
		else
		{
			System.out.println("Queue elements:");
			for(int i=front;i<=rear;i++) {
				System.out.print(CQ[i]+" ");
			}
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CQueue q=new CQueue();
		q.enqueue(10);
		q.enqueue(20);
		q.enqueue(30);
		q.enqueue(40);
		q.display();
		q.dequeue();
		q.display();

	}

}
