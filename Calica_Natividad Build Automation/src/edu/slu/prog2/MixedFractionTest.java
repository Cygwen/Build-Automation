package edu.slu.prog2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MixedFractionTest {

    @Test
   public void testMixedFractionAdd () {

        /**
         * Add two Mixed Fraction with common denominators
         */
        MixedFraction mf1 = new MixedFraction(4,8,2);
        MixedFraction mf2 = new MixedFraction(5,8,4);
        MixedFraction res = new MixedFraction(mf1.add(mf2));
        res.reduce();
        assertEquals("7 1/8",res.toString());


    }
}