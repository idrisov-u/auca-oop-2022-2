import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String line = scan.nextLine();
        String biggestWord = "";
        int maxLength = 0;

        while(!line.equals("0")){

            Scanner lineScanner = new Scanner(line);
            String display = "";
            while(lineScanner.hasNext()){
                String nextWord = lineScanner.next();
                display += nextWord.length()+"-";
                if(nextWord.length()>=maxLength){
                    maxLength = nextWord.length();
                    biggestWord = nextWord;
                }
            }
            display = display.substring(0,display.length()-1);
            System.out.println(display);
            line = scan.nextLine();
        }
        System.out.println("\nThe biggest word: "+biggestWord);



    }
}