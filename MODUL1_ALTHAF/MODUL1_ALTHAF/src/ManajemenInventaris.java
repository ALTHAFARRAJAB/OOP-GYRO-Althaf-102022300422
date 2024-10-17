import java.util.ArrayList;
import java.util.Scanner;

class MakananKering {
    String nama;
    int jumlah;
    double harga;
    String brand;

    public MakananKering(String nama, int jumlah, double harga, String brand) {
        this.nama = nama;
        this.jumlah = jumlah;
        this.harga = harga;
        this.brand = brand;
    }

    public String toString() {
        return "Nama: " + nama + ", Jumlah: " + jumlah + ", Harga: " + harga + ", Brand: " + brand;
    }
}

class MakananBasah {
    String nama;
    int jumlah;
    double harga;
    String bahan;

    public MakananBasah(String nama, int jumlah, double harga, String bahan) {
        this.nama = nama;
        this.jumlah = jumlah;
        this.harga = harga;
        this.bahan = bahan;
    }

    public String toString() {
        return "Nama: " + nama + ", Jumlah: " + jumlah + ", Harga: " + harga + ", Bahan: " + bahan;
    }
}

public class ManajemenInventaris {
    ArrayList<MakananKering> daftarMakananKering = new ArrayList<>();
    ArrayList<MakananBasah> daftarMakananBasah = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public void tambahMakananKering() {
        System.out.print("Masukkan Nama Makanan Kering: ");
        String nama = scanner.nextLine();
        System.out.print("Masukkan Jumlah Makanan: ");
        int jumlah = scanner.nextInt();
        System.out.print("Masukkan Harga Makanan: ");
        double harga = scanner.nextDouble();
        scanner.nextLine();  // Clear the buffer
        System.out.print("Masukkan Brand Makanan: ");
        String brand = scanner.nextLine();

        MakananKering makananKering = new MakananKering(nama, jumlah, harga, brand);
        daftarMakananKering.add(makananKering);
        System.out.println("Makanan kering berhasil ditambahkan.");
    }

    public void tambahMakananBasah() {
        System.out.print("Masukkan Nama Makanan Basah: ");
        String nama = scanner.nextLine();
        System.out.print("Masukkan Jumlah Makanan: ");
        int jumlah = scanner.nextInt();
        System.out.print("Masukkan Harga Makanan: ");
        double harga = scanner.nextDouble();
        scanner.nextLine();  // Clear the buffer
        System.out.print("Masukkan Bahan Makanan: ");
        String bahan = scanner.nextLine();

        MakananBasah makananBasah = new MakananBasah(nama, jumlah, harga, bahan);
        daftarMakananBasah.add(makananBasah);
        System.out.println("Makanan basah berhasil ditambahkan.");
    }

    public void tampilkanSemuaMakanan() {
        if (daftarMakananKering.isEmpty() && daftarMakananBasah.isEmpty()) {
            System.out.println("Tidak ada makanan disini.");
        } else {
            System.out.println("Daftar Makanan Kering:");
            for (MakananKering makananKering : daftarMakananKering) {
                System.out.println(makananKering);
            }

            System.out.println("\nDaftar Makanan Basah:");
            for (MakananBasah makananBasah : daftarMakananBasah) {
                System.out.println(makananBasah);
            }
        }
    }

    public static void main(String[] args) {
        ManajemenInventaris inventaris = new ManajemenInventaris();
        int pilihan;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Tambah Makanan Kering");
            System.out.println("2. Tambah Makanan Basah");
            System.out.println("3. Tampilkan Semua Makanan");
            System.out.println("4. Keluar");
            System.out.print("Pilih opsi: ");
            pilihan = inventaris.scanner.nextInt();
            inventaris.scanner.nextLine();  // Clear the buffer

            switch (pilihan) {
                case 1:
                    inventaris.tambahMakananKering();
                    break;
                case 2:
                    inventaris.tambahMakananBasah();
                    break;
                case 3:
                    inventaris.tampilkanSemuaMakanan();
                    break;
                case 4:
                    System.out.println("Terima kasih telah menggunakan program.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        } while (pilihan != 4);
        
        inventaris.scanner.close();
    }
}