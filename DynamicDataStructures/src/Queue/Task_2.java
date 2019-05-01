package Queue;

public class Task_2 {
	private static int addPosition = 0;
	private static int removePosition = 0;

	public static void main(String[] args) {
		Node elem = new Node(89, null);
		Node tail0 = new Node(1, new Node(2, null));
		// add(tail0, elem);
		// remove(tail0);
		add(tail0, 1, elem);
		remove(tail0, 1);
		Example_2.toStringIter(tail0);
	}

	public static void add(Node node, Node elem) {
		if (node.next != null) {
			add(node.next, elem);
		} else {
			node.next = elem;
		}
	}

	public static void remove(Node node) {
		if (node.next.next != null) {
			remove(node.next);
		} else {
			node.next = null;
		}
	}

	public static void add(Node node, int position, Node elem) {
		if (node.next != null && Task_2.addPosition < position - 1) {
			Task_2.addPosition++;
			add(node.next, position, elem);
		}
		// Should be rewrite soon
		else if (node.next == null && Task_2.addPosition < position) {
			System.out.println("Index out of boundary array");
		} else if (Task_2.addPosition == position - 1) {
			elem.next = node.next;
			node.next = elem;
		} else if (position == 0) {
			elem.next = node;
			node = elem;
		}

	}

	public static void remove(Node node, int position) {
		if (node.next != null && Task_2.removePosition < position - 1) {
			Task_2.removePosition++;
			remove(node.next, position);
		}
		// Should be rewrite too
		else if (node.next == null && Task_2.removePosition < position) {
			System.out.println("Index out of boundary array");
		} else if (Task_2.removePosition == position - 1) {
			node.next = node.next.next;
		}
	}
}
