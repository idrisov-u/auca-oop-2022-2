import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while(scan.hasNextInt()) {
            int num = scan.nextInt();
            int middle = num / 2;
            int beginIndex = middle;
            int endIndex = middle;

            char[] arr = new char[num];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = ' ';
            }

            for (int i = 0; i < arr.length; i += 2) {
                beginIndex = middle - i / 2;
                endIndex = middle + i / 2;
                for (int j = beginIndex; j <= endIndex && j < arr.length; j++) {
                    arr[j] = '*';
                }
                for (int j = 0; j < arr.length; j++) {
                    System.out.print(arr[j]);
                }
                System.out.println();
            }
            for (int i = 0; i < arr.length; i++) {
                arr[i] = ' ';
            }
            arr[middle] = '*';
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i]);
            }
            System.out.println();
            arr[middle - 1] = '*';
            arr[middle + 1] = '*';
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i]);
            }
            System.out.println();
        }
    }
}