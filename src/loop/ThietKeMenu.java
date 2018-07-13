package loop;
import com.company.soXo;
import java.util.Scanner;

public class ThietKeMenu {
    public static void main(String[] args) {
        System.out.println("Menu:");
        System.out.println("1.nhap ten thi sinh:");
        System.out.println("2.nhap ngay thang nam sinh:");
        System.out.println("3.Que Quan:");
        System.out.println("4. Exit");
        Scanner scanner = new Scanner(System.in);
        int choice;
        soXo xd = new soXo();
        do {
            System.out.println("chon mot muc:");
             choice =  scanner.nextInt();
             switch( choice){
                 case 1 :
                    soXo.taoXoSo();
                     break;
                 case 2:
                     System.out.println("2.nhap ngay thang nam sinh:");
                     System.out.println("********");
                     System.out.println("****88");

                     break;
                 case 3:
                     System.out.println("3.Que Quan:");
                     System.out.println("********");
                     System.out.println("****88");
                     break;
                 case 0:
                     System.exit(0);


             }
        } while ( choice != 0);

    }
}