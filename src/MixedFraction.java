/**
 * This class enables the manipulation of
 *  mixed fractions and inherited some of
 *  its functions from the Fraction class.
 *
 * @author Natividad, Hudson Kit P. and Calica, Gwyneth
 */
public class MixedFraction extends Fraction {

    /**
     * The whole number of the mixed fraction.
     */
    private int whole;

    /**
     * Constructs a mixed fraction with a fixed value
     * for the numerator(0), denominator(1), and the
     * whole number(0).
     */
    public MixedFraction(){
        super();
        this.whole = 0;
    }

    /**
     * Constructs a mixed fraction with a given whole number
     * and a given fraction.
     * @param whole The whole number of the mixed fraction
     * @param fraction The fraction part of the mixed fraction
     */
    public MixedFraction(int whole, Fraction fraction){
        this.whole = whole;
        super.setNumerator(fraction.getNumerator());
        super.setDenominator(fraction.getDenominator());
    }

    /**
     * Constructs a mixed fraction with a given numerator, denominator,
     * and whole number
     * @param numerator The numerator of the mixed fraction
     * @param denominator The denominator of the mixed fraction
     * @param  whole The whole number of the mixed fraction
     */
    public MixedFraction(int numerator, int denominator, int whole){
        super(numerator,denominator);
        this.whole = whole;
    }

    /**
     * Constructs a mixed fraction with a given fraction only.
     * @param fraction The fraction part of the mixed fraction
     */
    public MixedFraction(Fraction fraction){
       super.setNumerator(fraction.getNumerator());
       super.setDenominator(fraction.getDenominator());
    }

    /**
     * Changes the whole number of a mixed fraction.
     * @param whole The whole number of the fraction
     */
    public void setWholePart(int whole){
        this.whole = whole;
    }

    /**
     * Changes the fraction part of a mixed fraction.
     * @param fraction The fraction part of the mixed fraction
     */
    public void setFractionPart(Fraction fraction){
        super.setNumerator(fraction.getNumerator());
        super.setDenominator(fraction.getDenominator());
    }

    /**
     * Gets the whole number of a mixed fraction.
     * @return The whole number of the mixed fraction
     */
    public int getWhole(){
        return whole;
    }

    /**
     * Gets the fraction part of a mixed fraction.
     * @return The fraction part of the mixed fraction
     */
    public Fraction getFractionPart(){
        Fraction result = new Fraction();
        int numerator = super.getNumerator();
        int denominator = super.getDenominator();
        result.setNumerator(numerator);
        result.setDenominator(denominator);
        return result;
    }

    /**
     * Converts integer output of mixed fraction to
     * printable String output.
     * @return String equivalent of mixed fraction
     */
    public String toString(){
        if(whole != 0 && super.getDenominator() != 1) {
            return (whole + " " + super.toString());
        }else if(super.getDenominator() == 1){
            return ((super.getDenominator() * whole + super.getNumerator()) + "");
        }else{
            return (super.toString());
        }
    }

    /**
     * Converst integer output of mixed fraction to
     * double output
     * @return Double equivalent of mixed fraction
     */
    public double toDouble(){
        int denominator = super.getDenominator();
        int numerator = super.getDenominator() * whole + super.getNumerator();
        return (double)  numerator / denominator;
    }

    /**
     * Converts a mixed fraction to an improper fraction.
     * @param other The mixed fraction to be converted
     * @return An improper fraction
     */
    public Fraction toFraction(MixedFraction other){
        MixedFraction impfraction = new MixedFraction();
        int denominator = other.getDenominator();
        int numerator = other.getDenominator() * other.getWhole() + other.getNumerator();
        Fraction fraction = new Fraction(numerator, denominator);
        impfraction.setFractionPart(fraction);
        return (impfraction.getFractionPart());
    }

    /**
     * Converts a mixed fraction to an improper fraction.
     * @return An improper fraction
     */
    public Fraction toFraction(){
        MixedFraction impfraction = new MixedFraction();
        int denominator = super.getDenominator();
        int numerator = super.getDenominator() * getWhole() + super.getNumerator();
        Fraction fraction = new Fraction(numerator, denominator);
        impfraction.setFractionPart(fraction);
        return (impfraction.getFractionPart());
    }

