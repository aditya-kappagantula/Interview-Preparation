package sudoku;

import java.util.ArrayList;

import sudoku.iterator.IIterator;
import sudoku.iterator.ISudokuIterator;

public class Board<E> implements ISudokuIterator<E> {
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
		this.blocks = rows;
		this.setMask('X');
		this.cells = new ArrayList<Cell<E>>();
		create(value);
	}

	public void create(E value) {
		for (int i = 1; i <= size(); i++) {
			cells.add(new Cell<E>(i, value));
		}
		int rowIndex = 1;
		for (int i = 1; i <= size(); i++) {
			cells.get(i - 1).setRowIndex(rowIndex);
			if (i % 9 == 0) {
				rowIndex++;
			}
		}
		int columnIndex = 1;
		for (int i = 1; i <= rows; i++) {
			for (int j = i; j <= size(); j = j + rows) {
				cells.get(j - 1).setColumnIndex(columnIndex);
			}
			columnIndex++;
		}
		// int blockIndex = 1;
		// int count = 0;
		// for (int i = 1; i <= blocks / 3; i++) {
		// for (int j = 1; j <= blocks / 3; j++) {
		// int currentBlock = (i * blocks / 3) + j - blocks / 3;
		// }
		// }
		for (int i = 0; i < size(); i++) {
			// int currentBlockIndex = (i / 27) * 27 + 3 * (i % 9 / 3) + 1;
			// System.out.println(currentBlockIndex);
			int currentRow = cells.get(i).getRowIndex() - 1;
			int currentColumn = cells.get(i).getColumnIndex() - 1;
			cells.get(i).setBlockIndex(
					currentRow / 3 * 3 + currentColumn / 3 + 1);
		}
		// Logic to find first index of each block
		// index = row*9 + col
		//
		// row = i / 9
		// col = i % 9
		//
		// blockRow = (row / 3) * 3
		// blockCol = (col / 3) * 3
		//
		// blockRow = (i / 9 / 3) * 3 = (i / 27) * 3
		// blockCol = (i % 9 / 3) * 3
		//
		// blockIndex = (blockRow*9) + blockCol = ((i / 27) * 3 * 9) +
		// (i % 9 / 3) * 3 =
		// (i / 27) * 27 + 3 * (i % 9 / 3)
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
		for (int i = 1; i <= size(); i = i + 9) {
			for (int j = 1; j <= columns; j++) {
				System.out.print(getCellValue(i + j - 1) + " | "
						+ getCellRowIndex(i + j - 1) + " | "
						+ getCellColumnIndex(i + j - 1) + " | "
						+ getCellBlockIndex(i + j - 1) + "\t");
				// System.out.print((i + j - 1) + " \t ");
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

	public int getCellRowIndex(int index) {
		return cells.get(index - 1).getRowIndex();
	}

	public int getCellColumnIndex(int index) {
		return cells.get(index - 1).getColumnIndex();
	}

	public int getCellBlockIndex(int index) {
		return cells.get(index - 1).getBlockIndex();
	}

	public void setCellByRowColumnIndex(int row, int column, E value) {
		cells.get(row * column).setValue(value);
	}

	public E getCellByRowColumnIndex(int row, int column) {
		return cells.get(row * column).getValue();
	}

	@Override
	public IIterator<E> createBlockIterator(int aBlockIndex) {
		BlockIterator<E> aBlockIterator = new BlockIterator<E>(aBlockIndex);
		return aBlockIterator;
	}

	@Override
	public IIterator<E> createRowIterator(int aRowIndex) {
		RowIterator<E> aRowIterator = new RowIterator<E>(aRowIndex);
		return aRowIterator;
	}

	@Override
	public IIterator<E> createColumnIterator(int aColumnIndex) {
		ColumnIterator<E> aColumnIterator = new ColumnIterator<E>(aColumnIndex);
		return aColumnIterator;
	}

	private class RowIterator<C> implements IIterator<E> {
		private int rowIndex;
		private int currentCellIndex;

		public RowIterator(int rowIndex) {
			this.rowIndex = rowIndex;
			this.currentCellIndex = ((rowIndex - 1) * rows) + 1;
		}

		public boolean hasNext() {
			if (currentCellIndex <= rows * rowIndex) {
				return true;
			} else {
				return false;
			}
		}

		public Cell<E> next() {
			Cell<E> currentCell = cells.get(currentCellIndex - 1);
			currentCellIndex++;
			return currentCell;
		}
	}

	private class ColumnIterator<C> implements IIterator<E> {
		private int columnIndex;
		private int currentCellIndex;

		public ColumnIterator(int columnIndex) {
			this.columnIndex = columnIndex;
			this.currentCellIndex = columnIndex;
		}

		public boolean hasNext() {
			if (currentCellIndex <= rows * columns) {
				return true;
			} else {
				return false;
			}
		}

		public Cell<E> next() {
			Cell<E> currentCell = cells.get(currentCellIndex - 1);
			currentCellIndex = currentCellIndex + rows;
			return currentCell;
		}
	}

	private class BlockIterator<C> implements IIterator<E> {
		private int blockIndex;
		private int currentCellIndex;
		private ArrayList<Cell<E>> iterableCells;

		public BlockIterator(int blockIndex) {
			this.blockIndex = blockIndex;
			iterableCells = new ArrayList<Cell<E>>();
			for (int i = 1; i < size(); i++) {
				if (cells.get(i - 1).getBlockIndex() == blockIndex) {
					iterableCells.add(cells.get(i - 1));
					// System.out.println("jere");
					// System.out.println(cells.get(i - 1).getValue());
				}
			}
			this.currentCellIndex = 0;
		}

		public boolean hasNext() {
			if (currentCellIndex < iterableCells.size()) {
				return true;
			} else {
				return false;
			}
		}

		public Cell<E> next() {
			Cell<E> currentCell = iterableCells.get(currentCellIndex);
			currentCellIndex++;
			return currentCell;
		}
	}
}
