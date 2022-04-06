import java.util.*;

public class ArrayListInt {
    //Scanner scan = new Scanner(System.in);
    //private ArrayList<Integer> list;
    private int[] data;


    public ArrayListInt() {
        data = new int[0];
        //size = data.length;
    }

    public ArrayListInt(int[] arr) {
        data = arr;
    }


    public int size() {
        return data.length;
    }

    public int get(int i) {
        if (data.length > i)
            return data[i];
        else
            throw new RuntimeException("There is no element in given location.");
    }

    public void set(int i, int v) {
        if (data.length > i)
            data[i] = v;
        else
            throw new RuntimeException("The list does not have " + i + " index");
    }

    public void add(int e) {
        int[] newData = new int[data.length + 1];
        for (int i = 0; i < newData.length - 1; i++) {
            newData[i] = data[i];
        }
        newData[newData.length - 1] = e;

        data = newData;
    }

    public void add(int i, int e) {
        int[] newData = new int[data.length + 1];
        for (int j = 0; j < i; j++) {
            newData[j] = data[j];
        }
        newData[i] = e;
        for (int j = i + 1; j < newData.length; j++) {
            newData[j] = data[j - 1];
        }
        data = newData;
    }

    public void remove(int i) {
        int[] newData = new int[data.length - 1];
        for (int j = 0; j < i; j++) {
            newData[j] = data[j];
        }
        for (int j = i; j < newData.length; j++) {
            newData[j] = data[j + 1];
        }
        data = newData;
    }

    public String toString() {
        StringBuilder result = new StringBuilder("[");
        for (int i = 0; i < data.length; i++) {
            if (i != 0) {
                result.append(",");
            }
            result.append(data[i]);
        }
        result.append("]");
        return result.toString();
    }

    public static ArrayListInt parse(String line) {
        Scanner lineScan = new Scanner(line);
        int counter = 0;
        while (lineScan.hasNextInt()) {
            counter++;
            lineScan.nextInt();
        }
        int[] arr = new int[counter];
        lineScan = new Scanner(line);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = lineScan.nextInt();
        }
        return new ArrayListInt(arr);
    }

    public void reverse() {
        int[] newData = new int[data.length];
        int i = 0;

        while (i< newData.length) {
            newData[i] = data[data.length-1-i];
            i++;
        }
        data = newData;
    }
    public void insertZeros(){
        int j = data.length;
        for(int i=0;i<j;i++){
            if(data[i]%2 == 0){
                this.add(i,0);
                i++;
                j++;
            }
        }
    }
    public void removeOdds(){
        int j =data.length;
        for(int i=0; i<j;i++){
            if(data[i]%2!=0){
                this.remove(i);
                i--;
                j--;
            }
        }

    }
}
