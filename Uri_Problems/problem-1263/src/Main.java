import java.util.*;
public class Main { //Alliteration
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int result = 0;

        while (scan.hasNextLine()){
            String line = scan.nextLine();
            Scanner wordScan = new Scanner(line);


            int [] chars = new int[100];

            for (int i=0;i<chars.length;i++){
                chars[i] = 0;
            }
            int i =-1;
            char prev = '.';


            while(wordScan.hasNext()){
                String nextWord  = wordScan.next();
                char first = Character.toLowerCase(nextWord.charAt(0));
                if (prev == first){
                    chars[i]++;
                }
                else
                    i++;
                prev = first;
            }
            for(int j=0;j<chars.length;j++){
                if(chars[j]>0)
                    result++;
            }

            System.out.println(result);
            result = 0;
        }
    }
}
