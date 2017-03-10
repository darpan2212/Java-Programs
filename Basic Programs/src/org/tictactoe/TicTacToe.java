package org.tictactoe;

public class TicTacToe {
	public static final int EMPTY = 0;
	public static final int CROSS = 1;
	public static final int ROUND = 2;
	public static final int PLAYING = 0;
	public static final int DRAW = 1;
	public static final int CROSS_WON = 2;
	public static final int ROUND_WON = 3;
	public static final int ROWS = 3;
	public static final int COLS = 3;
	public static int row;
	public static int col;
	public static int[][] board = new int[3][3];
	public static int currentStatus;
	public static int currentPlayer;
	public static int currentRow;
	public static int currentCol;
	public static java.util.Scanner in = new java.util.Scanner(System.in);

	public static void printBoard() {
		for (int row = 0; row < 3; row++) {
			for (int col = 0; col < 3; col++) {
				printCell(board[row][col]);
				if (col != 2) {
					System.out.print("|");
				}
			}
			System.out.println();
			if (row != 2) {
				System.out.println("-----------");
			}
		}
		System.out.println();
	}

	public static void printCell(int content) {
		switch (content) {
		case 0:
			System.out.print("   ");
			break;
		case 1:
			System.out.print(" X ");
			break;
		case 2:
			System.out.print(" O ");
		}

	}

	public static void initGame() {
		for (int row = 0; row < 3; row++) {
			for (int col = 0; col < 3; col++) {
				board[row][col] = 0;
			}
		}
		currentStatus = 0;
		currentPlayer = 1;
	}

	public static void selectCell(int cell) {
		switch (cell) {
		case 1:
			row = 0;
			col = 0;
			break;
		case 2:
			row = 0;
			col = 1;
			break;
		case 3:
			row = 0;
			col = 2;
			break;
		case 4:
			row = 1;
			col = 0;
			break;
		case 5:
			row = 1;
			col = 1;
			break;
		case 6:
			row = 1;
			col = 2;
			break;
		case 7:
			row = 2;
			col = 0;
			break;
		case 8:
			row = 2;
			col = 1;
			break;
		case 9:
			row = 2;
			col = 2;
			break;
		default:
			row = 3;
			col = 3;
		}
	}

	public static void playerMove(int seed) {
		boolean validIp = true;
		while (validIp) {
			if (seed == 1) {
				System.out.println("player 'X', enter your move (1-9) :");
			} else {
				System.out.println("player 'O', enter your move (1-9) :");
			}
			selectCell(in.nextInt());
			if ((row >= 0) && (row < 3) && (col >= 0) && (col < 3) && (board[row][col] == 0)) {
				currentRow = row;
				currentCol = col;
				board[currentRow][currentCol] = seed;
				validIp = false;
			} else {
				System.out.println("This move at (" + (row + 1) + "," + (col + 1) + ") is not valid. Try again...");
			}
		}
	}

	public static boolean isDraw() {
		for (int row = 0; row < 3; row++) {
			for (int col = 0; col < 3; col++) {
				if (board[row][col] == 0)
					return false;
			}
		}
		return true;
	}

	public static boolean hasWon(int seed, int currentRow, int currentCol) {
		return ((board[currentRow][0] == seed) && (board[currentRow][1] == seed) && (board[currentRow][2] == seed))
				|| ((board[0][currentCol] == seed) && (board[1][currentCol] == seed) && (board[2][currentCol] == seed))
				|| ((board[0][0] == seed) && (board[1][1] == seed) && (board[2][2] == seed))
				|| ((board[0][2] == seed) && (board[1][1] == seed) && (board[2][0] == seed));
	}

	public static void updateGame(int seed, int currentRow, int currentCol) {
		if (hasWon(seed, currentRow, currentCol)) {
			currentStatus = seed == 1 ? 2 : 3;
		} else if (isDraw()) {
			currentStatus = 1;
		}
	}

	public static void main(String[] args) {
		initGame();
		while (currentStatus == 0) {
			playerMove(currentPlayer);
			updateGame(currentPlayer, currentRow, currentCol);
			printBoard();
			if (currentStatus == 2) {
				System.out.println("Player 'X' Won.....");
			} else if (currentStatus == 3) {
				System.out.println("Player 'O' Won.....");
			} else if (currentStatus == 1) {
				System.out.println("Game is draw.....");
			}
			currentPlayer = currentPlayer == 1 ? 2 : 1;
		}
	}
}