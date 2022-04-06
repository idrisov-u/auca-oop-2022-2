import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int cases = scan.nextInt();

        while(cases!=0){
            scan.nextLine();
            String []  identifier = new String[cases];
            int[] time = new int[cases];
            String[] judgement = new String[cases];
            int correctCounter = 0;
            int timeCounter = 0;

            for(int i=0;i<cases;i++){
                String line = scan.nextLine();
                Scanner lineScan = new Scanner(line);
                identifier[i] = lineScan.next().trim();
                time[i] = Integer.parseInt(lineScan.next().trim());
                judgement[i] = lineScan.next().trim();
            }
            for(int i =0;i<cases;i++){
                if(judgement[i].equals("correct")){
                    correctCounter++;
                    timeCounter += time[i];
                    for(int j=i-1;j>=0;j--){
                        if(identifier[j].equals(identifier[i]) && judgement[j].equals("incorrect")){
                            timeCounter += 20;
                            //j = -1;
                        }
                    }
                }

            }
            System.out.println(correctCounter+" "+timeCounter);

            cases = scan.nextInt();

        }
    }
}
