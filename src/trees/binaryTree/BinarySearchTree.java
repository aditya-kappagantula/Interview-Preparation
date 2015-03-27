package trees.binaryTree;

public class BinarySearchTree<E> {
	private Node<E> root;

	public BinarySearchTree() {
		this.root = null;
	}

	public void add(E data) {
		if (root == null) {
			root = new Node<E>(data);
		} else {
			root = root.add(root, data);
		}
	}

	public void printInOrder() {
		Node<E> dummyRoot = root;
		printInOrder(root);
		root = dummyRoot;
	}

	private void printInOrder(Node<E> aNode) {
		if (aNode != null) {
			printInOrder(aNode.getLeft());
			System.out.println(aNode.getData().toString());
			printInOrder(aNode.getRight());
		}
	}

	public int size() {
		Node<E> dummyRoot = root;
		int size = size(root);
		root = dummyRoot;
		return size;
	}

	private int size(Node<E> aNode) {
		if (aNode == null) {
			return 0;
		} else {
			return 1 + size(aNode.getLeft()) + size(aNode.getRight());
		}
	}
}
