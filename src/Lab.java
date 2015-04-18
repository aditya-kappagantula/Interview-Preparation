import sudoku.Board;

public class Lab {
	public static void main(String[] args) {
		// NodeMinimalChanges anNMC = new NodeMinimalChanges();
		// Matrix aMatrix = new Matrix();
		Board<Integer> aBoard = new Board<Integer>(9, 0);
		for (int i = 1; i <= aBoard.size(); i++) {
			aBoard.setCellValue(i, i);
		}
		// aBoard.print();
	}
}
