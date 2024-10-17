import java.util.Scanner;

        public class Main {
        public static void main(String[] args) {
            // Todo : Create ManajemenInventaris Object and Scanner
        Scanner scanner = new Scanner(System.in);
            // Todo : Create Loop list menu
        System.out.print("Masukan nama : ");
        String nama = scanner.nextLine();

        System.out.print("Masukan jumlah: ");
        int Jumlah = scanner.nextInt();

        System.out.print("Masukan harga");
        double Harga = scanner.nextDouble();

        System.out.print("Masukan brand");
        String brand = scanner.nextLine();

        System.out.println("Hallo, " + nama +" Berapa jumlah " + Jumlah + "Berapa harga " + Harga + "Nama Brand " + brand + "terima kasih");

        scanner.close();
        }
    }

