import java.util.*;

public class Problem01 {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (true) {
            try {
                System.out.print("Enter 1st rational: ");
                String line = scan.nextLine();
                Rational r1 = Rational.parse(line); //reading the first rational

                System.out.print("Enter 2nd rational: ");
                line = scan.nextLine();
                Rational r2 = Rational.parse(line); //reading the second rational

                System.out.print("Enter operator: ");
                String operator = scan.nextLine();
                operator = operator.trim();
                String display = operatorReader(r1, operator, r2); //reading the operator

                if (operator.equals("+") || operator.equals("-") ||
                        operator.equals("*") || operator.equals("/")) {
                    System.out.println(r1.toString() + " " + operator + " " + r2.toString() + " = " + display);
                }
                else
                    System.out.println(display); //Printing the result

            } catch (RuntimeException r) {


                System.out.println(r.getMessage());

            }
            System.out.println();
        }
    }

    static String operatorReader(Rational r1, String oper, Rational r2) {
        String result = "";
        oper = oper.trim();
        switch (oper) {
            case "+":
                result = (r1.add(r2)).toString();
                break;
            case "-":
                result = (r1.subtract(r2)).toString();
                break;
            case "*":
                result = (r1.multiply(r2)).toString();
                break;
            case "/":
                result = r1.divide(r2).toString();
                break;
            case "=":
            case "!=":
            case ">":
            case "<":
            case "<=":
            case ">=":
                if (r1.compareTo(r2) > 0)
                    result = (r1.toString() + " is greater than " + r2.toString());
                else if (r1.compareTo(r2) < 0)
                    result = (r1.toString() + " is less than " + r2.toString());
                else if (r1.compareTo(r2) == 1) {
                    result = (r1.toString() + " is equal to " + r2.toString());
                }
                break;
            default:
                result = "Incorrect operator. Try another one.";
        }
        return result;
    }
}
