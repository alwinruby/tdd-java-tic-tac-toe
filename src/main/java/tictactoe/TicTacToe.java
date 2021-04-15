package tictactoe;

public class TicTacToe {

    private String[][] board = { {"", "", ""},
            {"", "", ""},
            {"", "", ""} };

    public void play(int x, int y)
    {
        if (x < 1 || x > 3) {
            throw new RuntimeException("X is outside board");
            //throw new java.lang.RuntimeException("X is outside board");
        }

        if (y < 1 || y > 3) {
            throw new java.lang.RuntimeException("Y is outside board");
        }

        if (board[x-1][y-1] != "")
            throw new java.lang.RuntimeException("Place is occupied");
        else
            board[x-1][y-1] = "occupied";
    }

}
