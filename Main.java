/* comment */
public class Main {

	public static void main(String[] args) {
		CircularQueue q = new CircularQueue(4);
		q.addQueue(12);
		q.addQueue(13);
		q.addQueue(14);
		q.addQueue(15);
		q.printQueue();
		
		int x = q.delQueue();
		System.out.println("ini k delete kardi ine: " + x);
		q.addQueue(16);
		q.printQueue();
		
	
	}

}
