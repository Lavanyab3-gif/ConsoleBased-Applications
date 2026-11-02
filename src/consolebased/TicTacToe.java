//package consolebased;
//
//import java.util.Scanner;
//
//public class TicTacToe {
//
//		static char[][] board = new char[3][3];
//
//		static char player = 'X';
//		static Scanner scanner = new Scanner(System.in);
//
//		public static void main(String[] args) {
//			for (int i = 0; i < board.length; i++) {
//				for (int j = 0; j < board[i].length; j++) {
//					board[i][j] = ' ';
//				}
//			}
//			while (true) {
//				printBoard();
//				System.out.println("==================");
//
//				System.out.println(player + "  It's your turn !!!!!!!");
//				System.out.println("plesse choose row(0-2)");
//				int row = scanner.nextInt();
//				System.out.println("plesse choose col(0-2)");
//				int col = scanner.nextInt();
//				if (row < 0 || row > 2 || col < 0 || col > 2 || board[row][col] != ' ') {
//					System.out.println("It's already filled choose another move..!!");
//					continue;
//				}
//				board[row][col] = player;// X
//
//				if (checkWinner()) {
//					System.out.println(player + " congratulations!!! you won the game");
//					printBoard();
//					break;
//				}
//				if(isBoardFull()) {
//					System.out.println("Game end drow match both players can leave for the day!!!!!! ");
//					printBoard();
//					break;
//				}
//
//				player = (player == 'X') ? 'O' : 'X';
//
//			}
//		}
//
//		private static boolean isBoardFull() {
//			for (int i = 0; i < board.length; i++) {
//				for (int j = 0; j < board[i].length; j++) {
//					if(board[i][j]==' ') {
//						return false;
//					}
//				}
//			}
//			return true;
//		}
//
//		private static boolean checkWinner() {
//			// rows
//			for (int i = 0; i < board.length; i++) {
//				if (board[i][0] == player && board[i][1] == player && board[i][2] == player) {
//					return true;
//				}
//
//			}
//			for (int i = 0; i < board.length; i++) {
//				if (board[0][i] == player && board[1][i] == player && board[2][i] == player) {
//					return true;
//				}
//
//			}
//			if(board[0][0]==player &&board[1][1]==player && board[2][2]==player) {
//				return true;
//			}
//			if(board[0][2]==player &&board[1][1]==player && board[2][0]==player) {
//				return true;
//			}
//
//			return false;
//		}
//
//		private static void printBoard() {
//
//			System.out.println("-----------");
//			for (int i = 0; i < board.length; i++) {
//				System.out.print("| ");
//				for (int j = 0; j < board[i].length; j++) {
//					System.out.print(board[i][j] + " |");
//				}
//				System.out.println();
//				System.out.println("-----------");
//
//			}
//		}
//
//	}







package consolebased;

import java.util.Scanner;

public class TicTacToe {

    static char[][] board = new char[3][3];
    static char player = 'X';
    static Scanner scanner = new Scanner(System.in);

    // ANSI Colours
    static final String RESET = "\u001B[0m";
    static final String PURPLE = "\u001B[35m";
    static final String BLUE = "\u001B[34m";
    static final String GREEN = "\u001B[32m";
    static final String YELLOW = "\u001B[33m";
    static final String RED = "\u001B[31m";
    static final String CYAN = "\u001B[36m";

    public static void main(String[] args) {

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                board[i][j] = ' ';
            }
        }

        while (true) {

            printBoard();

            System.out.println(PURPLE + "==================" + RESET);

            if (player == 'X') {
                System.out.println(BLUE + player + " It's your turn !!!!!!" + RESET);
            } else {
                System.out.println(GREEN + player + " It's your turn !!!!!!" + RESET);
            }

            System.out.println(YELLOW + "Please choose row (0-2)" + RESET);
            int row = scanner.nextInt();

            System.out.println(YELLOW + "Please choose col (0-2)" + RESET);
            int col = scanner.nextInt();

            if (row < 0 || row > 2 || col < 0 || col > 2 || board[row][col] != ' ') {

                System.out.println(RED + "Invalid move choose another move..!!" + RESET);
                continue;
            }

            board[row][col] = player; // X

            if (checkWinner()) {

                System.out.println(GREEN + player + " Congratulations!!! You won the game" + RESET);
                printBoard();
                break;
            }

            if (isBoardFull()) {

                System.out.println(YELLOW + "Game ended! Draw match. Both players can leave for the day!!!!!!" + RESET);
                printBoard();
                break;
            }

            player = (player == 'X') ? 'O' : 'X';
        }
    }

    private static boolean isBoardFull() {

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {

                if (board[i][j] == ' ') {
                    return false;
                }
            }
        }

        return true;
    }

    private static boolean checkWinner() {

        // rows
        for (int i = 0; i < board.length; i++) {

            if (board[i][0] == player && board[i][1] == player && board[i][2] == player) {
                return true;
            }
        }

        for (int i = 0; i < board.length; i++) {

            if (board[0][i] == player && board[1][i] == player && board[2][i] == player) {
                return true;
            }
        }

        if (board[0][0] == player && board[1][1] == player && board[2][2] == player) {
            return true;
        }

        if (board[0][2] == player && board[1][1] == player && board[2][0] == player) {
            return true;
        }

        return false;
    }

    private static void printBoard() {

        System.out.println(PURPLE + "-----------" + RESET);

        for (int i = 0; i < board.length; i++) {

            System.out.print(PURPLE + "| " + RESET);

            for (int j = 0; j < board[i].length; j++) {

                if (board[i][j] == 'X') {
                    System.out.print(BLUE + board[i][j] + RESET + PURPLE + " |" + RESET);
                } else if (board[i][j] == 'O') {
                    System.out.print(GREEN + board[i][j] + RESET + PURPLE + " |" + RESET);
                } else {
                    System.out.print("  " + PURPLE + "|" + RESET);
                }
            }

            System.out.println();
            System.out.println(PURPLE + "-----------" + RESET);
        }
    }
}
