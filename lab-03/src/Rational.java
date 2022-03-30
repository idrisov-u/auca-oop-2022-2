public class Rational {
    //static Scanner scan = new Scanner(System.in);
    private int num;
    private int den;

    public Rational(int num, int den) {
        if (den == 0) {
            throw new RuntimeException("Incorrect rational: denom can't be zero");
        }
        if (den < 0) {
            num = -num;
            den = -den;
        }

        this.den = den / gcd(num, den);
        this.num = num / gcd(num, den);

    }

    public String toString() {
        if (num == 0) {
            return ("0");
        } else if (den == 1)
            return ("" + num);
        else
            return (num + "/" + den);
    }

    public Rational add(Rational other) {
        int rNum = num * other.den + den * other.num;
        int rDen = den * other.den;

        return new Rational(rNum, rDen);
    }

    public Rational subtract(Rational other) {
        int rNum = num * other.den - den * other.num;
        int rDen = den * other.den;
        return new Rational(rNum, rDen);
    }

    public Rational multiply(Rational other) {
        int rNum = num * other.num;
        int rDen = den * other.den;
        return new Rational(rNum, rDen);
    }

    public Rational divide(Rational other) {
        if (other.num == 0) {
            throw new RuntimeException("calc01.Rational:Division by 0");
        }
        int rNum = num * other.den;
        int rDen = den * other.num;

        return new Rational(rNum, rDen);
    }

    public int compareTo(Rational other) {
        int a = num * other.den;
        int b = other.num * den;

        if (a > b)
            return 1;
        else if (a == b)
            return 0;
        else
            return -1;
    }

    static Rational parse(String str) {
        str = str.trim();
        //Scanner wordScan = new Scanner(str);
        int num = 0;
        int den = 0;
        int slashIndex = str.indexOf('/');
        if (slashIndex == -1) {
            num = Integer.parseInt(str);
            den = 1;
        } else {
            String n = str.substring(0, slashIndex);
            String d = str.substring(slashIndex+1);
            num = Integer.parseInt(n);
            den = Integer.parseInt(d);

        }
        Rational r = new Rational(num, den);
        return r;

    }


    static int gcd(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);

        while (b != 0) {
            int rem = a % b;
            a = b;
            b = rem;
        }
        return a;
    }


}
