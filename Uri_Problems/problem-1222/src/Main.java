import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);



        while(scan.hasNextLine()){
            int wordsNum = scan.nextInt();
            int maxLines = scan.nextInt();
            int maxChar = scan.nextInt();
            scan.nextLine();
            String line = scan.nextLine();
            char[] chars = line.toCharArray();

            int charCounter = 0;
            int wordCounter = 0;
            int lineCounter = 1;
            int pageCounter = 1;
            for (int i = 0; i<chars.length;i++){
            }

            Scanner wordScan = new Scanner(line);

            while(wordScan.hasNext()){
                String nextWord = wordScan.next();
                if((charCounter+nextWord.length())<=maxChar){
                    charCounter+=nextWord.length();
                }

                else{
                    lineCounter++;
                    charCounter = nextWord.length();
                }
                if (charCounter+1<=maxChar){
                    charCounter++;
                }

            }
            pageCounter = (lineCounter/maxLines);

            if (lineCounter%maxLines!=0){
                pageCounter++;
            }

            System.out.println(pageCounter);
        }



    }
}
