package tree;

public class Task1 {
	public static void main(String[] args) {
		// TNode root = new TNode(4, new TNode(6, new TNode(3, null, null), new TNode(8,
		// null, new TNode(5, null, null)), new TNode(6, new TNode(7, null, null), new
		// TNode(8, null, null))))

		TNode root = f(5);
	}

	public static TNode f(int n) {
		TNode tail = null;
		if (n == 1) {
			tail = new TNode(n, null, null);
			return tail;
		} else if (n == 0) {
			tail = new TNode(n, null, null);
			return tail;
		} else {
			tail = new TNode(n, f(n - 1), f(n - 2));
			return tail;
		}
	}

}
