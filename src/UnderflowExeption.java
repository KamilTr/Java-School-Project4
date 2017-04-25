

public class UnderflowExeption extends RuntimeException {
	/**
	 * Constructs a EmptyStackException with no detail message.
	 */
	public UnderflowExeption() {
	}

	/*
	 * Constructs a EmptyStackException with a detail message.
	 * 
	 * @param msg the detail mesage pertaining to this exception.
	 */
	public UnderflowExeption(String msg) {
		super(msg);
	}
}