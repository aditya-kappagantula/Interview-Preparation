package sudoku.iterator;


public interface ISudokuIterator<E> {
	public IIterator<E> createBlockIterator(int aBlockIndex);

	public IIterator<E> createRowIterator(int aRowIndex);

	public IIterator<E> createColumnIterator(int aRowIndex);
}
