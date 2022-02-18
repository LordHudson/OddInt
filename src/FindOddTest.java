import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class FindOddTest {

    private FindOdd findOdd;

    @BeforeEach
    public void setup () {
        findOdd = new FindOdd();
        System.out.println("Running a test");
    }

    @Test
    void isOdd()  {

        assertTrue(findOdd.isOdd(1));
        assertTrue(findOdd.isOdd(-1));
        assertTrue(findOdd.isOdd(11));
        assertFalse(findOdd.isOdd(0));
        assertFalse(findOdd.isOdd(2));
        assertFalse(findOdd.isOdd(10));
        
    }

    @Test
    void findIt() {
        assertEquals(5, findOdd.findIt(new int[]{20,1,-1,2,-2,3,3,5,5,1,2,4,20,4,-1,-2,5}));
        assertEquals(-1, findOdd.findIt(new int[]{1,1,2,-2,5,2,4,4,-1,-2,5}));
        assertEquals(5, findOdd.findIt(new int[]{20,1,1,2,2,3,3,5,5,4,20,4,5}));
        assertEquals(10, findOdd.findIt(new int[]{10}));
        assertEquals(10, findOdd.findIt(new int[]{1,1,1,1,1,1,10,1,1,1,1}));
        assertEquals(1, findOdd.findIt(new int[]{5,4,3,2,1,5,4,3,2,10,10}));
    }

}
