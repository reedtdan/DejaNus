package dejanus;

public class PriorityNewsQueue {
	private URLNode head;
	private URLNode current;
	private int size = 0;
	
	public PriorityNewsQueue() {
		head = new URLNode();
		current = null;
	}
	
	public void add( URLNode add ) {
		if ( size == 0 ) {
			head = current = add;
		}
		else {
			URLNode temp = new URLNode();
			temp = head;
			
			while ( temp.getNext() != null ) {
				if ( temp.getPriority() < temp.getNext().getPriority() ) temp = temp.getNext();
				else {
					add.setNext(temp.getNext());
					temp.setNext(add);
					break;
				}
			}
			
			if ( temp.getNext() == null ) temp.setNext(add);
		}
		size++;
	}

	public URLNode getHead() {
		return head;
	}

	public URLNode getCurrent() {
		return current;
	}

	public void advance() {
		current = current.getNext();
	}
	
	public void printQueue() {
		URLNode scan = head;
		
		System.out.println(scan.getData());
		while ( scan.getNext() != null ) {
			
			scan = scan.getNext();
			System.out.println( scan.getData() + " " + scan.getPriority() );
		}
	}
}
