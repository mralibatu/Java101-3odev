import java.util.Scanner;
public class HipoBulucu {
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);
        int a,b;
        System.out.println("Bir kenar giriniz : ");
        a = girdi.nextInt();
        System.out.println("Diger kenari giriniz : ");
        b = girdi.nextInt();

        double c =Math.sqrt((a*a) + (b*b));

        System.out.println(c);
    }
}
