package tree.bst;

public class BinarySearchTree {
	private Node root;

	public class Node {
		int value;
		Node left;
		Node right;

		public Node(int value) {
			this.value = value;
		}
	}

	public Node getRoot() {
		return root;
	}

	// ÁÂ Áß ¿ì
	public void traverseInOrder(Node node) {
		if (node != null) {
			traverseInOrder(node.left);
			System.out.println(" " + node.value);
			traverseInOrder(node.right);

		}
	}

	// Áß ÁÂ ¿ì
	public void traversePreOrder(Node node) {
		if (node != null) {
			System.out.println(" " + node.value);
			traversePreOrder(node.left);
			traversePreOrder(node.right);

		}

	}

	// ÁÂ ¿ì Áß
	public void traversePostOrder(Node node) {
		if (node != null) {
			traversePostOrder(node.left);
			traversePostOrder(node.right);
			System.out.println(" " + node.value);
		}

	}

	private Node addRecursive(Node current, int value) {

		if (current == null) {
			return new Node(value);
		} else if (value < current.value) {
			current.left = addRecursive(current.left, value);
		} else if (value > current.value) {
			current.right = addRecursive(current.right, value);
		} else {
			return current;
		}

		return current;
	}

	public void insert(int value) {
		root = addRecursive(root, value);
	}

	private int findSmallestValue(Node root) {
		return root.left == null ? root.value : findSmallestValue(root.left);
	}

	public void delete(int value) {
		deleteRecursive(root, value);
	}

	public Node deleteRecursive(Node current, int value) {

		if (current == null) {

			return null;
		}
		if (current.value == value) {
			if (current.left == null && current.right == null) {

				return null;
			}
			if (current.left == null) {

				return current.right;
			}
			if (current.right == null) {

				return current.left;
			}
			int smallestValue = findSmallestValue(current.right);
			current.value = smallestValue;
			current.right = deleteRecursive(current.right, smallestValue);
			return current;
		}

		if (value < current.value) {
			current.left = deleteRecursive(current.left, value);

			return current;
		} else {
			current.right = deleteRecursive(current.right, value);

			return current;
		}

	}

}
