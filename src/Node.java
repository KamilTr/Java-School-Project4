class Node {
	public Object obj;
	public Node next;

	// Constructors

	public Node(Object theObject) {
		this(theObject, null);
	}

	public Node(Object theObject, Node n) {
		obj = theObject;
		next = n;
	}
}