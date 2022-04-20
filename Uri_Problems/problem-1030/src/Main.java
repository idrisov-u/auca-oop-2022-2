import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int cases = scan.nextInt();
        for (int i=0;i<cases;i++){
            int n = scan.nextInt();
            int k = scan.nextInt();

            boolean[] alive = new boolean[n+1];
            alive[0] = false;

            for(int j=1;j<alive.length;j++){
                alive[j] = true;
            }
            int j = 0;
            int count = 0;
            int dead = 0;
            while (dead<n-1){
                while(count<k){
                    j = (j+1)%(n+1);
                    if(alive[j]){
                        count++;
                    }
                }
                alive[j] = false;
                dead++;
                count = 0;
            }
            int result = 0;
            for(int a=1;a< alive.length;a++){
                if(alive[a]){
                    result = a;
                }
            }
            System.out.printf("Case %d: %d%n",i+1,result);
        }
    }
}
