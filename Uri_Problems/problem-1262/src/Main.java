import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while(scan.hasNextLine()){
            String line = scan.nextLine();
            int maxR = scan.nextInt();
            scan.nextLine();
            int rCounter  =0;
            int result = 0;

            char[] arr = line.toCharArray();
            for (int i=0;i<arr.length;i++){
                if(arr[i]=='R'){
                    rCounter++;
                }
                else {
                    result+=rCounter/maxR;

                    if(rCounter%maxR!=0)
                        result++;
                    rCounter = 0;
                    result++;
                }
            }
            result+=rCounter/maxR;
            if(rCounter%maxR!=0)
                result++;

            System.out.println(result);

        }
    }
}
