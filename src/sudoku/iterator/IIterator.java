package sudoku.iterator;

import sudoku.Cell;

public interface IIterator<E> {
	public boolean hasNext();

	public Cell<E> next();
}
