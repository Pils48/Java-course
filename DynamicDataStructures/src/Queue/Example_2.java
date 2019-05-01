package Queue;

public class Example_2 {

	public static void main(String[] args) {
		Node tailA = generateIter1(9);
		Node tailB = generateIter2(9);
		Node tailC = generateRecA(9);
		Node tail1 = new Node(9,null); generateRecB(tail1);
		
		  System.out.println(toStringIter(tailA));
		  System.out.println(toStringRec(tailB));
		  System.out.println(toStringIter(tailC));
		  System.out.println(toStringRec(tail1));
		 

	}

	public static Node generateIter1(int max) {
		Node tail = null;
		for (int i = 0; i <= max; i++) {
			tail = new Node(i, tail);
		}
		return tail;
	}

	public static Node generateIter2(int max) {

		Node tail = new Node(max, null);
		Node head = tail;
		for (int i = max; i > 0; i--) {
			head.next = new Node(i - 1, null);
			head = head.next;
		}
		return tail;
	}

	public static Node generateRecA(int value) {
		if (value >= 0) {
			return new Node(value, generateRecA(value -1));
		}else {
			return null;
		}
	}
	
	public static void generateRecB(Node node) {
		if (node.value > 0) {
			node.next = new Node(node.value -1, null);
			generateRecB(node.next);
		}
	}
	
	public static String toStringIter(Node ref) {
		String result = "";
		while (ref != null) {
			result += " " + ref.value;
			ref = ref.next;
		}
		result += " null";
		return result;
	}

	public static String toStringRec(Node ref) {
		if (ref == null) {
			return " null";
		} else {
			return " " + ref.value + toStringRec(ref.next);
		}
	}
}
