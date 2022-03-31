import java.math.BigInteger;

public class BigRational {
    //static Scanner scan = new Scanner(System.in);
    private BigInteger num;
    private BigInteger den;

    public BigRational(BigInteger num, BigInteger den) {
        if (den.compareTo(BigInteger.valueOf(0))==0) {
            throw new RuntimeException("Incorrect rational: denom can't be zero");
        }
        if (den.compareTo(BigInteger.valueOf(0))<0) {
            num = num.multiply(BigInteger.valueOf(-1));
            den = den.multiply(BigInteger.valueOf(-1));
        }

        this.den = den.divide(num.gcd(den));
        this.num = num.divide(num.gcd(den));

    }

    public String toString() {
        if (num.equals(BigInteger.valueOf(0))) {
            return ("0");
        } else if (den.equals(BigInteger.valueOf(1)))
            return ("" + num);
        else
            return (num + "/" + den);
    }

    public BigRational add(BigRational other) {
        BigInteger rNum = (num.multiply( other.den)).add(den.multiply( other.num));
        BigInteger rDen = den.multiply( other.den);

        return new BigRational(rNum, rDen);
    }

    public BigRational subtract(BigRational other) {
        BigInteger rNum = (num.multiply( other.den)).subtract(den.multiply( other.num));
        BigInteger rDen = den.multiply( other.den);
        return new BigRational(rNum, rDen);
    }

    public BigRational multiply(BigRational other) {
        BigInteger rNum = num.multiply( other.num);
        BigInteger rDen = den.multiply( other.den);
        return new BigRational(rNum, rDen);
    }

    public BigRational divide(BigRational other) {
        if ((other.num).equals(BigInteger.valueOf(0))) {
            throw new RuntimeException("Incorrect Operation:Division by 0");
        }
        BigInteger rNum = num.multiply( other.den);
        BigInteger rDen = den.multiply(other.num);

        return new BigRational(rNum, rDen);
    }

    public int compareTo(BigRational other) {
        BigInteger a = num.multiply(other.den);
        BigInteger b = other.num.multiply(den);

        if (a.compareTo(b)==1)
            return 1;
        else if (a.equals(b))
            return 0;
        else
            return -1;
    }

    static BigRational parse(String str) {
        str = str.trim();

        BigInteger num;
        BigInteger den;
        int slashIndex = str.indexOf('/');
        if (slashIndex == -1) {
            num = new BigInteger(str);
            den = new BigInteger("1");
        } else {
            String n = str.substring(0, slashIndex);
            String d = str.substring(slashIndex+1);
            num = new BigInteger(n);
            den = new BigInteger(d);
        }
        BigRational r = new BigRational(num, den);
        return r;

    }

}
