import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (scan.hasNextLine()) {
            String line = scan.nextLine();
            Scanner wordScan = new Scanner(line);
            int totalSymbols = 0;
            int totalWords = 0;
            int average = 0;
            int result = 0;

            while (wordScan.hasNext()) {
                String nextWord = wordScan.next();
                if (isWord(nextWord)) {
                    nextWord = nextWord.replace(".","");
                    //String nextWord = wordScan.next();
                    totalSymbols += nextWord.length();
                    totalWords++;
                    //System.out.print(nextWord.length()+" ");
                }
                //else
                //System.out.print("not ");
            }
            //System.out.println(totalWords+" " + totalSymbols);

            if(totalWords !=0)
                average = totalSymbols / totalWords;

            //System.out.print(" "+average+" ");


            if (average <= 3) {
                result = 250;

            } else if (average == 4 || average == 5)
                result = 500;
            else if (average >= 6)
                result = 1000;

            System.out.println(result);


        }
    }

    static boolean isWord(String str) {
        boolean result= true;
        char[] arr = str.toCharArray();
        for (int i = 0; i < arr.length - 1 && result; i++) {
            if (Character.isLetter(arr[i])) {
                result = true;
            }
            else
                result = false;
        }
        if (result) {
            if (Character.isLetter(arr[arr.length - 1])){
                result = true;
            }
            else if(arr[arr.length-1]=='.' && arr.length>1)
                result = true;
            else
                result =false;
        }
        return result;
    }
}
