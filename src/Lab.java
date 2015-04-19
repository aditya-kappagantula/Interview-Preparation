import sudoku.Board;
import sudoku.iterator.IIterator;

public class Lab {
	public static void main(String[] args) {
		// NodeMinimalChanges anNMC = new NodeMinimalChanges();
		// Matrix aMatrix = new Matrix();
		Board<Integer> aBoard = new Board<Integer>(9, 0);
		for (int i = 1; i <= aBoard.size(); i++) {
			aBoard.setCellValue(i, i);
		}
		IIterator<Integer> anIterator = aBoard.createBlockIterator(1);
		while (anIterator.hasNext()) {
			System.out.println(anIterator.next().getValue());
		}
		// aBoard.print();
	}
}
