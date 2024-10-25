import java.util.Scanner;

public class DiskonCashback14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan uang yang Anda miliki: ");
        double uang = scanner.nextDouble();
        System.out.print("Masukkan total pembelanjaan: ");
        double totalBelanja = scanner.nextDouble();
        System.out.print("Masukkan hari: ");
        String hari = scanner.next();
        System.out.print("Masukkan vendor dompet digital yang digunakan (GoPay/Ovo): ");
        String vendor = scanner.next();

        double diskon = 0;
        double cashback = 0;

        if (vendor.equalsIgnoreCase("GoPay")) {
            switch (hari.toLowerCase()) {
                case "senin":
                    cashback = 10;
                    break;
                case "selasa":
                    diskon = 10;
                    break;
                case "rabu":
                    diskon = 15;
                    break;
                case "kamis":
                    cashback = 10;
                    break;
                case "jumat":
                    diskon = 10;
                    break;
                case "sabtu":
                    diskon = 15;
                    break;
                case "minggu":
                    diskon = 20;
                    break;
                default:
                    System.out.println("Hari tidak valid.");
                    return;
            }
        } else if (vendor.equalsIgnoreCase("Ovo")) {
            switch (hari.toLowerCase()) {
                case "senin":
                    diskon = 10;
                    break;
                case "selasa":
                    cashback = 15;
                    break;
                case "rabu":
                    diskon = 15;
                    break;
                case "kamis":
                    diskon = 10;
                    break;
                case "jumat":
                    diskon = 15;
                    break;
                case "sabtu":
                    cashback = 10;
                    break;
                case "minggu":
                    diskon = 15;
                    break;
                default:
                    System.out.println("Hari tidak valid.");
                    return;
            }
        } else {
            System.out.println("Vendor tidak valid.");
            return;
        }

        double jumlahDiskon = totalBelanja * diskon / 100;
        double totalBayar = totalBelanja - jumlahDiskon;

        double jumlahCashback = totalBayar * cashback / 100;
        double sisaUang = uang - totalBayar + jumlahCashback;

        System.out.println("-------------------------------------------------");
        if (diskon > 0) {
            System.out.println("Jenis Promo yang Anda Dapatkan: Diskon " + diskon + "%");
        } else if (cashback > 0) {
            System.out.println("Jenis Promo yang Anda Dapatkan: Cashback " + cashback + "%");
        } else {
            System.out.println("Tidak ada promo yang berlaku.");
        }
        System.out.println("Uang yang Harus Dibayarkan: " + totalBayar);
        System.out.println("Sisa Uang yang Anda Miliki: " + sisaUang);

        scanner.close();
    }
}
