import java.util.Scanner;

public class JenisSegitiga14 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukan Panjang Sisi A: ");
        int a = sc.nextInt();
        System.out.print("Masukan Panjang Sisi B: ");
        int b = sc.nextInt();
        System.out.print("Masukan Panjang Sisi C: ");
        int c = sc.nextInt();

        if (a == b && b == c) {
            System.out.println("Segitiga dengan sisi A:" + a + ",Sisi B: " + b + ",Sisi C:" + c + "Adalah Segitiga Sama Sisi");
        }else if (a == b || b == c || a == c) {
            System.out.println("Segitiga dengan panjang Sisi A: " + a + ",Sisi B: " + b + ",Sisi C: " + c + "Adalah Segtiga Sama Kaki");
        }else {
            System.out.println("Segitiga dengan Panjang Sisi A: " + a + ",Sisi B: " + b + ",Sisi C: " + c + "Adalah Segitiga Sembarang");
        }
        Scanner close;
    }
}