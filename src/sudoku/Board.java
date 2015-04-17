package sudoku;

import java.util.ArrayList;

public class Board<E> {
	private int rows;
	private int columns;
	private int blocks;
	private char mask;
	private ArrayList<Cell<E>> cells;

	public Board(int rows, E value) {
		if (rows % 3 != 0) {
			throw new IllegalArgumentException(
					"Row count must be number divisible by 3.");
		}
		this.rows = rows;
		this.columns = rows;
		this.setBlocks(rows / 3);
		this.setMask('X');
		this.cells = new ArrayList<Cell<E>>();
		create(value);
	}

	public void create(E value) {
		for (int i = 1; i <= size(); i++) {
			cells.add(new Cell<E>(i, value));
		}
	}

	/**
	 * @return the cells
	 */
	public ArrayList<Cell<E>> getCells() {
		return cells;
	}

	/**
	 * @param cells
	 *            the cells to set
	 */
	@SuppressWarnings("unused")
	private void setCells(ArrayList<Cell<E>> cells) {
		this.cells = cells;
	}

	/**
	 * @return the blocks
	 */
	public int getBlocks() {
		return blocks;
	}

	/**
	 * @param blocks
	 *            the blocks to set
	 */
	private void setBlocks(int blocks) {
		this.blocks = blocks;
	}

	/**
	 * @return the mask
	 */
	public char getMask() {
		return mask;
	}

	/**
	 * @param mask
	 *            the mask to set
	 */
	public void setMask(char mask) {
		this.mask = mask;
	}

	public void print() {
		for (int i = 1; i <= rows; i++) {
			for (int j = 1; j <= columns; j++) {
				System.out.print(getCellValue(i * j) + "\t");
			}
			System.out.println("\n");
		}
	}

	public int size() {
		return rows * columns;
	}

	public void setCellValue(int index, E value) {
		cells.get(index - 1).setValue(value);
	}

	public E getCellValue(int index) {
		return cells.get(index - 1).getValue();
	}

	public void setCellByRowColumnIndex(int row, int column, E value) {
		cells.get(row * column).setValue(value);
	}

	public E getCellByRowColumnIndex(int row, int column) {
		return cells.get(row * column).getValue();
	}
}
