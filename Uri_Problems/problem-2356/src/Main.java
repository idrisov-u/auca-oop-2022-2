import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while(scan.hasNextLine()){
            String dna = scan.nextLine();
            String code = scan.nextLine();
            System.out.println(dna.contains(code)?"Resistente":"Nao resistente");
        }

    }
}