package business.entities;

import business.exceptions.UserException;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalcCarportTest {

    @Test
    void calcPosts() {
        CalcCarport calcCarport = new CalcCarport();
        int actual = calcCarport.calcPosts(780).getQuantity();
        int expected = 8;
        assertEquals(expected, actual);
    }

    @Test
    void calcBeams() {
        CalcCarport calcCarport = new CalcCarport();
        int actual = calcCarport.calcBeams(780).getQuantity();
        int expected = 2;
        assertEquals(expected, actual);
    }

    @Test
    void calcRafter() {
        CalcCarport calcCarport = new CalcCarport();
        int actual = calcCarport.calcRafter(780,600).getQuantity();
        int expected = 14;
        assertEquals(expected, actual);
    }

    @Test
    void calcPlastmo() {
        CalcCarport calcCarport = new CalcCarport();
        int actual = calcCarport.calcPlastmo(780, 600).getQuantity();
        int expected = 9;
        assertEquals(expected, actual);
    }

    @Test
    void calcPostbolts() {
        CalcCarport calcCarport = new CalcCarport();
        int actual = calcCarport.calcPostbolts(780).getQuantity();
        int expected = 16;
        assertEquals(expected, actual);
    }

    @Test
    void calcSquareDiscs() {
        CalcCarport calcCarport = new CalcCarport();
        int actual = calcCarport.calcSquareDiscs(780).getQuantity();
        int expected = 16;
        assertEquals(expected, actual);
    }

    @Test
    void calcUniRight() {
        CalcCarport calcCarport = new CalcCarport();
        int actual = calcCarport.calcUniRight(780, 600).getQuantity();
        int expected = 14;
        assertEquals(expected, actual);
    }

    @Test
    void calcUniLeft() {
        CalcCarport calcCarport = new CalcCarport();
        int actual = calcCarport.calcUniLeft(780, 600).getQuantity();
        int expected = 14;
        assertEquals(expected, actual);
    }

    @Test
    void calcPlastmoBolt() {
        CalcCarport calcCarport = new CalcCarport();
        int actual = calcCarport.calcPlastmoBolt(780, 600).getQuantity();
        int expected = 3;
        assertEquals(expected, actual);
    }
}