    /**
     * Converts a regular fraction to a mixed fraction.
     * @param other The fraction to be converted to a mixed fraction
     * @return A mixed fraction
     */
    public MixedFraction toMixedFraction(Fraction other){
        MixedFraction mixfraction = new MixedFraction();
        int denominator = other.getDenominator();
        int numerator = other.getNumerator() % denominator;
        int whole = other.getNumerator() / denominator;
        mixfraction.setDenominator(denominator);
        mixfraction.setNumerator(numerator);
        mixfraction.setWholePart(whole);
        return mixfraction;
    }

    /**
     * Converts a regular fraction to a mixed fraction.
     * @return A mixed fraction
     */
    public MixedFraction toMixedFraction(){
        MixedFraction mixfraction = new MixedFraction();
        int denominator = super.getDenominator();
        int numerator = super.getNumerator() % denominator;
        int whole = super.getNumerator() / denominator;
        mixfraction.setDenominator(denominator);
        mixfraction.setNumerator(numerator);
        mixfraction.setWholePart(whole);
        return mixfraction;
    }

    /**
     * Adds a mixed fraction with another mixed fraction.
     * @param other The mixed fraction that is to be added with the current mixed fraction
     * @return The sum of two mixed fractions.
     */
    public MixedFraction add(MixedFraction other){
        MixedFraction result = new MixedFraction();
        int denominator = super.getDenominator() * other.getDenominator();
        int numerator = denominator / super.getDenominator() * super.getNumerator() + denominator / other.getDenominator() * other.getNumerator();
        result.setNumerator(numerator);
        result.setDenominator(denominator);
        result.reduce();
        return result;
    }

    /**
     * Adds a mixed fraction with a regular fraction.
     * @param other The fraction that is to be added with the current mixed fraction
     * @return The sum of a mixed fraction and a regular fraction.
     */
    public MixedFraction add(Fraction other){
        MixedFraction result = new MixedFraction();
        int denominator = super.getDenominator() * other.getDenominator();
        int numerator = denominator / super.getDenominator() * super.getNumerator() + denominator / other.getDenominator() * other.getNumerator();
        result.setNumerator(numerator);
        result.setDenominator(denominator);
        result.reduce();
        return result;
    }

    /**
     * Adds a mixed fraction with an integer.
     * @param wholeNumVal The integer to be added to with the current fraction
     * @return The sum of a mixed fraction and an integer
     */
    public MixedFraction add(int wholeNumVal){
        Fraction fraction = new Fraction(wholeNumVal);
        MixedFraction result = new MixedFraction();
        int denominator = super.getDenominator() * fraction.getDenominator();
        int numerator = denominator / super.getDenominator() * super.getNumerator() + denominator / fraction.getDenominator() * fraction.getNumerator();
        result.setNumerator(numerator);
        result.setDenominator(denominator);
        result.reduce();
        return result;
    }

    /**
     * Subtracts a mixed fraction with another mixed fraction.
     * @param other The mixed fraction that is to be subtracted with the current mixed fraction
     * @return The difference of two mixed fractions.
     */
    public MixedFraction subtract(MixedFraction other){
        MixedFraction result = new MixedFraction();
        int denominator = super.getDenominator() * other.getDenominator();
        int numerator = denominator / super.getDenominator() * super.getNumerator() - denominator / other.getDenominator() * other.getNumerator();
        result.setNumerator(numerator);
        result.setDenominator(denominator);
        result.reduce();
        return result;
    }

    /**
     * Subtracts a mixed fraction with a regular fraction.
     * @param other The fraction that is to be subtracted with the current mixed fraction
     * @return The difference of a mixed fraction and a regular fraction
     */
    public MixedFraction subtract(Fraction other){
        MixedFraction result = new MixedFraction();
        int denominator = super.getDenominator() * other.getDenominator();
        int numerator = denominator / super.getDenominator() * super.getNumerator() - denominator / other.getDenominator() * other.getNumerator();
        result.setNumerator(numerator);
        result.setDenominator(denominator);
        result.reduce();
        return result;
    }

