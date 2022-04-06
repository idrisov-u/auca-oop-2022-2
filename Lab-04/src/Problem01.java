import java.util.*;
public class Problem01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String line = scan.nextLine();
        Scanner lineScan = new Scanner(line);

        ArrayList<Integer> list = new ArrayList<Integer>();

        while(lineScan.hasNextInt()){
            int num = lineScan.nextInt();
            list.add(num);
        }
        System.out.println("Before reversing: ");
        String result = "[";
        for(int i=0; i<list.size()-1;i++){
            result+=list.get(i)+",";
        }
        result+= list.get(list.size()-1)+"]";
        System.out.println(result);
        System.out.println("\nAfter reversing: ");
        list = reverse(list);
        result = "[";

        for(int i=0;i<list.size()-1;i++){
            result += (list.get(i)+",");
        }
        result+= list.get(list.size()-1)+"]";
        System.out.println(result);
    }

    private static ArrayList<Integer> reverse(ArrayList<Integer> list) {
        ArrayList <Integer> result = new ArrayList<Integer>();

        for(int i=list.size()-1; i>=0;i--){
            result.add(list.get(i));
        }
        return result;
    }
}
