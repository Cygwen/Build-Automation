

import java.util.Scanner;

/*
* Programmed by Natividad, Hudson Kit P. and Calica, Gwyneth M. on January 2019
*/


public class FractionMain {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        MixedFraction operand1 = new MixedFraction();
        MixedFraction operand2 = new MixedFraction();
        int choice;
        do {
            System.out.println("Enter Fraction 1");
            System.out.println("(1)Proper/Improper Fraction");
            System.out.println("(2)Mixed Fractions");

            System.out.print("Choice: ");
            choice = keyboard.nextInt();

            switch (choice) {
                case 1:
                    operand1 = enterFraction("fraction 1");
                    System.out.println("Fraction 1: " + operand1);
                    break;
                case 2:
                    operand1 = enterMixedFraction("fraction 1");
                    System.out.println("Fraction 1: " + operand1);
                    break;
            }
        } while (choice != 1 && choice != 2);

        do {
            System.out.println("Enter Fraction 2");
            System.out.println("(1)Proper/Improper Fraction");
            System.out.println("(2)Mixed Fractions");

            System.out.print("Choice: ");
            choice = keyboard.nextInt();

            switch (choice) {
                case 1:
                    operand2 = enterFraction("fraction 2");
                    System.out.println("Fraction 2: " + operand2);
                    break;
                case 2:
                    operand2 = enterMixedFraction("fraction 2");
                    System.out.println("Fraction 2: " + operand2);
                    break;
            }
        } while (choice != 1 && choice != 2);

