 package boardgame;

public class Position {
	
	private Integer row;
	private Integer column;
	
	public Position () {};
	
	public Position (Integer row, Integer column) {
		this.row = row;
		this.column = column;
	}
	
	public Integer getRow () {
		return this.row;
	}

	public Integer getColumn () {
		return this.column;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Position on the board \n");
		sb.append("Row: " + this.row + "\n");
		sb.append("Column: " + this.column);
		return sb.toString();
	}
	
}
