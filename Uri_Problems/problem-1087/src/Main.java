import java.util.*;

public class Main {//Queen

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x1 = 1, x2 = 1, y1 = 1, y2 = 1;
        String line = "";
        while (!line.equals("0 0 0 0")){
            line = scan.nextLine();
            if (!line.equals("0 0 0 0")) {
                Scanner lineScan = new Scanner(line);

                while (lineScan.hasNextInt()) {
                    x1 = lineScan.nextInt();
                    y1 = lineScan.nextInt();
                    x2 = lineScan.nextInt();
                    y2 = lineScan.nextInt();
                }
                int result = 0;

                if (x1 == x2 && y1 == y2) {
                    result = 0;
                } else if (x1 == x2 || y1 == y2) {
                    result = 1;
                } else if (Math.abs(x2 - x1) == Math.abs(y2 - y1)) {
                    result = 1;
                } else
                    result = 2;
                System.out.println(result);
            }
        }
    }

}
