package edu.slu.prog2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MixedFractionTest {

    @Test
   public void testMixedFractionAdd () {
        /**
         * Add two Mixed Fraction with common denominators
         */

        MixedFraction mf1 = new MixedFraction(3, 8, 1);
        MixedFraction mf2 = new MixedFraction(3, 8, 7);
        MixedFraction res = new MixedFraction(mf1.add(mf2));
        res.reduce();
        assertEquals("7 1/8", res.toString());

        /**
         * Add two Mixed Fraction with different denominators
         */

        MixedFraction mf3 = new MixedFraction(4, 4, 2);
        MixedFraction mf4 = new MixedFraction(5, 8, 4);
        MixedFraction res1 = new MixedFraction(mf3.add(mf4));
        res1.reduce();
        assertEquals("7 5/8", res1.toString());


        /**
         * Add Mixed and Proper fraction
         */
        Fraction f = new Fraction(12,24);
        MixedFraction mf = new MixedFraction(6,22,4);
        mf.add(f);
        assertEquals("4 17/22",mf.toString());

        /**
         * Add Mixed and whole number
         */
        int wholeNum = 24;
        MixedFraction mf5 = new MixedFraction(6,22,4);
        mf5.add(wholeNum);
        assertEquals("28 3/11",mf5.toString());


    }

}