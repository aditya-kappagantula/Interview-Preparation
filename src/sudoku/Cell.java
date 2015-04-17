package sudoku;

public class Cell<E> {
	private E value;
	private boolean isOpen;
	private int index;

	public Cell(int index) {
		this.setOpen(false);
		this.setIndex(index);
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
	 * @param index the index to set
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
	 * @param isOpen the isOpen to set
	 */
	public void setOpen(boolean isOpen) {
		this.isOpen = isOpen;
	}
}
