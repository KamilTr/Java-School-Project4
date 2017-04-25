import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.*;

public class ArrayStackTester {
	
	ArrayStack<Integer> stack1;
	ArrayStack<Integer> stack2;
	
	@Before
	public void start(){
		stack1 = new ArrayStack<Integer>();
		stack2 = new ArrayStack<Integer>();
	}
	
	@Test
	public void MainTest(){
		stack1.push(20);
		int[] tempArray = {20};
		String stringA = Arrays.toString(stack1.ArrayStackCopy());
		String stringB = Arrays.toString(tempArray);
		
		assertEquals("", stringA, stringB);
	}

}
