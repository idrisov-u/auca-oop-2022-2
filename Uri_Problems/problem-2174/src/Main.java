import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int total = scan.nextInt();
        //scan.nextLine();
        for (int i = 0; i < total; i++) {
            String[] collection = new String[total];

            boolean[] checked = new boolean[total];
            for (int a = 0; a < collection.length; a++) {
                checked[a] = false;
            }

            int left = 151 - total;

            for (int a = 0; a < collection.length && scan.hasNext(); a++) {
                collection[a] = scan.next();
            }
            for (int a = 0; a < collection.length - 1; a++) {
                if (!checked[a]) {
                    for (int b = a + 1; b < collection.length; b++) {
                        if (collection[a].equals(collection[b])) {

                            left++;
                            checked[a] = true;
                            checked[b] = true;
                        }

                    }
                }
            }
            System.out.printf("Falta(m) %d pokemon(s)%n", left);


        }


    }
}