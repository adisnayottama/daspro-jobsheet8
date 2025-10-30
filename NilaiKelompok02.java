import java.util.Scanner;

public class NilaiKelompok02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i, j, nilai;
        int kelTertinggi = 0;
        float totalNilai, rataNilai;
        float rataTertinggi = 0;
        
        i = 1;
        while (i <= 6) {
            System.out.println("Kelompok " + i);
            
            
            totalNilai = 0;
            for (j = 1; j <= 5; j++) {
                System.out.print("  Nilai dari Kelompok Penilai " + j + " : ");
                nilai = sc.nextInt();
                totalNilai += nilai; 
            }

            rataNilai = totalNilai / 5;
            System.out.println("Rata-rata Nilai Kelompok " + i + " = " + rataNilai);

            if (rataNilai > rataTertinggi) {
                rataTertinggi = rataNilai;
                kelTertinggi = i;
            }

            i++; 
        }
        System.out.println("Kelompok dengan rata-rata tertinggi: ");
        System.out.println("Kelompok " + kelTertinggi + " dengan nilai rata-rata :" + rataTertinggi);
    }
}
