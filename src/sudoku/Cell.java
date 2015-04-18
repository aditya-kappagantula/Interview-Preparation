package sudoku;

public class Cell<E> {
	private E value;
	private boolean isOpen;
	private int index;
	private int rowIndex;
	private int columnIndex;
	private int blockIndex;

	public Cell(int index, E value) {
		this.setOpen(false);
		this.setIndex(index);
		this.setRowIndex(0);
		this.setColumnIndex(0);
		this.setBlockIndex(0);
		this.setValue(value);
	}

	/**
	 * @return the value
	 */
	public E getValue() {
		return value;
	}

	/**
	 * @param value
	 *            the value to set
	 */
	public void setValue(E value) {
		this.value = value;
	}

	/**
	 * @return the index
	 */
	public int getIndex() {
		return index;
	}

	/**
	 * @param index
	 *            the index to set
	 */
	public void setIndex(int index) {
		this.index = index;
	}

	/**
	 * @return the isOpen
	 */
	public boolean isOpen() {
		return isOpen;
	}

	/**
	 * @param isOpen
	 *            the isOpen to set
	 */
	public void setOpen(boolean isOpen) {
		this.isOpen = isOpen;
	}

	/**
	 * @return the rowIndex
	 */
	public int getRowIndex() {
		return rowIndex;
	}

	/**
	 * @param rowIndex
	 *            the rowIndex to set
	 */
	public void setRowIndex(int rowIndex) {
		this.rowIndex = rowIndex;
	}

	/**
	 * @return the columnIndex
	 */
	public int getColumnIndex() {
		return columnIndex;
	}

	/**
	 * @param columnIndex
	 *            the columnIndex to set
	 */
	public void setColumnIndex(int columnIndex) {
		this.columnIndex = columnIndex;
	}

	/**
	 * @return the blockIndex
	 */
	public int getBlockIndex() {
		return blockIndex;
	}

	/**
	 * @param blockIndex
	 *            the blockIndex to set
	 */
	public void setBlockIndex(int blockIndex) {
		this.blockIndex = blockIndex;
	}
}
