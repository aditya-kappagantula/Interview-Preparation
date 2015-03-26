package trees.binaryTree;

public class Lab {
	public static void main(String[] args) {
		BinarySearchTree<Integer> aBST = new BinarySearchTree<Integer>();
		aBST.add(5);
		aBST.add(6);
		aBST.add(1);
		aBST.add(3);
		aBST.add(2);
		aBST.printInOrder();
		System.out.println(aBST.size());
	}
}