        do {
            System.out.println("+---------------------------------------------------+");
            System.out.println("*         What do you want to do?                   *");
            System.out.println("*            1. Enter value of Faction 1            *");
            System.out.println("*            2. Enter value of Faction 2            *");
            System.out.println("*            3. Add fractions                       *");
            System.out.println("*            4. Subtract fractions                  *");
            System.out.println("*            5. Multiply fractions                  *");
            System.out.println("*            6. Divide fractions                    *");
            System.out.println("*            7. Convert Mixed to Improper fraction *");
            System.out.println("*            8. Convert Improper to Mixed fraction *");
            System.out.println("*            9. Reduce a fraction                   *");
            System.out.println("*            10. Quit                               *");
            System.out.println("+---------------------------------------------------+");

            System.out.print("Choice: ");
            choice = keyboard.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("What fraction do you want to enter");
                    System.out.println("(A)Proper/Improper Fraction");
                    System.out.println("(B)Mixed Fractions");

                    System.out.print("Enter Choice : ");
                    String choice1 = keyboard.next();

                    if (choice1.equals("a") || choice1.equals("A")){
                        operand1 = enterFraction("fraction 1");
                        System.out.println("Fraction 1: " + operand1);
                    }if (choice1.equals("b") || choice1.equals("B")){
                    operand1 = enterMixedFraction("fraction 1");
                    System.out.println("Fraction 1: " + operand1);
                }
                    break;

                case 2:
                    System.out.println("What fraction do you want to enter");
                    System.out.println("(A)Proper/Improper Fraction");
                    System.out.println("(B)Mixed Fractions");

                    System.out.print("Enter Choice : ");
                    String choice2 = keyboard.next();

                    if (choice2.equals("a") || choice2.equals("A")){
                        operand2 = enterFraction("fraction 1");
                        System.out.print("Fraction 2: " + operand2);
                    }if (choice2.equals("b") || choice2.equals("B")){
                    operand2 = enterMixedFraction("fraction 2");
                    System.out.println("Fraction 2: " + operand2);
                }
                    break;

                case 3:
                    if (operand1.getWhole() != 0 && operand2.getWhole() == 0){
                        MixedFraction answer = operand2.add(operand1.toFraction());
                        System.out.println(operand1 + " + " + operand2);
                        System.out.println("The sum is " + answer.toMixedFraction() + " or " + answer.toFraction().toDouble());
                    } else if (operand2.getWhole() != 0 && operand1.getWhole() == 0){
                        MixedFraction answer = operand1.add(operand2.toFraction());
                        System.out.println(operand1 + " + " + operand2);
                        System.out.println("The sum is " + answer.toMixedFraction() + " or " + answer.toFraction().toDouble());
                    } else if (operand1.getWhole() != 0 && operand2.getWhole() != 0){
                        Fraction result = operand1.toFraction().add(operand2.toFraction());
                        MixedFraction answer = new MixedFraction();
                        System.out.println(operand1 + " + " + operand2);
                        System.out.println("The sum is " + answer.toMixedFraction(result) + " or " + answer.toMixedFraction(result).toDouble());
                    } else if (operand1.getWhole() == 0 && operand2.getWhole() == 0){
                        MixedFraction answer = operand1.add(operand2);
                        System.out.println(operand1 + " + " + operand2);
                        System.out.println("The sum is " + answer.toFraction() + " or " + answer.toDouble());
                    }
                    break;

                case 4:
                    if (operand1.getWhole() != 0 && operand2.getWhole() == 0){
                        MixedFraction answer = operand2.subtract(operand1.toFraction());
                        System.out.println(operand1 + " - " + operand2);
                        System.out.println("The difference is " + answer.toMixedFraction() + " or " + answer.toFraction().toDouble());
                    } else if (operand2.getWhole() != 0 && operand1.getWhole() == 0){
                        MixedFraction answer = operand1.subtract(operand2.toFraction());
                        System.out.println(operand1 + " - " + operand2);
                        System.out.println("The difference is " + answer.toMixedFraction() + " or " + answer.toFraction().toDouble());
                    } else if (operand1.getWhole() != 0 && operand2.getWhole() != 0){
                        Fraction result = operand1.toFraction().subtract(operand2.toFraction());
                        MixedFraction answer = new MixedFraction();
                        System.out.println(operand1 + " - " + operand2);
                        System.out.println("The difference is " + answer.toMixedFraction(result) + " or " + answer.toMixedFraction(result).toDouble());
                    } else if (operand1.getWhole() == 0 && operand2.getWhole() == 0){
                        MixedFraction answer = operand1.subtract(operand2);
                        System.out.println(operand1 + " - " + operand2);
                        System.out.println("The difference is " + answer.toFraction() + " or " + answer.toDouble());
                    }
                    break;

                case 5:
                    if (operand1.getWhole() != 0 && operand2.getWhole() == 0){
                        MixedFraction answer = operand2.multiplyBy(operand1.toFraction());
                        System.out.println(operand1 + " * " + operand2);
                        System.out.println("The product is " + answer.toMixedFraction() + " or " + answer.toFraction().toDouble());
                    } else if (operand2.getWhole() != 0 && operand1.getWhole() == 0){
                        MixedFraction answer = operand1.multiplyBy(operand2.toFraction());
                        System.out.println(operand1 + " * " + operand2);
                        System.out.println("The product is " + answer.toMixedFraction() + " or " + answer.toFraction().toDouble());
                    } else if (operand1.getWhole() != 0 && operand2.getWhole() != 0){
                        Fraction result = operand1.toFraction().multiplyBy(operand2.toFraction());
                        MixedFraction answer = new MixedFraction();
                        System.out.println(operand1 + " * " + operand2);
                        System.out.println("The product is " + answer.toMixedFraction(result) + " or " + answer.toMixedFraction(result).toDouble());
                    } else if (operand1.getWhole() == 0 && operand2.getWhole() == 0){
                        MixedFraction answer = operand1.multiplyBy(operand2);
                        System.out.println(operand1 + " * " + operand2);
                        System.out.println("The product is " + answer.toFraction() + " or " + answer.toDouble());
                    }
                    break;
                case 6:
                    Fraction result = operand1.toFraction();
                    Fraction result2 = operand2.toFraction();
                    MixedFraction answer = new MixedFraction();
                    System.out.println(operand1 + " / " + operand2);
                    System.out.println("The quotient is " + answer.toMixedFraction(result.divideBy(result2)) + " or " + result.divideBy(result2).toDouble());
                    break;
                case 7:
                    System.out.println("Enter Mixed Fraction");
                   MixedFraction mixfraction;
                   mixfraction = enterMixedFraction("fraction");
                    System.out.println("Converted mixed fraction to improper fraction: " + mixfraction.toFraction());
                    break;

                case 8:
                    System.out.println("Enter Improper Fraction");
                    MixedFraction impfraction;
                    impfraction = enterFraction("fraction");
                    System.out.println("Converted improper fraction to mixed fraction: " + impfraction.toMixedFraction());
                    break;

                case 9:
                    System.out.println("Which of which?");
                    System.out.println("(A) Enter Fraction to be reduced");
                    System.out.println("(B) Fraction 1");
                    System.out.println("(C) Fraction 2");

                    System.out.print("Enter Choice : ");
                    String choice5 = keyboard.next();

                    if (choice5.equals("a") || choice5.equals("A")){
                        MixedFraction newFraction;
                        newFraction = enterFraction("new Fraction");
                        newFraction.reduce();
                        System.out.println("Reduced fraction = " + newFraction);
                    }if (choice5.equals("b") || choice5.equals("B")){
                        MixedFraction reducedFraction;
                        reducedFraction = new MixedFraction(operand1);
                        reducedFraction.reduce();
                        MixedFraction newfraction = new MixedFraction(operand1.getWhole(),reducedFraction);
                        System.out.println(operand1);
                        System.out.println("Reduced Fraction: " + newfraction);
                } if (choice5.equals("c") || choice5.equals("C")){
                        MixedFraction reducedFraction;
                        reducedFraction = new MixedFraction(operand2);
                        reducedFraction.reduce();
                        MixedFraction newfraction = new MixedFraction(operand2.getWhole(),reducedFraction);
                        System.out.println(operand2);
                        System.out.println("Reduced Fraction: " + newfraction);
                }
                    break;

                case 10:
                    System.out.println("Thank you for using this program.");
                    System.exit(0);
            }
        } while (choice <10);

    }


    private static MixedFraction enterMixedFraction(String operand) {
        MixedFraction fraction = null ;
        int whole , numerator = 0, denominator;

        try{
            whole = enterFractionData("whole number", operand);
            numerator = enterFractionData("numerator", operand);
            denominator = enterFractionData("denominator", operand);
            if(whole != 0){
                fraction = new MixedFraction(numerator, denominator, whole);
            } else if(numerator == 0) {
                fraction = new MixedFraction(0, denominator, whole);
            } else {
                fraction = new MixedFraction(numerator, denominator, 0);
            }
        }catch(NoWholeException noWhole){
            fraction = new MixedFraction(0, 1,0);
        }catch(NoNumeratorException noNumerator){
            fraction = new MixedFraction();
        }catch(NoDenominatorException noDenominator){
            fraction = new MixedFraction(numerator, 1,0);
        }finally{
            return fraction;
        }

    }

    private static MixedFraction enterFraction(String operand) {
        MixedFraction fraction = null;
        int whole = 0 , numerator = 0, denominator;

        try {
            numerator = enterFractionData("numerator", operand);
            denominator = enterFractionData("denominator", operand);
            fraction = new MixedFraction(numerator, denominator, whole);
        } catch (NoNumeratorException noNumerator) {
            fraction = new MixedFraction();
        } catch (NoDenominatorException noDenominator) {
            fraction = new MixedFraction(numerator, 1, 0);
        } finally {
            return fraction;
        }
    }


    private static int enterFractionData(String part, String fractionInfo) {
        Scanner keyboard = new Scanner(System.in);
        int input;
        try {
            System.out.print("Enter " + part + " of " + fractionInfo + ": ");
            input = Integer.parseInt(keyboard.nextLine());
            if (part.equalsIgnoreCase("denominator") && input == 0) {
                input = enterFractionData(part, fractionInfo);
            }
            return input;
        } catch (Exception exc) {
            if (part.equalsIgnoreCase("numerator")) {
                throw new NoNumeratorException();
            } else if (part.equalsIgnoreCase("whole number")) {
                throw new NoWholeException();
            } else {
                throw new NoDenominatorException();
            }
        }
    }

}


