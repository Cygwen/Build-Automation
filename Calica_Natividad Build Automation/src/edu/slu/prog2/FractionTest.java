package edu.slu.prog2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


class FractionTest {


    @Test
    public void testFractionAdd () {
        /**
         * Dissimilar denominator
         */
        Fraction other = new Fraction(6,21);
        Fraction other2 = new Fraction(3,12);
        Fraction result = other.add(other2);
        assertEquals("15/28",result.toString());
        /**
         * Similar denominator
         */
        Fraction other3 = new Fraction(6,21);
        Fraction other4 = new Fraction(3,21);
        Fraction result1 = other3.add(other4);
        assertEquals("3/7",result1.toString());
        /**
         * Improper Fractions
         */
        Fraction imp1 = new Fraction(12,7);
        Fraction imp2 = new Fraction(18,5);
        Fraction result2 = imp1.add(imp2);
        assertEquals("186/35",result2.toString());
        /**
         * Whole Number and Fraction
         */
        Fraction whlNum1 = new Fraction(5);
        Fraction whlNum2 = new Fraction(29,5);
        Fraction result3 = whlNum1.add(whlNum2);
        assertEquals("54/5",result3.toString());
    }

    @Test
    public void testFractionSubtract () {
        /**
         * Dissimilar denominator
         */
        Fraction other = new Fraction(6,21);
        Fraction other2 = new Fraction(3,12);
        Fraction result = other.add(other2);
        assertEquals("15/28",result.toString());
        /**
         * Similar denominator
         */
        Fraction other3 = new Fraction(6,21);
        Fraction other4 = new Fraction(3,21);
        Fraction result1 = other3.add(other4);
        assertEquals("3/7",result1.toString());
        /**
         * Improper Fractions
         */
        Fraction imp1 = new Fraction(12,7);
        Fraction imp2 = new Fraction(18,5);
        Fraction result2 = imp1.add(imp2);
        assertEquals("186/35",result2.toString());
        /**
         * Whole Number and Fraction
         */
        Fraction whlNum1 = new Fraction(5);
        Fraction whlNum2 = new Fraction(29,5);
        Fraction result3 = whlNum1.add(whlNum2);
        assertEquals("54/5",result3.toString());
    }

}