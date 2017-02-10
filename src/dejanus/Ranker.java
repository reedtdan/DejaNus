
package dejanus;
import java.net.URL;


/*
 * Takes a set from filter and adds it to priority queue. 
 * Ranker determines actual order of results.
 * Sends Finalized Queue to Display
 * 
 */
public class Ranker {
	private PriorityNewsQueue data;

	// Create queue
	public void populate( URL[] source ) {
		data = new PriorityNewsQueue();
		// Create Node from each entry in source. Use determine in order to establish priority.
		
		for ( int i = 0; i < source.length; i++ ) {
			data.add( new URLNode ( source[i], determine(source[i], i) ));
		}
	}
	
	/*
	 *  Determine actual priority
	 *  
	 *  Baseline priority using order of results.
	 *  
	 *  Return as integer. Higher grade means more relevant.
	 */
	public int determine( URL source, int order ) {
		/*
		 *  Mention search term more often == more relevant?
		 */
		return order;
	}
	
	public PriorityNewsQueue getData() {
		return data;
	}
	
}
