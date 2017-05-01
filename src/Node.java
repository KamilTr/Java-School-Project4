class Node {
	public Object itm;
	public Node next;

	// Constructors

	public Node(Object theObject) {
		this(theObject, null);
	}

	public Node(Object theObject, Node n) {
		itm = theObject;
		next = n;
	}
}