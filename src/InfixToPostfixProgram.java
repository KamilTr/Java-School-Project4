import java.util.*;

public class InfixToPostfixProgram {
	public static void main(String[] args) {
		Stack<String> stack = new Stack<String>();
		Scanner input = new Scanner(System.in);
		String exp = input.next();
		LinkedList<String> list = new LinkedList<String>();
		for (int i = 0; i < exp.length(); i++) {
			String s = exp.charAt(i) + "";
			if (s.equals("+")) {
				while (!stack.isEmpty()) {
					String tkn = stack.pop();
					if (tkn.equals("*") || tkn.equals("/") || tkn.equals("+") || tkn.equals("-") || tkn.equals("^"))
						list.add(tkn);
					else {
						stack.push(tkn);
						break;
					}
				}
				stack.push(s);

			} else if (s.equals("-")) {

			}

			else if (s.equals("*")) {

			} else if (s.equals("/")) {

			} else if (s.equals("^")) {

			}

			else if (s.equals(")")) {

			} else if (s.equals("(")) {
			} else

				list.add(s);
		}

		while (!stack.isEmpty()) {
			list.add(stack.pop());
		}

		System.out.println(list);

	}
}
