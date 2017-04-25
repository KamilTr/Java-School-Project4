
// ListStack class
//
// CONSTRUCTION: with no initializer
//
// ******************PUBLIC OPERATIONS*********************
// void push( x )         --> Insert x
// void pop( )            --> Remove most recently inserted item
// AnyType peek( )         --> Return most recently inserted item
// AnyType topAndPop( )   --> Return and remove most recent item
// boolean isEmpty( )     --> Return true if empty; else false
// void makeEmpty( )      --> Remove all items
// ******************ERRORS********************************
// top, pop, or topAndPop on empty stack

/**
 * List-based implementation of the stack.
 * 
 */
public class ListStack<AnyType> {
	private ListNode<AnyType> topOfStack;

	/**
	 * Construct the stack.
	 */
	public ListStack() {
		topOfStack = null;
	}

	/**
	 * Test if the stack is logically empty.
	 * 
	 * @return true if empty, false otherwise.
	 */
	public boolean isEmpty() {
		return topOfStack == null;
	}

	/**
	 * Make the stack logically empty.
	 */
	public void makeEmpty() {
		topOfStack = null;
	}

	/**
	 * Insert a new item into the stack.
	 * 
	 * @param x
	 *            the item to insert.
	 */
	public void push(AnyType x) {
		topOfStack = new ListNode<AnyType>(x, topOfStack);
	}

	/**
	 * Get the most recently inserted item in the stack. Does not alter the
	 * stack.
	 * 
	 * @return the most recently inserted item in the stack.
	 * @throws UnderflowException
	 *             if the stack is empty.
	 */
	public AnyType peek() {
		if (isEmpty())
			throw new UnderflowException("ListStack peek");
		return topOfStack.element;
	}

	/**
	 * Return and remove the most recently inserted item from the stack.
	 * 
	 * @return the most recently inserted item in the stack.
	 * @throws UnderflowException
	 *             if the stack is empty.
	 */
	public AnyType pop() {
		if (isEmpty())
			throw new UnderflowException("ListStack pop");

		AnyType topItem = topOfStack.element;
		topOfStack = topOfStack.next;
		return topItem;
	}

}