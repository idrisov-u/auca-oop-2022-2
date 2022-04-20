import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = 1;

        while(n!=0){
            n = scan.nextInt();
            if(n!=0){
                scan.nextLine();
                int dir = 0;
                String line = scan.nextLine();

                char[] arr = line.toCharArray();

                for(int i =0;i<arr.length;i++){
                    switch (arr[i]){
                        case 'D':
                            dir = (dir+1)%4;
                            break;
                        case'E':
                            dir = (dir+3)%4;
                    }
                }
                switch (dir){
                    case 0:
                        System.out.println("N");
                        break;
                    case 1:
                        System.out.println("L");
                        break;
                    case 2:
                        System.out.println("S");
                        break;
                    case 3:
                        System.out.println("O");
                        break;
                }
            }
        }
    }
}
