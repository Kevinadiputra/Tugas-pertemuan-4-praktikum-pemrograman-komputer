import java.util.Scanner;

public class PilihRestoran {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input preferensi makanan 
        System.out.print("Apakah ada yang vegetarian? (ya/tidak): ");
        String vegetarian = scanner.nextLine().toLowerCase();
        System.out.print("Apakah ada yang vegan? (ya/tidak): ");
        String vegan = scanner.nextLine().toLowerCase();
        System.out.print("Apakah ada yang bebas gluten? (ya/tidak): ");
        String glutenFree = scanner.nextLine().toLowerCase();

        // Daftar restoran beserta preferensi makanannya
        String[] namaRestoran = {
            "Joes Gourmet Burgers",
            "Main Street Pizza Company",
            "Corner Cafe",
            "Mamas Fine Italian",
            "The Chefs Kitchen"
        };

        boolean[][] preferensiRestoran = {
            {false, false, false},
            {true, false, true},
            {true, true, true},
            {true, false, false},
            {true, true, true}
        };

        // Menampilkan restoran yang sesuai dengan preferensi makanan
        System.out.println("\nRestoran yang cocok untuk grup Anda:");
        for (int i = 0; i < namaRestoran.length; i++) {
            if ((vegetarian.equals("ya") && !preferensiRestoran[i][0]) ||
                (vegan.equals("ya") && !preferensiRestoran[i][1]) ||
                (glutenFree.equals("ya") && !preferensiRestoran[i][2])) {
                continue;
            }
            System.out.println("- " + namaRestoran[i]);
        }
    }
}
