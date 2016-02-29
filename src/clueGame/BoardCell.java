package clueGame;

public class BoardCell {
	
	private int row, col;

	public BoardCell(int row, int col) {
		super();
		this.row = row;
		this.col = col;
	}

	public BoardCell() {
		// TODO Auto-generated constructor stub
	}

	public int getRow() {
		// TODO Auto-generated method stub
		return row;
	}

	public int getCol() {
		// TODO Auto-generated method stub
		return col;
	}

	@Override
	public String toString() {
		return "BoardCell [row=" + row + ", col=" + col + "]";
	}

	public boolean isDoorway() {
		// TODO Auto-generated method stub
		return false;
	}

	public DoorDirection getDoorDirection() {
		// TODO Auto-generated method stub
		return null;
	}

	public char getInitial() {
		// TODO Auto-generated method stub
		return 'a';
	}

}
