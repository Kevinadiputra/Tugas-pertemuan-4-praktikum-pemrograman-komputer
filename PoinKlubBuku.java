import java.util.Scanner;

public class PoinKlubBuku {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Meminta pengguna memasukkan jumlah buku yang dibeli bulan ini
        System.out.print("Masukkan jumlah buku yang dibeli bulan ini: ");
        int jumlahBuku = scanner.nextInt();

        // Menghitung jumlah poin berdasarkan jumlah buku yang dibeli
        int jumlahPoin = 0;
        if (jumlahBuku == 2) {
            jumlahPoin = 5;
        } else if (jumlahBuku == 4) {
            jumlahPoin = 15;
        } else if (jumlahBuku == 6) {
            jumlahPoin = 30;
        } else if (jumlahBuku >= 8) {
            jumlahPoin = 60;
        }

        // Menampilkan jumlah poin yang diberikan
        System.out.println("Jumlah poin yang diberikan: " + jumlahPoin);
    }
}
