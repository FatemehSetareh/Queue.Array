
public class Queue {
	/**
	 * piadesazie safe khatty
	 * @param N : andazeie saf
	 * @param front :  esharegar b ebtedaye saf
	 * @param : esharegar b entehaye saf
	 * in saf az noe integer dar nazar gerefte shode ast.
	 */
	protected int N;
	protected int front;
	protected int rear;
	protected int[] queue;
	protected int x;
	
	public Queue(int N) {
		if(N <= 0)
			new IllegalArgumentException("Size is not correct !");
		this.N = N;
		this.front = -1;
		this.rear = -1;
		queue = new int[N];
		
	}
	
	public boolean isEmpty(){
		boolean queueIsEmpty;
		if(front == -1 && rear == -1)
			queueIsEmpty = true;
		else
			queueIsEmpty = false;
		return queueIsEmpty;
		}
	
	public boolean isFull() {
		boolean queueIsFull;
		if(rear == N)
			queueIsFull = true;
		else
			queueIsFull =false;
		return queueIsFull;
	}
	
	public void addQueue(int x){
		if(isFull())
			new IllegalArgumentException("Queus is full! Cant add anything");
		else {
			rear = rear + 1;
			queue[rear] = x;
		}
	}
	
	public int delQueue(){
		if(isEmpty())
			new IllegalAccessException("Queue is empty! Nothing to delete");
		else {
			front = front + 1;
			x = queue[front];
		}
		return x;
	}
	
	public void printQueue(){
		System.out.println("Front is: " + front + "\nrear is: " + rear);
		for(int i=0 ; i <=rear ; i++){
			System.out.println(queue[i]);
		}
		
	}
}
