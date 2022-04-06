import java.util.*;
public class Problem02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String line = scan.nextLine();

        Scanner lineScan = new Scanner(line);
        ArrayList <Integer> list = new ArrayList<Integer>();

        while(lineScan.hasNextInt()){
            list.add(lineScan.nextInt());
        }
        System.out.println("After insertions: ");
        list = insertZeros(list);
        String result = "[";

        for (int i=0;i<list.size()-1;i++){
            result+=(list.get(i)+",");
        }
        result+=list.get(list.size()-1)+"]";
        System.out.println(result);

        System.out.println("\nAfter deletions: ");
        list = removeOdds(list);
        result = "[";

        for(int i=0;i<list.size()-1;i++){
            result+=(list.get(i)+",");
        }
        result+=list.get(list.size()-1)+"]";
        System.out.println(result);

    }

    private static ArrayList<Integer> removeOdds(ArrayList<Integer> list) {
        for(int i=0; i<list.size();i++){
            if(list.get(i)%2!=0){
                list.remove(i);
                i--;
            }
        }
        return list;
    }

    private static ArrayList<Integer> insertZeros(ArrayList<Integer> list) {
        int size =list.size();
        for(int i=0;i<size;i++){
            if(list.get(i)!=0 && list.get(i)%2==0){
                list.add(i,0);
                i++;
                size++;
            }
        }
        return list;
    }
}
