import java.util.*;

public class Main { //Letter range
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (scan.hasNextLine()) {
            String line = scan.nextLine();
            String result = "";

            char[] curLine = line.toCharArray();
            int[] letters = new int[26];

            for (int i = 0; i < letters.length; i++) {
                letters[i] = 0;
            }

            for (int i = 0; i < curLine.length; i++) {
                if (Character.isLowerCase(curLine[i])) {
                    letters[curLine[i] - 97]++;
                }
            }

            int startIndex = 0;
            int endIndex = -1;

            for (int i = 0; i < letters.length; i++) {
                if (letters[i] > 0) {
                    endIndex++;
                } else {
                    if (endIndex >= startIndex) {
                        result += ((char) (startIndex + 97) + ":" + (char) (endIndex + 97) + ", ");
                    }

                    startIndex = i + 1;
                    endIndex = i;
                }
            }
            if (startIndex < 26)
                result += ((char) (startIndex + 97) + ":" + (char) (endIndex + 97));

            else if(!result.isEmpty())
                result = result.substring(0, result.length() - 2);

            System.out.println(result);

        }
    }
}
