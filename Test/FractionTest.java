import org.junit.Assert;
import org.junit.Test;

public class FractionTest extends Fraction {

    @Test
    public void testReduce() {
        /**
         * Proper Fraction
         */
        Fraction f = new Fraction(68,100);
        f.reduce();
        Assert.assertEquals("17/25",f.toString());
        /**
         * Improper Fraction
         */
        Fraction f2 = new Fraction(56,12);
        f2.reduce();
        Assert.assertEquals("14/3",f2.toString());

    }
    @Test
    public void testFractionAdd () {
        /**
         * Dissimilar denominator
         */
        Fraction other = new Fraction(6,21);
        Fraction other2 = new Fraction(3,12);
        Fraction result = other.add(other2);
        Assert.assertEquals("15/28",result.toString());
        /**
         * Similar denominator
         */
        Fraction other3 = new Fraction(6,21);
        Fraction other4 = new Fraction(3,21);
        Fraction result1 = other3.add(other4);
        Assert.assertEquals("3/7",result1.toString());
        /**
         * Improper Fractions
         */
        Fraction imp1 = new Fraction(12,7);
        Fraction imp2 = new Fraction(18,5);
        Fraction result2 = imp1.add(imp2);
        Assert.assertEquals("186/35",result2.toString());
        /**
         * Whole Number and Fraction
         */
        Fraction whlNum1 = new Fraction(5);
        Fraction whlNum2 = new Fraction(29,5);
        Fraction result3 = whlNum1.add(whlNum2);
        Assert.assertEquals("54/5",result3.toString());
    }

    @Test
    public void testFractionSubtract () {
        /**
         * Dissimilar denominator
         */
        Fraction other = new Fraction(6,7);
        Fraction other2 = new Fraction(2,5);
        Fraction result = other.subtract(other2);
        Assert.assertEquals("16/35",result.toString());
        /**
         * Similar denominator
         */
        Fraction other3 = new Fraction(6,7);
        Fraction other4 = new Fraction(2,7);
        Fraction result1 = other3.subtract(other4);
        Assert.assertEquals("4/7",result1.toString());
        /**
         * Improper Fractions
         */
        Fraction imp1 = new Fraction(4,5);
        Fraction imp2 = new Fraction(2,3);
        Fraction result2 = imp1.subtract(imp2);
        Assert.assertEquals("2/15",result2.toString());
        /**
         * Whole Number and Fraction
         */
        Fraction whlNum1 = new Fraction(8);
        Fraction whlNum2 = new Fraction(4,5);
        Fraction result3 = whlNum1.subtract(whlNum2);
        Assert.assertEquals("36/5",result3.toString());
    }

    @Test
    public void testFractionDivision () {
        /**
         * Dissimilar denominator
         */
        Fraction other = new Fraction(2,6);
        Fraction other2 = new Fraction(3,3);
        Fraction result = other.divideBy(other2);
        Assert.assertEquals("1/3",result.toString());
        /**
         * Similar denominator
         */
        Fraction other3 = new Fraction(6,7);
        Fraction other4 = new Fraction(4,7);
        Fraction result1 = other3.divideBy(other4);
        Assert.assertEquals("3/2",result1.toString());
        /**
         * Improper Fractions
         */
        Fraction imp1 = new Fraction(12,7);
        Fraction imp2 = new Fraction(18,5);
        Fraction result2 = imp1.divideBy(imp2);
        Assert.assertEquals("10/21",result2.toString());
        /**
         * Whole Number and Fraction
         */
        Fraction whlNum1 = new Fraction(2,3);
        Fraction whlNum2 = new Fraction(5);
        Fraction result3 = whlNum1.divideBy(whlNum2);
        Assert.assertEquals("2/15",result3.toString());
    }

    @Test
    public void testFractionMultiplyBy () {
        /**
         * Dissimilar denominator
         */
        Fraction other = new Fraction(2,4);
        Fraction other2 = new Fraction(4,7);
        Fraction result = other.multiplyBy(other2);
        Assert.assertEquals("2/7",result.toString());
        /**
         * Similar denominator
         */
        Fraction other3 = new Fraction(12,20);
        Fraction other4 = new Fraction(18,20);
        Fraction result1 = other3.multiplyBy(other4);
        Assert.assertEquals("27/50",result1.toString());
        /**
         * Improper Fractions
         */
        Fraction imp1 = new Fraction(11,3);
        Fraction imp2 = new Fraction(11,4);
        Fraction result2 = imp1.multiplyBy(imp2);
        Assert.assertEquals("121/12",result2.toString());
        /**
         * Whole Number and Fraction
         */
        Fraction whlNum1 = new Fraction(12);
        Fraction whlNum2 = new Fraction(4,5);
        Fraction result3 = whlNum1.multiplyBy(whlNum2);
        Assert.assertEquals("48/5",result3.toString());
    }

}