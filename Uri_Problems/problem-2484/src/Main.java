import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        while(scan.hasNext()){
            String word = scan.nextLine();
            char[] arr = word.toCharArray();


            for(int i=arr.length;i>0;i--){
                String result = "";
                for (int j=0; j<(word.length() - i);j++){
                    result+=" ";
                }
                for(int j=0; j<i;j++){
                    result+=arr[j]+" ";
                }
                result = result.substring(0,result.length()-1);
                System.out.println(result);
            }
            System.out.println();
        }
    }
}
