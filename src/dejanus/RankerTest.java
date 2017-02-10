import java.net.MalformedURLException;
import java.net.URL;

public class RankerTest {
	public static void main( String[] args ) throws MalformedURLException {
		
		URL a = new URL("https://www.google.com");
		URL b = new URL("https://www.smbc-comics.com");
		URL c = new URL("https://www.xkcd.com");
		URL d = new URL("https://www.reddit.com");
		
		URL[] check = new URL[4];
		check[0] = a;
		check[1] = b;
		check[2] = c;
		check[3] = d;
		
		PriorityNewsQueue test_1 = new PriorityNewsQueue();
		test_1.add( new URLNode(a) );
		test_1.add( new URLNode(b) );
		test_1.add( new URLNode(c) );
		test_1.add( new URLNode(d) );
		
		//test_1.printQueue();
		
		Ranker test_2 = new Ranker();
		test_2.populate(check);
		test_2.getData().printQueue();
		
		// System.out.println(test_2.getData().head.getPriority());
	}
}
