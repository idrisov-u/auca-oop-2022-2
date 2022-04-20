import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int days = scan.nextInt();
        scan.nextLine();
        int totalKg = 0;
        double totalSpent = 0;
        double averKg = 0;
        double averSpent = 0;
        for(int i=1;i<=days;i++){


            double spentPerDay = scan.nextDouble();
            scan.nextLine();
            String line2 = scan.nextLine();
            int kgPerDay = wordCount(line2);

//            Scanner lineScan = new Scanner(line2);
//            System.out.println(spentPerDay+" "+line2);
//            while (lineScan.hasNext()){
//                System.out.print(" ");
//                kgPerDay++;
//            }

//            System.out.println(kgPerDay);
            totalKg+=kgPerDay;
            totalSpent+=spentPerDay;

            System.out.printf("day %d: %d kg%n",i,kgPerDay);
        }
        averKg = (double) totalKg/(double) days;
        averSpent = totalSpent/(double)days;
        System.out.printf("%.2f kg by day%n",averKg);
        System.out.printf("R$ %.2f by day%n",averSpent);

    }

    public static int wordCount(String string)
    {
        int count=0;

        char ch[]= new char[string.length()];
        for(int i=0;i<string.length();i++)
        {
            ch[i]= string.charAt(i);
            if( ((i>0)&&(ch[i]!=' ')&&(ch[i-1]==' ')) || ((ch[0]!=' ')&&(i==0)) )
                count++;
        }
        return count;
    }
}
