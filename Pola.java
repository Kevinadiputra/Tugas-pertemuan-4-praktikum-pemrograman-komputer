import java.util.Scanner;

public class Pola {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            // Meminta pengguna memasukkan tinggi pola
            System.out.print("Masukkan tinggi pola (atau ketik 'keluar' untuk keluar): ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("keluar")) {
                System.out.println("Program selesai.");
                break;
            }

            try {
                // Mengonversi input menjadi integer untuk tinggi pola
                int tinggi = Integer.parseInt(input);

                // Menggunakan perulangan bersarang untuk menggambar pola
                for (int i = tinggi; i >= 1; i--) {
                    for (int j = 1; j <= i; j++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
            } catch (NumberFormatException e) {
                System.out.println("Mohon masukkan angka atau 'keluar'.");
            }
        }
    }
}
