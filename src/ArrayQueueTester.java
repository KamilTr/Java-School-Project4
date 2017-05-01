import static org.junit.Assert.*;

import org.junit.*;
public class ArrayQueueTester {

	ArrayQueue<Integer> aq1;
	ArrayQueue<Integer> aq2;
	ArrayQueue<String> aq3;
	ArrayQueue<String> aq4;
	
	@Before
	public void setup(){
		aq1 = new ArrayQueue<Integer>();
		aq2 = new ArrayQueue<Integer>();
		aq3 = new ArrayQueue<String>();
		aq4 = new ArrayQueue<String>();
	}
	
	@Test
	public void reverseTest(){
		aq1.enqueue(1);
		aq1.enqueue(2);
		aq1.enqueue(3);
		
		aq2.enqueue(3);
		aq2.enqueue(2);
		aq2.enqueue(1);

		aq2 = aq2.reverse();
		
		String aq1S = aq1.printQueue();
		String aq2S = aq2.printQueue();
		
		assertEquals("", aq1S, aq2S);
	}
}
