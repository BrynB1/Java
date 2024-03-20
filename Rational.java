package Sophmore;

public class Rational {
    int numerator, denominator;
    public static void main(String[] args) {
        Rational test = new Rational(0, 0);
        reset(test);
        printRational(test);
        reset(test);
        negate(test);
        printRational(test);
        reset(test);
        invert(test);
        printRational(test);
        reset(test);
        double doubleValue = toDouble(test);
        System.out.println(doubleValue);
        reset(test);
        reduce(test);
    }
    public Rational(int n, int d) {
        this.numerator = n;
        this.denominator = d;
    }
    public static void reset(Rational test) {
        test.numerator = 10;
        test.denominator = 20;
    }
    public static void printRational(Rational tPrint) {
        System.out.println(tPrint.numerator +  "/"  + tPrint.denominator);
    }
    public static void negate(Rational test) {
        test.numerator = test.numerator * -1;
        if(test.denominator <= 0) {
            test.numerator = test.numerator * -1;
            test.denominator = test.denominator * -1;
        }
    }
    public static void invert(Rational test) {
        int tempN = test.numerator;

        test.numerator = test.denominator;
        test.denominator = tempN;
    }


    public static double toDouble(Rational test) {
        return (double)test.numerator / (double)test.denominator;
    }
    public static void reduce(Rational test) {
        int remain, num1, num2;
        num1 = test.numerator;
        num2 = test.denominator;
        remain = num1 % num2;
        while(remain != 0) {
            remain = num1 % num2 ;
            num1 = num2;
            num2 = remain;
        }
        int GCD = num1;
        Rational ret = new Rational(test.numerator/GCD, test.denominator/GCD);
        printRational(ret);
    }
}