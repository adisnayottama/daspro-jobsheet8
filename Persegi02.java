import java.util.Scanner;

public class Persegi02 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        System.out.print("Masukkan nilai n: ");
        n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                
                if (i == 1 || i == n || j == 1 || j == n) {
                    System.out.print(n + "  ");
                } else {
                    System.out.print("   "); 
                }
            }
            System.out.println();
        }

        sc.close();
    }
}