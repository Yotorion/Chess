package boardgame;

public class Board {
	
	private int rows;
	private int columns;
	private Piece[][] pieces;
	
	public Board(Integer rows, Integer columns) {
		if (rows < 8 || columns < 8) {
			throw new BoardException("Can't create a chess board with less than 8x8 spaces");
		}
		
		this.rows = rows;
		this.columns = columns;
		this.pieces = new Piece[rows][columns];
	}

	public Integer getRows() {return rows;}

	public Integer getColumns() {return columns;}

	// Methods ---------------------------------------------------
	
	public Piece piece(int row, int column) {
		if (!positionExists(row, column)) {
			throw new BoardException("Position not on the board!");
		}
		return pieces[row][column];
	}
	
	public Piece piece(Position position) {
		if (!positionExists(position)) {
			throw new BoardException("Position not on the board!");
		}
		
		return pieces[position.getRow()][position.getColumn()];
	}
	
	public void placePiece(Piece piece, Position position) {
		if (thereIsApiece(position) ) {
			throw new BoardException ("There is already a piece on " + position);
		}
		pieces[position.getRow()][position.getColumn()] = piece;
		piece.position = position;
	}
	
	private boolean positionExists(int row, int column) {
		return row >= 0 && row < rows && column >= 0 && column <= columns;
	}
	
	public boolean positionExists(Position position) {
		return positionExists(position.getRow(), position.getColumn());
	}
	
	public boolean thereIsApiece(Position position) {
		if (!positionExists(position)) {
			throw new BoardException("Position not on the board!");
		}
		 
		return  piece(position) != null;
	}
	
	
	

}
