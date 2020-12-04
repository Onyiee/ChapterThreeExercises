package numberthreepointonefour;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DateTest {
    Date date;
    @BeforeEach
    void setUp() {
        date = new Date(05, 13,1995);
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void testDateSetDayMethodShouldSetTheDayField(){
        date.setDay(27);
        assertEquals(27,date.getDay());
    }

    @Test
    void testDateGetDayMethodShouldGetTheDay(){
        date.setDay(27);
        assertEquals(27,date.getDay());
    }

    @Test
    void testGetMonth(){
        date.setMonth(06);
        assertEquals(6, date.getMonth());
    }

    @Test
    void  testSetMonth(){
        date.setMonth(06);
        assertEquals(6, date.getMonth());
    }

    @Test
    void testGetYear(){
        date.setYear(2005);
        assertEquals(2005, date.getYear());
    }

    @Test
    void testSetYear(){
        date.setYear(2015);
        assertEquals(2015, date.getYear());
    }
    @Test
    void test(){
        System.out.println(date);
    }
}