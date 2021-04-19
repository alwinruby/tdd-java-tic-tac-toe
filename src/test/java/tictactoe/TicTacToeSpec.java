package tictactoe;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TicTacToeSpec {

    private TicTacToe ttt;

    @BeforeEach
    public void setUp() throws Exception
    {
        ttt = new TicTacToe();
    }

    @Test
    public void whenXOutsideBoardException()
    {
        Assertions.assertThrows(RuntimeException.class, () -> {
            ttt.play(5, 2);
        });
    }

    @Test
    public void whenYOutsideBoardException()
    {
        Assertions.assertThrows(RuntimeException.class, () -> {
            ttt.play(2, 5);
        });
    }

    @Test
    public void whenOccupiedException()
    {
        ttt.play(1, 3);       // imitate player X places a piece in (1,3)

        // imitate player O tries to place a piece in an occupied space (1,3)
        Assertions.assertThrows(RuntimeException.class, () -> {
            ttt.play(1, 3);
        });
    }

    @Test
    public void whenOccupiedThenRuntimeException() {
        ttt.play(2, 1);
        Assertions.assertThrows(RuntimeException.class, () -> {
            ttt.play(2, 1);
        });
    }

    @Test
    public void givenLastTurnWasX_NowPlayerOTurn()
    {
        // X played first
        ttt.play(1,1);

        // check if the next player is O
        assertEquals("O", ttt.nextPlayer());
    }

    @Test
    void givenLastTurnWasO_NowPlayerXTurn()
    {
        ttt.play(1,1);        // X played first
        ttt.play(3,3);        // O played first

        // check if the next player is X
        assertEquals("X", ttt.nextPlayer());
    }



}
