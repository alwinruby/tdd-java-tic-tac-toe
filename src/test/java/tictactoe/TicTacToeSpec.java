package tictactoe;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

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



}
