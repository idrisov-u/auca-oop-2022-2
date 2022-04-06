import java.lang.reflect.Array;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<String> list= new ArrayList<String>();

        while(scan.hasNextLine()){
            String line = scan.nextLine();
            list.add(line);
        }
        Collections.sort(list, String.CASE_INSENSITIVE_ORDER);
        System.out.println(list.get(list.size()-1));


    }
}