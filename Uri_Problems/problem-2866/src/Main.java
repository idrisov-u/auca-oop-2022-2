import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int cases = scan.nextInt();
        scan.nextLine();
        for(int i=0;i<cases;i++){
            StringBuilder line = new StringBuilder(scan.nextLine());
            StringBuilder result = new StringBuilder( "");
            StringBuilder temp = new StringBuilder("");
            for(int j =0;j<line.length();j++){
                if(Character.isLowerCase(line.charAt(j))){
                    temp.append( line.charAt(j));
                }
            }
            temp = temp.reverse();
            System.out.println(result);
        }


    }
}