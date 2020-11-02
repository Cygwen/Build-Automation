import org.junit.Assert;
import org.junit.Test;

import java.awt.font.FontRenderContext;


public class MixedFractionTest extends MixedFraction{

     @Test
     public void MixedFractionTest() {
          /**
           * Proper Mixed Fraction
           */
          MixedFraction mf = new MixedFraction(12,17,99);
          Assert.assertEquals("99 12/17",mf.toString());
          /**
           * Improper Mixed Fraction
           */
          MixedFraction mf1 = new MixedFraction(24,12,10);
          Assert.assertEquals("10 24/12",mf1.toString());
     }

     @Test
     public void setWholePartTest() {
          MixedFraction mf = new MixedFraction(12,24,2);
          mf.setWholePart(14);
          Assert.assertEquals("14 12/24", mf.toString());
     }

     @Test
     public void setFractionPartTest() {
          MixedFraction mf = new MixedFraction(12,24,2);
          Fraction f = new Fraction(24,12);
          mf.setFractionPart(f);
          Assert.assertEquals("2 24/12",mf.toString());
     }

     @Test
     public void MixedFractionExisting() {
          /**
           * Adding Whole Number to existing Fraction
           */
          Fraction f = new Fraction(12,17);
          MixedFraction mf = new MixedFraction(24,f);
          Assert.assertEquals("24 12/17",mf.toString());
     }
    @Test
   public void testMixedFractionAdd () {
        /**
         * Add two Mixed Fraction with common denominators
         */

        MixedFraction mf1 = new MixedFraction(3, 8, 1);
        MixedFraction mf2 = new MixedFraction(3, 8, 7);
        MixedFraction res = new MixedFraction((mf1.toFraction()).add(mf2.toFraction()));
        MixedFraction answer = res.toMixedFraction();
        Assert.assertEquals("8 3/4", answer.toString());

        /**
         * Add two Mixed Fraction with different denominators
         */

        MixedFraction mf3 = new MixedFraction(4, 5, 2);
        MixedFraction mf4 = new MixedFraction(5, 8, 4);
        MixedFraction res1 = new MixedFraction((mf3.toFraction()).add(mf4.toFraction()));
        MixedFraction answer1 = res1.toMixedFraction();
        Assert.assertEquals("7 17/40", answer1.toString());


        /**
         * Add Mixed and Proper fraction
         */
        Fraction f = new Fraction(12,24);
        MixedFraction mf = new MixedFraction(6,22,4);
        Fraction res2 = mf.toFraction().add(f);
        MixedFraction answer2 = new MixedFraction();
        Assert.assertEquals("4 17/22",(answer2.toMixedFraction(res2)).toString());

        /**
         * Add Mixed and whole number
         */
        int wholeNum = 24;
        MixedFraction mf5 = new MixedFraction(6,22,4);
        Fraction wf = new Fraction(wholeNum);
        Fraction res3 = (mf5.toFraction()).add(wf);
        MixedFraction answer3 = new MixedFraction();
        Assert.assertEquals("28 3/11",(answer3.toMixedFraction(res3)).toString());

    }

     @Test
     public void testMixedFractionSubtract () {
          /**
           * Subtract two Mixed Fraction with common denominators
           */

          MixedFraction mf1 = new MixedFraction(3, 8, 1);
          MixedFraction mf2 = new MixedFraction(3, 8, 7);
          MixedFraction res = new MixedFraction((mf1.toFraction()).subtract(mf2.toFraction()));
          MixedFraction answer = res.toMixedFraction();
          Assert.assertEquals("-6", answer.toString());

          /**
           * Subtract two Mixed Fraction with different denominators
           */

          MixedFraction mf3 = new MixedFraction(4, 5, 2);
          MixedFraction mf4 = new MixedFraction(5, 16, 4);
          MixedFraction res1 = new MixedFraction((mf3.toFraction()).subtract(mf4.toFraction()));
          MixedFraction answer1 = res1.toMixedFraction();
          Assert.assertEquals("-1 -41/80", answer1.toString());


          /**
           * Subtract Mixed and Proper fraction
           */
          Fraction f = new Fraction(12,24);
          MixedFraction mf = new MixedFraction(6,22,4);
          Fraction res2 = mf.toFraction().subtract(f);
          MixedFraction answer2 = new MixedFraction();
          Assert.assertEquals("3 17/22",(answer2.toMixedFraction(res2)).toString());

          /**
           * Subtract Mixed and whole number
           */
          int wholeNum = 24;
          MixedFraction mf5 = new MixedFraction(6,22,4);
          Fraction wf = new Fraction(wholeNum);
          Fraction res3 = (mf5.toFraction()).subtract(wf);
          MixedFraction answer3 = new MixedFraction();
          Assert.assertEquals("-19 -8/11",(answer3.toMixedFraction(res3)).toString());

     }

