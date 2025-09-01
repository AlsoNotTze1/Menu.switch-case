
package menu;
import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
    
        Scanner input = new Scanner(System.in);

        System.out.println("=== Menu Paket Makanan ===");
        System.out.println("1. Paket Ayam - Rp.15.000");
        System.out.println("2. Paket Ikan - Rp.20.000");
        System.out.println("3. Paket Daging - Rp.30.000 (Diskon Rp.5.000)");
        System.out.println("4. Paket Sayur - Rp.10.000");
        System.out.print("Pilih paket (1-4): ");

        int pilihan = input.nextInt();
        int harga;

        switch (pilihan) {
            case 1:
                harga = 15000;
                System.out.println("Anda memilih Paket Ayam.");
                break;
            case 2:
                harga = 20000;
                System.out.println("Anda memilih Paket Ikan.");
                break;
            case 3:
                harga = 30000 - 5000; // Potongan Rp.5000
                System.out.println("Anda memilih Paket Daging. Anda mendapat potongan Rp.5000!");
                break;
            case 4:
                harga = 10000;
                System.out.println("Anda memilih Paket Sayur.");
                break;
            default:
                System.out.println("Pilihan tidak valid.");
                return; // Keluar dari program kalau input salah
        }
        {
        System.out.println("Total yang harus dibayar: Rp." + harga);
        input.close();
        }
    }
}
