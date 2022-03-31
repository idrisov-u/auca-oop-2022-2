import java.util.*;

public class Problem02 {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (true) {
            try {
                System.out.print("Enter 1st BigRational: ");
                String line = scan.nextLine();
                BigRational r1 = BigRational.parse(line); //reading the first rational

                System.out.print("Enter 2nd rational: ");
                line = scan.nextLine();
                BigRational r2 = BigRational.parse(line); //reading the second rational

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

    static String operatorReader(BigRational r1, String oper, BigRational r2) {
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
                if(r1.compareTo(r2)==0)
                    result = r1.toString()+ " is equal to "+r2.toString()+": true";
                else
                    result = r1.toString()+ " is equal to "+r2.toString()+": false";
                break;

            case "!=":
                if(r1.compareTo(r2)!=0)
                    result = r1.toString()+ " is not equal to "+r2.toString()+": true";
                else
                    result = r1.toString()+ " is not equal to "+r2.toString()+": false";
                break;
            case ">":
                if(r1.compareTo(r2)>0)
                    result = r1.toString()+ " is greater than "+r2.toString()+": true";
                else
                    result = r1.toString()+ " is greater than "+r2.toString()+": false";
                break;
            case "<":
                if(r1.compareTo(r2)<0)
                    result = r1.toString()+ " is smaller than "+r2.toString()+": true";
                else
                    result = r1.toString()+ " is smaller than  "+r2.toString()+": false";
                break;
            case "<=":
                if(r1.compareTo(r2)<=0)
                    result = r1.toString()+ " is smaller than or equal to "+r2.toString()+": true";
                else
                    result = r1.toString()+ " is smaller than or equal to "+r2.toString()+": false";
                break;
            case ">=":
                if(r1.compareTo(r2)>=0)
                    result = r1.toString()+ " is greater than or equal to "+r2.toString()+": true";
                else
                    result = r1.toString()+ " is greater than or equal to "+r2.toString()+": false";
                break;
            default:
                result = oper+ "is an incorrect operator.";
        }
        return result;
    }
}
