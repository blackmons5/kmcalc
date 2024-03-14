import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            int km;
            System.out.println("Yolda kat edilen kmyi yazınız.");
            km=input.nextInt();
            double perkm = 2.20;
            double startprice = 10;
            double total=(km*perkm);
            if (total < 20) {
                System.out.println("Ücretiniz 20 tldir.");
            } else {
                System.out.println("Ücretiniz şu kadardır."+(total+startprice));

            }

        }
    }