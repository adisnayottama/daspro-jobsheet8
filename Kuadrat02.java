import java.util.Scanner;

public class Kuadrat02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, i, j;
        int jumlah;

        System.out.print("Masukkan nilai n: ");
        n = sc.nextInt();

        for (i = 1; i <= n; i++) {
            jumlah = 0;
            System.out.print("\nn = " + i + " --> jumlah kuadrat = ");

            for (j = 1; j <= i; j++) {
                System.out.print(j * j);
                jumlah += j * j;

                if (j < i) {
                    System.out.print(" + ");
                }
                
            }

            if (i > 1) {
                System.out.print(" = " + jumlah);
            } else {
                System.out.print("");
            }
            
        }
    }
}
