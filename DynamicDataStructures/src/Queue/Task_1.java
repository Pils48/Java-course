package Queue;

public class Task_1 {
	/* Lection #3 from Golovach corses homework#1 */
	private static int size = 0;
	private static int sum = 0;

	public static void main(String[] args) {
		System.out.println(size(Example_2.generateRecA(9)));
		System.out.println(sum(Example_2.generateRecA(9)));
		Node tail1 = new Node(23, new Node(34, new Node(54, new Node(78, null))));
		System.out.println(max(tail1));
		System.out.println(size(tail1));
		System.out.println(sum(tail1));
	}

	public static int size(Node node) {
		if (node.next != null) {
			Task_1.size++;
			size(node.next);
		} else {
			return Task_1.size + 1;
		}

		return Task_1.size + 1;
	}

	public static int sum(Node node) {
		if (node.next != null) {
			Task_1.sum += node.value;
			sum(node.next);
		} else {
			Task_1.sum += node.value;
			return Task_1.sum;
		}

		return Task_1.sum;
	}

	public static int max(Node node) {
		int max = node.value;
		while (node.next != null) {
			if (node.value < node.next.value) {
				max = node.next.value;
			}
			node = node.next;
		}
		return max;
	}
}
