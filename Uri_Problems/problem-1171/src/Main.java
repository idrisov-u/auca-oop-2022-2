import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int [] arr = new int[10001];
        for( int i=0; i<arr.length;i++){
            arr[i] = 0;
        }

        int cases = scan.nextInt();
        for (int i=0; i<cases; i++){
            int num = scan.nextInt();
            arr[num]++;
        }
        for (int i=0;i<arr.length;i++){
            if (arr[i]>0){
                System.out.println(i+" aparece "+arr[i]+" vez(es)");
            }
        }
    }
}
