import java.net.URL;

public class URLNode {
		private URL data;
		private URLNode next;
		private int priority;
		
		public URLNode() {
			next = null;
		}
		
		public URLNode( URL source ) {
			setData(source);
			next = null;
		}
		
		public URLNode( URL source, int priority ) {
			setData(source);
			this.setPriority(priority);
			next = null;
		}

		public URL getData() {
			return data;
		}

		public void setData(URL data) {
			this.data = data;
		}

		public URLNode getNext() {
			return next;
		}

		public void setNext(URLNode next) {
			this.next = next;
		}

		public int getPriority() {
			return priority;
		}

		public void setPriority(int priority) {
			this.priority = priority;
		}
	}