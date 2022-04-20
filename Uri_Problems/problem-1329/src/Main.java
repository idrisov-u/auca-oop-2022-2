import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        while (n!=0){
            scan.nextLine();
            String line = scan.nextLine();
            Scanner lineScan = new Scanner(line);
            int mary = 0;
            int john = 0;

            while (lineScan.hasNextInt()){
                int cur = lineScan.nextInt();
                if(cur ==0)
                    mary++;
                else if(cur == 1){
                    john++;
                }
            }
            System.out.printf("Mary won %d times and John won %d times%n",mary,john);
            n = scan.nextInt();
        }
    }
}
