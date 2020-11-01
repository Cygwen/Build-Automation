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
        MixedFraction res = new MixedFraction((mf1.toFraction()).add(mf2.toFraction()));
        MixedFraction answer = res.toMixedFraction();
        assertEquals("8 3/4", answer.toString());

        /**
         * Add two Mixed Fraction with different denominators
         */

        MixedFraction mf3 = new MixedFraction(4, 5, 2);
        MixedFraction mf4 = new MixedFraction(5, 8, 4);
        MixedFraction res1 = new MixedFraction((mf3.toFraction()).add(mf4.toFraction()));
        MixedFraction answer1 = res1.toMixedFraction();
        assertEquals("7 17/40", answer1.toString());


        /**
         * Add Mixed and Proper fraction
         */
        Fraction f = new Fraction(12,24);
        MixedFraction mf = new MixedFraction(6,22,4);
        Fraction res2 = mf.toFraction().add(f);
        MixedFraction answer2 = new MixedFraction();
        assertEquals("4 17/22",(answer2.toMixedFraction(res2)).toString());

        /**
         * Add Mixed and whole number
         */
        int wholeNum = 24;
        MixedFraction mf5 = new MixedFraction(6,22,4);
        Fraction wf = new Fraction(wholeNum);
        Fraction res3 = (mf5.toFraction()).add(wf);
        MixedFraction answer3 = new MixedFraction();
        assertEquals("28 3/11",(answer3.toMixedFraction(res3)).toString());


    }

}