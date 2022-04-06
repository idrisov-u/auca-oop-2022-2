import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int cases = scan.nextInt();
        scan.nextLine();
        for(int i=0;i<cases;i++){
            int number = scan.nextInt();
            scan.nextLine();
            String line = scan.nextLine();
            Scanner nameScanner = new Scanner(line);
            String[] students = new String[number];

            String result = "";

            for(int j=0;j<number;j++){
                students[j] = nameScanner.next();
            }

            line = scan.nextLine();
            nameScanner = new Scanner(line);
            String[] records = new String[number];

            for (int j=0;j<number;j++){
                records[j] = nameScanner.next();
            }
            double[] attendance = new double[number];

            for (int j=0; j<number;j++){
                attendance[j] = getAttendance(records[j]);
                if(attendance[j]<75.0){
                    result+=students[j]+" ";
                }
                //System.out.print(attendance[j]+"% ");
            }
            if(!result.equals("")){
                result = result.substring(0,result.length()-1);
            }

            System.out.println(result);

        }
    }
    static double getAttendance(String record){
        char[] arr = record.toCharArray();
        int total = arr.length;
        int present = 0;
        for (int i=0;i<arr.length;i++){
            if (arr[i] =='P')
                present++;
            else if(arr[i]=='M')
                total--;
        }
        double result = ((double) present)/((double) total)*100;
        return result;
    }
}
