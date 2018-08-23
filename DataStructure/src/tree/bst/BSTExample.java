package tree.bst;

public class BSTExample {

	public static void main(String[] args) {
		BinarySearchTree bst = new BinarySearchTree();

		bst.insert(30);
		bst.insert(20);
		bst.insert(10);
		bst.insert(40);
		bst.insert(50);
		bst.insert(25);
		bst.insert(35);
		
		//bst.traverseInOrder(bst.getRoot());
		bst.traversePostOrder(bst.getRoot());

	}

}
