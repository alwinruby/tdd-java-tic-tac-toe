package tictactoe;

public class TicTacToe
{
    private String[][] board = { {"", "", ""},
            {"", "", ""},
            {"", "", ""} };

    private String lastPlayer = "";

    public String play(int x, int y)
    {
        checkAxis(x);
        checkAxis(y);
        lastPlayer = nextPlayer();
        setOccupied(x, y);

        for (int i=0; i<3; i++)
        {
            if (board[0][i] == lastPlayer &&
                    board[1][i] == lastPlayer &&
                    board[2][i] == lastPlayer)
                return lastPlayer + " is the winner";
        }

        return "No winner";
    }

    private void checkAxis(int axis)
    {
        if (axis < 1 || axis > 3)
            throw new java.lang.RuntimeException("outside board");
    }

    private void setOccupied(int x, int y)
    {
        if (board[x-1][y-1] != "")
            throw new java.lang.RuntimeException("Place is occupied");
        else
            board[x-1][y-1] = lastPlayer;
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