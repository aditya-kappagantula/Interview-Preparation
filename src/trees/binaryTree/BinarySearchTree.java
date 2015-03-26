package trees.binaryTree;

public class BinarySearchTree<E> {
	private Node<E> root;

	public BinarySearchTree() {
		this.root = null;
	}

	public void add(E data) {
		root = add(root, data);
	}

	private Node<E> add(Node<E> root, E data) {
		if (root == null) {
			root = new Node<E>(data);
		} else if (root.getData().toString().compareTo(data.toString()) <= 0) {
			root.setLeft(add(root.getLeft(), data));
		} else {
			root.setRight(add(root.getRight(), data));
		}
		return root;
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
