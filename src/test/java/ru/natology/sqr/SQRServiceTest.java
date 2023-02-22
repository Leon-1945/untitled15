package ru.natology.sqr;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {

    @Test
    public void testWhenFewSquaresFound() {
        SQRService service = new SQRService();

        int actual = service.calc(200, 300);
        int expected = 3;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testWhenFewSquaresFound2() {
        SQRService service = new SQRService();

        int actual = service.calc(200, 200);
        int expected = 0;

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void testWhenFewSquaresFound3() {
        SQRService service = new SQRService();

        int actual = service.calc(100, 120);
        int expected = 1;

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void testWhenFewSquaresFound4() {
        SQRService service = new SQRService();

        int actual = service.calc(10, 99);
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testWhenFewSquaresFound5() {
        SQRService service = new SQRService();

        int actual = service.calc(9650, 9801);
        int expected = 1;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testWhenFewSquaresFound6() {
        SQRService service = new SQRService();

        int actual = service.calc(300, 200);
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }
}

