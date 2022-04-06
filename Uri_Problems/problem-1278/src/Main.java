import java.util.*;
public class Main {//Justifier 2

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numLines = 1;

        while(numLines!=0){
            numLines = scan.nextInt();
            scan.nextLine();
            if (numLines!=0){
                String[] str = new String[numLines];
                int max = 0;
                for (int i=0;i<numLines;i++){
                    String line = scan.nextLine();
                    Scanner lineScan = new Scanner(line);
                    String curLine = "";

                    while (lineScan.hasNext()){
                        String nextWord = lineScan.next();
                        curLine += nextWord+" ";
                    }
                    if(curLine.charAt(curLine.length()-1) == ' ') {
                        curLine = curLine.substring(0, curLine.length() - 1);
                    }

                    str[i] = curLine;
                }
                for(int i=0;i< str.length;i++){
                    if (max< str[i].length())
                        max = str[i].length();
                }
                for (int i=0;i<str.length;i++){
                    System.out.println(justifyRight(str[i],max));
                }

                System.out.println();
            }
        }
    }
    static String justifyRight(String str, int n){
        String result = "";
        for (int i=0; i<(n-str.length()); i++){
            result += " ";
        }
        result += str;
        return result;
    }
}
