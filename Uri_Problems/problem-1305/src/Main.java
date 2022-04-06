import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (scan.hasNextLine()) {
            int whole = 0;
            String line = scan.nextLine();
            line = line.trim();
            String wholePart = "";
            String decimal1 = "";
            int indexOfDot = line.indexOf('.');
            if(indexOfDot!=-1 && indexOfDot!=line.length()-1) {
                wholePart= line.substring(0, indexOfDot);
                decimal1= line.substring(indexOfDot);
            }
            else{
                decimal1 = "0.0";
            }

            if(indexOfDot == line.length()-1){
                wholePart = line.substring(0,indexOfDot);

            }
            if(indexOfDot ==-1){
                whole = Integer.parseInt(line);
            }

            else if(indexOfDot!=0){
                whole = Integer.parseInt(wholePart);
            }
            double d1 = Double.parseDouble(decimal1);

            String decimal2 = scan.nextLine();
            double d2 = Double.parseDouble(decimal2);

            if( d1>=d2){
                whole++;
            }
            System.out.println(whole);
        }

    }
}
