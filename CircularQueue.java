
public class CircularQueue extends Queue{

	public CircularQueue(int N) {
		super(N);
		if(N <= 0)
			new IllegalArgumentException("Size is not correct !");
		this.N = N;
		this.front = -1;
		this.rear = -1;
		queue = new int[N];
	}
	
	@Override
	public boolean isFull() {
		boolean queueIsFull;
		if(front == ((rear + 1)/N))
			queueIsFull = true;
		else
			queueIsFull = false;
		return queueIsFull;
	}
	
	@Override
	public void addQueue(int x){
		if(isFull())
			new IllegalArgumentException("Queus is full! Cant add anything");
		else {
			rear = (rear + 1) % N;
			queue[rear] = x;
		}
	}
	
	@Override
	public int delQueue(){
		if(isEmpty())
			new IllegalAccessException("Queue is empty! Nothing to delete");
		else {
			front = (front + 1) % N;
			x = queue[front];
		}
		return x;
	}
	
	@Override
	public void printQueue(){
		System.out.println("Front is: " + front + "\nrear is: " + rear);
		for(int i=0 ; i <= (rear-front) ; i++){
			System.out.println(queue[i]);
		}
		
	}

}
