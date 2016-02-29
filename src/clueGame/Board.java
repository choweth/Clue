package clueGame;

import java.util.HashMap;
import java.util.Map;

public class Board {
	
	private static HashMap<Character, String> rooms;

	public Board() {
		// TODO Auto-generated constructor stub
		rooms = new HashMap<Character, String>();
	}
	
	public Board(String string, String string2) {
		// TODO Auto-generated constructor stub
	}

	public void initialize(){
		
	}

	public static Map<Character, String> getRooms() {
		// TODO Auto-generated method stub
		return rooms;
	}

	public int getNumRows() {
		// TODO Auto-generated method stub
		return 0;
	}

	public int getNumColumns() {
		// TODO Auto-generated method stub
		return 0;
	}

	public BoardCell getCellAt(int i, int j) {
		// TODO Auto-generated method stub
		return new BoardCell(0,0);
	}

	public void loadRoomConfig() {
		// TODO Auto-generated method stub
		
	}

	public void loadBoardConfig() {
		// TODO Auto-generated method stub
		
	}

}
