import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while(scan.hasNextLine()){

            String line = scan.nextLine();
            line  = line.replaceAll("o","0");
            line = line.replaceAll(",","");
            line = line.replaceAll("O","0");
            line = line.replaceAll(" ","");
            line = line.replaceAll("l","1");

            int result = 0;
            String display = "";

            try{
                result = Integer.parseInt(line);
            }catch (RuntimeException r){

                display = "error";
            }

            if(result<0){
                display = "error";
            }
            else if(result>2147483647)
                display = "error";
            System.out.println(display.equals("error")?display:result);
        }


    }
}