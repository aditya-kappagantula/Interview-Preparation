package sudoku.iterator;

public interface ISudokuIterator<E> {
	public IIterator<E> createRowWiseIterator();

	public IIterator<E> createColumnWiseIterator();

	public IIterator<E> createBlockWiseIterator();

	public IIterator<E> createBlockIterator(int aBlockIndex);

	public IIterator<E> createRowIterator(int aRowIndex);

	public IIterator<E> createColumnIterator(int aRowIndex);
}
