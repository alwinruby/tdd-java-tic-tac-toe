package tictactoe;

public class TicTacToe {

//    private String[][] board = { {"", "", ""},
//            {"", "", ""},
//            {"", "", ""} };

    private Character[][] board = {{'\0', '\0', '\0'},
            {'\0', '\0', '\0'}, {'\0', '\0', '\0'}};

    private String lastPlayer = "";

    public void play(int x, int y)
    {
//        checkAxis(x);
//        checkAxis(y);
//        setOccupied(x, y);

        if (x < 1 || x > 3) {
            throw
                    new RuntimeException("X is outside board");
        } else if (y < 1 || y > 3) {
            throw
                    new RuntimeException("Y is outside board");
        }
        if (board[x - 1][y - 1] != '\0') {
            throw
                    new RuntimeException("Box is occupied");
        } else {
            board[x - 1][y - 1] = 'X';
        }
    }

    private void checkAxis(int axis)
    {
        if (axis < 1 || axis > 3)
            throw new java.lang.RuntimeException("outside board");
    }

    private void setOccupied(int x, int y)
    {
        if (board[x-1][y-1] != '\0')
            throw new java.lang.RuntimeException("Box is occupied");
        else
            board[x-1][y-1] = 'X';
    }

    public String nextPlayer()
    {
        if (lastPlayer != "X")
            lastPlayer = "X";
        else
            lastPlayer = "O";

        return lastPlayer;
    }

}
