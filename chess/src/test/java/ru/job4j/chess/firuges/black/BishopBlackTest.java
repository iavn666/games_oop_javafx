package ru.job4j.chess.firuges.black;

import org.junit.Test;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.Figure;

import static java.awt.Event.F5;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;
import static ru.job4j.chess.firuges.Cell.*;

public class BishopBlackTest {

    @Test
    public void position() {
        BishopBlack a = new BishopBlack(Cell.H3);
        Cell actual = a.position();
        Cell exept = Cell.H3;
        assertThat(exept,is(actual));
    }

    @Test
    public void copy() {
        BishopBlack a = new BishopBlack(Cell.H3);
        Figure figure = a.copy(Cell.F5);
        Cell actual = figure.position();
        Cell expected = Cell.F5;
        assertThat(actual,is(expected));

    }


    @Test
    public void way() {
        BishopBlack a = new BishopBlack(Cell.C1);
        Cell[] actual = a.way(Cell.C1,Cell.G5);
        Cell[] expected = {D2, E3, F4, G5};
        assertThat(actual,is(expected));
    }
}