package com.techlabs.model;

public class GameMechanisms {
	
	private Player currentPlayer;
	private Player otherPlayer;
	private final GameBoard Board;
	
	public GameMechanisms(Player player1, Player player2, GameBoard Board) {
		this.currentPlayer = player1;
		this.otherPlayer = player2;
		this.Board = Board;
	}

	//switching player after a turn
	public void switchPlayer() {
		Player temporary = currentPlayer;
		currentPlayer = otherPlayer;
		otherPlayer = temporary;
	}
	
	public Player getCurrentPlayer() {
		return currentPlayer;
	}
	
	//validating a legal(correct) move
	public boolean isValidMove(int row, int col) {
		return row >= 0 && row < 3 && col >= 0 && col < 3 && Board.isCellEmpty(row, col);
	}
	
	//Plays one turn, updates board and checks status
	public GameStatus playTurn(int row, int col) {   //calling gameStatus enum
		Board.placeSymbol(row, col, currentPlayer.getSymbol());
		if (Board.isWinningMove(row, col, currentPlayer.getSymbol()))
			return GameStatus.Win;
		if (Board.isFull())
			return GameStatus.Draw;
		switchPlayer();
		return GameStatus.InProgress;
	}
}