     @Test
     public void testMixedFractionMultiply () {
          /**
           * Multiply two Mixed Fraction with common denominators
           */

          MixedFraction mf1 = new MixedFraction(3, 8, 1);
          MixedFraction mf2 = new MixedFraction(6, 8, 7);
          MixedFraction res = new MixedFraction((mf1.toFraction()).multiplyBy(mf2.toFraction()));
          MixedFraction answer = res.toMixedFraction();
          Assert.assertEquals("10 21/32", answer.toString());

          /**
           * Multiply two Mixed Fraction with different denominators
           */

          MixedFraction mf3 = new MixedFraction(4, 5, 2);
          MixedFraction mf4 = new MixedFraction(5, 16, 4);
          MixedFraction res1 = new MixedFraction((mf3.toFraction()).multiplyBy(mf4.toFraction()));
          MixedFraction answer1 = res1.toMixedFraction();
          Assert.assertEquals("12 3/40", answer1.toString());


          /**
           * Multiply Mixed and Proper fraction
           */
          Fraction f = new Fraction(12,24);
          MixedFraction mf = new MixedFraction(6,22,4);
          Fraction res2 = mf.toFraction().multiplyBy(f);
          MixedFraction answer2 = new MixedFraction();
          Assert.assertEquals("2 3/22",(answer2.toMixedFraction(res2)).toString());

          /**
           * Mulitply Mixed and whole number
           */
          int wholeNum = 24;
          MixedFraction mf5 = new MixedFraction(6,22,4);
          Fraction wf = new Fraction(wholeNum);
          Fraction res3 = (mf5.toFraction()).multiplyBy(wf);
          MixedFraction answer3 = new MixedFraction();
          Assert.assertEquals("102 6/11",(answer3.toMixedFraction(res3)).toString());

     }

     @Test
     public void testMixedFractionDivision () {
          /**
           * Divide Mixed Fraction with common denominators
           */

          MixedFraction mf1 = new MixedFraction(3, 8, 1);
          MixedFraction mf2 = new MixedFraction(3, 8, 7);
          MixedFraction res = new MixedFraction((mf1.toFraction()).divideBy(mf2.toFraction()));
          MixedFraction answer = res.toMixedFraction();
          Assert.assertEquals("11/59", answer.toString());

          /**
           * Divide two Mixed Fraction with different denominators
           */

          MixedFraction mf3 = new MixedFraction(2, 4, 1);
          MixedFraction mf4 = new MixedFraction(4, 4, 2);
          MixedFraction res1 = new MixedFraction((mf3.toFraction()).divideBy(mf4.toFraction()));
          MixedFraction answer1 = res1.toMixedFraction();
          Assert.assertEquals("1/2", answer1.toString());


          /**
           * Divide Mixed and Proper fraction
           */
          Fraction f = new Fraction(2,5);
          MixedFraction mf = new MixedFraction(1,2,3);
          Fraction res2 = mf.toFraction().divideBy(f);
          MixedFraction answer2 = new MixedFraction();
          Assert.assertEquals("8 3/4",(answer2.toMixedFraction(res2)).toString());

          /**
           * Divide Mixed and whole number
           */
          int wholeNum = 8;
          MixedFraction mf5 = new MixedFraction(1,3,3);
          Fraction wf = new Fraction(wholeNum);
          Fraction res3 = (mf5.toFraction()).divideBy(wf);
          MixedFraction answer3 = new MixedFraction();
          Assert.assertEquals("5/12",(answer3.toMixedFraction(res3)).toString());

     }
}