    /**
     * Subtracts a mixed fraction with an integer.
     * @param wholeNumVal The integer that is to be subtracted with the current mixed fraction
     * @return The difference of a mixed fraction and an integer
     */
    public MixedFraction subtract(int wholeNumVal){
        Fraction fraction = new Fraction(wholeNumVal);
        MixedFraction result = new MixedFraction();
        int denominator = super.getDenominator() * fraction.getDenominator();
        int numerator = denominator / super.getDenominator() * super.getNumerator() - denominator / fraction.getDenominator() * fraction.getNumerator();
        result.setNumerator(numerator);
        result.setDenominator(denominator);
        result.reduce();
        return result;
    }

    /**
     * Multiplies a mixed fraction with another mixed fraction.
     * @param other The mixed fraction that is to be multiplied with the current mixed fraction
     * @return The product of two mixed fractions.
     */
    public MixedFraction multiplyBy(MixedFraction other){
        MixedFraction result = new MixedFraction();
        int denominator = super.getDenominator() * other.getDenominator();
        int numerator = super.getNumerator() * other.getNumerator();
        result.setNumerator(numerator);
        result.setDenominator(denominator);
        result.reduce();
        return result;
    }

    /**
     * Multiplies a mixed fraction with a regular fraction.
     * @param other The fraction that is to be multiplied with the current mixed fraction
     * @return The product of a mixed fraction and a regular fraction.
     */
    public MixedFraction multiplyBy(Fraction other){
        MixedFraction result = new MixedFraction();
        int denominator = super.getDenominator() * other.getDenominator();
        int numerator = super.getNumerator() * other.getNumerator();
        result.setNumerator(numerator);
        result.setDenominator(denominator);
        result.reduce();
        return result;
    }

    /**
     * Multiplies a mixed fraction with an integer.
     * @param wholeNumVal The integer that is to be multiplied with the current mixed fraction
     * @return The product of a mixed fraction and an integer.
     */
    public MixedFraction multiplyBy(int wholeNumVal){
        Fraction fraction = new Fraction(wholeNumVal);
        MixedFraction result = new MixedFraction();
        int denominator = super.getDenominator() * fraction.getDenominator();
        int numerator = super.getNumerator() * fraction.getNumerator();
        result.setNumerator(numerator);
        result.setDenominator(denominator);
        result.reduce();
        return result;
    }

    /**
     * Divides a mixed fraction with another mixed fraction.
     * @param other The mixed fraction that is to be divided with the current mixed fraction
     * @return The quotient of two mixed fractions.
     */
    public MixedFraction divideBy(MixedFraction other){
        MixedFraction result = new MixedFraction();
        int denominator = super.getDenominator() * other.getNumerator();
        int numerator = super.getNumerator() * other.getDenominator();
        result.setNumerator(numerator);
        result.setDenominator(denominator);
        result.reduce();
        return result;
    }

    /**
     * Divides a mixed fraction with a regular fraction.
     * @param other The fraction that is to be divided with the current mixed fraction
     * @return The quotient of a mixed fraction and a regular fraction.
     */
    public MixedFraction divideBy(Fraction other){
        MixedFraction result = new MixedFraction();
        int denominator = super.getDenominator() * other.getNumerator();
        int numerator = super.getNumerator() * other.getDenominator();
        result.setNumerator(numerator);
        result.setDenominator(denominator);
        result.reduce();
        return result;
    }

    /**
     * Divides a mixed fraction with an integer.
     * @param wholeNumVal The integer that is to be divided with the current mixed fraction
     * @return The quotient of a mixed fraction and an integer.
     */
    public MixedFraction divideBy(int wholeNumVal){
        Fraction fraction = new Fraction(wholeNumVal);
        MixedFraction result = new MixedFraction();
        int denominator = super.getDenominator() * fraction.getNumerator();
        int numerator = super.getNumerator() * fraction.getDenominator();
        result.setNumerator(numerator);
        result.setDenominator(denominator);
        result.reduce();
        return result;
    }


}
