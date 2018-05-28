package model;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class ElementTest {
    private Element Element;

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
        this.Element = new Element(1, 1, ' ');
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testGetX() {
        final int expected = 1;
        assertEquals(expected, this.Element.getX());
    }
    
    @Test
    public void testGetY() {
        final int expected = 1;
        assertEquals(expected, this.Element.getY());
    }

    @Test
    public void testGetName() {
        final char expected = ' ';
        assertEquals(expected, this.Element.getType());
    }

    @Test
    public void testSetName() {
        char expected = ' ';
        assertEquals(expected, this.Element.getType());
        expected = 'r';
        this.Element.setType(expected);
        assertEquals(expected, this.Element.getType());
    }

    @Test
    public void testToString() {
        final String expected = "1, 1 :  ";
        assertEquals(expected, this.Element.toString());
    }

}
