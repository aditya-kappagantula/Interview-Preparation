package sudoku;

import java.util.ArrayList;

public class Board<E> {
	private int rows;
	private int columns;
	private int blocks;
	private char mask;
	private ArrayList<Cell> cells;

	public Board(int rows, int columns, int blocks) {
		this.rows = rows;
		this.columns = columns;
		this.setBlocks(blocks);
		this.mask = 'X';
		create();
	}

	public void create() {
		for (int i = 0; i < rows * columns; i++) {
			cells.add(new Cell<E>(i));
		}
	}

	/**
	 * @return the cells
	 */
	public ArrayList<Cell> getCells() {
		return cells;
	}

	/**
	 * @param cells
	 *            the cells to set
	 */
	public void setCells(ArrayList<Cell> cells) {
		this.cells = cells;
	}

	/**
	 * @return the blocks
	 */
	public int getBlocks() {
		return blocks;
	}

	/**
	 * @param blocks the blocks to set
	 */
	public void setBlocks(int blocks) {
		this.blocks = blocks;
	}
}
