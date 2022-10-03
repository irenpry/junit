package ratTest;

import junit.framework.TestCase;
import org.junit.Test;
import rat.RatNum;
import rat.RatPoly;

public class RatPolyTest extends TestCase {

    private RatPoly ratPolyDegree0 = new RatPoly();
    private RatPoly ratPolyDegree1 = new RatPoly();
    private RatNum[] coeffsNull1 = null;
    private RatNum[] coeffsNull2 = new RatNum[2];
    private RatNum[] coeffs0 = {new RatNum(0)};
    private RatNum[] coeffs5 = {new RatNum(-50),new RatNum(0),new RatNum(5),new RatNum(79),new RatNum(-1)};

    @Test
    public void testEmptyConstructor() {
        new RatPoly();
    }

    @Test
    public void testSimpleConstructor() {
        new RatPoly(5,0);
        new RatPoly(5,5);
        new RatPoly(-5,5);
        try {
            new RatPoly(0,0);;
        } catch (RuntimeException e) {
        }
        try {
            new RatPoly(0,5);;
        } catch (RuntimeException e) {
        }
        try {
            new RatPoly(-5,-5);
        } catch (IllegalArgumentException e) {
        }
    }

    @Test
    public void testArrayConstructor() {
        try {
            RatPoly ratPoly0 = new RatPoly(coeffs0);
        } catch (RuntimeException e) {
        }
        try {
            RatPoly ratPolyNull1 = new RatPoly(coeffsNull1);
        } catch (NullPointerException e) {
        }
        try {
            RatPoly ratPolyNull2 = new RatPoly(coeffsNull2);
        } catch (RuntimeException e) {
        }
        RatPoly ratPoly5 = new RatPoly(coeffs5);
    }

    public void testDegree() {
        assertEquals(0,new RatPoly().degree());
        assertEquals(0,new RatPoly(4,0).degree());
        assertEquals(5,new RatPoly(1,5).degree());
    }

    public void testGetCoeff() {
        assertEquals(0,new RatPoly().degree());
        assertEquals(0,new RatPoly(4,0).degree());
        assertEquals(5,new RatPoly(1,5).degree());
    }

    public void testIsNaN() {
    }

    public void testNegate() {
    }

    public void testAdd() {
    }

    public void testSub() {
    }

    public void testMul() {
    }

    public void testDiv() {
    }

    public void testEval() {
    }

    public void testDifferentiate() {
    }

    public void testAntiDifferentiate() {
    }

    public void testIntegrate() {
    }

    public void testTestToString() {
    }

    public void testValueOf() {
    }

    public void testTestHashCode() {
    }

    public void testTestEquals() {
    }
}