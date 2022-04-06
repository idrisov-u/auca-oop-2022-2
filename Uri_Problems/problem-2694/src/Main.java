import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int cases = scan.nextInt();
        scan.nextLine();

        for(int i=0;i<cases;i++){
            String line = scan.nextLine();
            line = line.replaceAll("[^\\d]"," ");
            //System.out.println(line);
            Scanner lineScan = new Scanner(line);
            int sum = 0;
            for(int j=0;j<3;j++){
                sum += lineScan.nextInt();
            }
            System.out.println(sum);
        }


    }
}