

/**
 *This class enables the manipulation of
 *fraction input such as adding or subtracting
 *fractions.
 *
 *@author Natividad, Hudson Kit P. and Calica, Gwyneth M.
 */
public class Fraction {

    /**
     *The numerator of the fraction.
     */
    private int numerator;

    /**
     *The denominator of the fraction.
     */
    private int denominator;

    /**
     *Constructs a fraction with a fixed value
     *for the numerator (0) and the denominator (1)
     */
    public Fraction() {
        numerator = 0;
        denominator = 1;
    }

    /**
     *Constructs a fraction with a fixed value for
     *the denominator (1) but with a given numerator.
     *@param wholeNumVal An integer number of for the numerator
     */
    public Fraction(int wholeNumVal) {
        this.numerator = wholeNumVal;
        denominator = 1;
    }

    /**
     *Constructs a fraction with a given numerator
     *and denominator.
     * @param numerator The numerator of the fraction
     * @param denominator The denominator of the fraction
     */
    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    /**
     *Gets the numerator of the given fraction.
     * @return The numerator of the fraction
     */
    public int getNumerator() {
        return numerator;
    }

    /**
     *Gets the denominator of the given fraction
     * @return The denominator of the fraction
     */
    public int getDenominator() {
        return denominator;
    }

    /**
     *Changes the numerator of the given fraction.
     * @param numerator The numerator of the fraction
     */
    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    /**
     * Changes the denominator of the given fraction.
     * @param denom The denominator of the fraction
     */
    public void setDenominator(int denom) {
        denominator = denom;
    }


    /**
     * Converts integer output of fraction to printable
     * String output.
     * @return String equivalent of fraction
     */
    public String toString() {
        return (numerator + "/" + denominator);
    }


    /**
     * Converts integer output of fraction to double output
     * @return Double equivalent of fraction
     */
    public double toDouble() {
        return (double) numerator / denominator;
    }


    /**
     * Reduces fraction to its simplest form
     */
    public void reduce() {
        int gcd = computeGCD();
        int newNumerator = numerator / gcd;
        int newDenominator = denominator / gcd;
        setNumerator(newNumerator);
        setDenominator(newDenominator);
    }

    /**
     * Adds fraction with another fraction.
     * @param other A fraction that is to be added with the current fraction.
     * @return The sum of two fractions.
     */
    public Fraction add(Fraction other) {
        Fraction result = new Fraction();
        int den = denominator * other.getDenominator();
        int num = den / denominator * numerator + den / other.getDenominator() * other.getNumerator();
        result.setNumerator(num);
        result.setDenominator(den);
        result.reduce();
        return result;
    }


    /**
     * Subtracts fraction with another fraction.
     * @param other A fraction that is to be subtracted with the current fraction.
     * @return The difference of two fractions.
     */
    public Fraction subtract(Fraction other) {
        Fraction result = new Fraction();
        int den = denominator * other.getDenominator();
        int num = den / denominator * numerator - den / other.getDenominator() * other.getNumerator();
        result.setNumerator(num);
        result.setDenominator(den);
        result.reduce();
        return result;
    }


    /**
     * Multiplies fraction with another fraction.
     * @param other A fraction that is to be multiplied with the current fraction.
     * @return The product of two fractions.
     */
    public Fraction multiplyBy(Fraction other) {
        Fraction result = new Fraction();
        int num = numerator * other.getNumerator();
        int den = denominator * other.getDenominator();
        result.setNumerator(num);
        result.setDenominator(den);
        result.reduce();
        return result;
    }

    /**
     * Divides fraction with another fraction.
     * @param other A fraction that is to be divided with the current fraction.
     * @return The quotient of two fractions.
     */
    public Fraction divideBy(Fraction other) {
        Fraction result = new Fraction();
        int num = numerator * other.getDenominator();
        int den = denominator * other.getNumerator();
        result.setNumerator(num);
        result.setDenominator(den);
        result.reduce();
        return result;
    }

    /**
     * Computes for the greatest common divisor of a fraction.
     */
    private int computeGCD() {
        int operand1;
        int operand2;
        int remainder;
       if(numerator > denominator){
           operand1 = numerator;
           operand2 = denominator;
           do{
               remainder = operand1 % operand2;
               operand1 = operand2;
               operand2 = remainder;
               if(remainder == 0){ return operand1; }
           }while(remainder != 0);
       }else{
           operand1 = denominator;
           operand2 = numerator;
           do{
               remainder = operand1 % operand2;
               operand1 = operand2;
               operand2 = remainder;
               if(remainder == 0){ return operand1; }
           }while(remainder != 0);
       }
       return operand1;
    }

}
