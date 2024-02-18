import java.util.Scanner;

public class WaktuPutaranBalap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // memasukkan jumlah putaran
        System.out.print("Masukkan jumlah putaran: ");
        int jumlahPutaran = scanner.nextInt();

        // Inisialisasi variabel untuk waktu putaran
        double waktuTercepat = Double.MAX_VALUE;
        double waktuTerlama = Double.MIN_VALUE;
        double totalWaktu = 0;

        // perulangan untuk meminta waktu putaran
        for (int i = 1; i <= jumlahPutaran; i++) {
            System.out.print("Masukkan waktu putaran ke-" + i + " (dalam detik): ");
            double waktuPutaran = scanner.nextDouble();

            // Memperbarui waktu tercepat, waktu terlama, dan total waktu
            waktuTercepat = Math.min(waktuTercepat, waktuPutaran);
            waktuTerlama = Math.max(waktuTerlama, waktuPutaran);
            totalWaktu += waktuPutaran;
        }

        // Menghitung waktu rata-rata
        double rataRataWaktu = totalWaktu / jumlahPutaran;

        // Menampilkan hasil
        System.out.println("\nHasil putaran balap:");
        System.out.println("Waktu tercepat: " + waktuTercepat + " detik");
        System.out.println("Waktu terlama: " + waktuTerlama + " detik");
        System.out.println("Waktu rata-rata: " + rataRataWaktu + " detik");
    }
}
