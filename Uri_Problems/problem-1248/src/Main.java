import java.util.*;
public class Main { //diet plan
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int cases = scan.nextInt();
        scan.nextLine();

        for(int i=0;i<cases;i++){
            String diet = scan.nextLine();
            String breakfast = scan.nextLine();
            String lunch = scan.nextLine();
            String dinner = "";

            char[] meal1 = breakfast.toCharArray();
            char[] meal2 = lunch.toCharArray();

            for (int j=0;j<meal1.length;j++){
                if (diet.indexOf(meal1[j])!=-1){
                    diet = diet.replace(meal1[j],'.');
                }
                else
                    dinner = "CHEATER";
            }
            for (int j=0;j<meal2.length;j++){
                if (diet.indexOf(meal2[j])!=-1){
                    diet = diet.replace(meal2[j],'.');
                }
                else
                    dinner = "CHEATER";
            }

            if (!dinner.equals("CHEATER")){
                char[] remaining = diet.toCharArray();
                Arrays.sort(remaining);

                for(int j=0;j<remaining.length;j++){
                    if(remaining[j]!='.'){
                        dinner+=remaining[j];
                    }
                }
            }
            System.out.println(dinner);
        }
    }

}
