package viewNwindow;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;

import viewBoard.GameBoard;

public abstract class GameWindow extends BasicWindow implements View {

	private String command;			//the user Command Action
	private String gameDescription;
	protected GameBoard board;		//canvas
	private static volatile boolean solutionRecivied = false;
	
	public GameWindow(int width, int height, String title) {
		super(width, height, title);	
	}
	
	public GameBoard getBoard() {
		return board;
	}
	public void setBoard(GameBoard board) {
		this.board = board;
	}
	public String getDescription() {
		if (gameDescription == null)
			return "null";
		return gameDescription;
	}
	public void setDescription(String description) {
		this.gameDescription = description;
	}
	public String getCommand() {
		return command;
	}
	public void setCommand(String command) {
		this.command = command;
	}

	public static boolean getSolutionRecivied() {
		return solutionRecivied;
	}

	public static void setSolutionRecivied(boolean solutionRecivied) {
		GameWindow.solutionRecivied = solutionRecivied;
	}
	
	
}
