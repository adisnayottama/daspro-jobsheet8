import java.util.Scanner;

public class KopiSenja02 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jmlCabang;
        int totPelanggan = 0;
        int totItem = 0;

        System.out.print("Jumlah cabang kafe: ");
        jmlCabang = sc.nextInt();

        System.out.println("\n=== Input Penjualan Per cabang ===");

        for (int i = 1; i <= jmlCabang; i++) {
            System.out.println("\n--- Cabang " + i + "---");

            System.out.print("Jumlah pelanggan: ");
            int jmlPelanggan = sc.nextInt();

            int totItemCab = 0;

            for (int j = 1; j <= jmlPelanggan; j++) {
                System.out.print("- Pelanggan " + j + " memesan berapa item? ");
                int item = sc.nextInt();
                totItemCab += item;
            }
            System.out.println("Cabang " + i + ":");
            System.out.println("- Pelanggan: " + jmlPelanggan + " orang");
            System.out.println("- Item terjual: " + totItemCab);

            totPelanggan += jmlPelanggan;
            totItem += totItemCab;
        }
        System.out.println("\nTotal seluruh cabang: ");
        System.out.println("Pelanggan: " + totPelanggan + " orang");
        System.out.println("Item terjual: " + totItem + " item");
    }
}