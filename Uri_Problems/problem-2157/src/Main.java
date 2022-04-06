import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int cases = scan.nextInt();
        for (int i = 0; i < cases; i++) {
            int begin = scan.nextInt();
            int end = scan.nextInt();
            String result = "";

            for (int j = begin; j <= end; j++) {
                result += j + "";
            }
            result += reverse(result);
            System.out.println(result);
        }
    }

    static String reverse(String str) {
        //char [] arr = str.toCharArray();
        String result = "";
        for (int j = str.length() - 1; j >= 0; j--) {
            result += str.charAt(j);
        }
        return result;
    }

}