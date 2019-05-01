package tree;

public class Task2 {

	private static int size = 1;
	//private static int height = 1;
	
	public static void main(String[] args) {
		System.out.println(size(Task1.f(10)));
		System.out.println(height(Task1.f(10)));
		System.out.println(max(Task1.f(6)));
	}
	
	public static int size(TNode root) {
		if (root.left != null && root.right != null) {
			Task2.size ++;
			size(root.left);
			Task2.size ++;
			size(root.right);
		}
		
		else if(root.left == null && root.right != null){
			Task2.size ++;
			size(root.right);
		}
		else if(root.right == null && root.left != null) {
			Task2.size ++;
			size(root.left);
		}
		else if(root.right == null && root.left == null) {
			return  Task2.size;
		}
	return Task2.size;
	}
	
	public static int height(TNode root) {
		int height = 1;
		if (root.right != null && root.left != null) {
			if (height(root.right) >= (height(root.left))) {
				height += height(root.right);
				return height;
			}
			else {
				height += height(root.left);
				return height;
			}
		}
			else if (root.left == null && root.right != null) {
				//Task2.height = height(root.right);
				height += height(root.right);
				return height;
		}
			else if (root.left != null && root.right == null) {
				//Task2.height = height(root.left);
				height += height(root.left);
				return height;
			}
			else if (root.left ==  null && root.right == null) {
				return 1;
			}
		return height;
	}

	public static int max(TNode root) {
		int max = 0;
		if (root.right != null && root.left != null) {
			if (max(root.right) >= (max(root.left))) {
				if (root.value >= max(root.right)) {
					max = root.value;
					return max;
				} else {
					max = max(root.right);
					return max;
				}
				
			}
			else {
				if (root.value >= max(root.left)) {
					max = root.value;
					return max;
				} else {
					max = max(root.left);
					return max;
				}
			}
		}
			else if (root.left == null && root.right != null) {
				if (root.value >= max(root.right)) {
					max = root.value;
					return max;
				}else {
					max = max(root.right);
					return max;
				}
		}
			else if (root.left != null && root.right == null) {
				if (root.value >= max(root.left)) {
					max = root.value;
					return max;
				}else {
					max = max(root.left);
					return max;
				}
			}
			else if (root.left ==  null && root.right == null) {
				return root.value;
			}
		return max;
	
	}
}
