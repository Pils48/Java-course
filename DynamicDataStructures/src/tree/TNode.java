package tree;

public class TNode {
	int value;
	TNode left;
	TNode right;
	public TNode(int value, TNode left, TNode right) {
		this.left = left;
		this.right = right;
		this.value = value;
	}
}
