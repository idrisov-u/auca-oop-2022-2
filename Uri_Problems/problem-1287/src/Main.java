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
            String errorMessage = "";

            try{
                result = Integer.parseInt(line);
            }catch (RuntimeException r){

                errorMessage = "error";
            }

            if(result<0){
                errorMessage = "error";
            }
            else if(result>2147483647)
                errorMessage = "error";
            System.out.println(errorMessage.equals("error")?errorMessage:result);
        }


    }
}