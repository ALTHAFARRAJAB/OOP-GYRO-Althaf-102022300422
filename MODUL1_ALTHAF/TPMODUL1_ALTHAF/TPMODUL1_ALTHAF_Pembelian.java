    import java.util.ArrayList;
    import java.util.Scanner;
    
    public class TPMODUL1_ALTHAF_Pembelian {
        public static void main(String[] args) {
            // ArrayList to store available flights
            ArrayList<TPMODUL1_ALTHAF_Penerbangan> daftarPenerbangan = new ArrayList<>();
            // Add some flight data
            daftarPenerbangan.add(new TPMODUL1_ALTHAF_Penerbangan("GA101", "CGK, Jakarta", "DPS, Bali", "06:30", "08:15", 1200000));
            daftarPenerbangan.add(new TPMODUL1_ALTHAF_Penerbangan("QZ202", "SUB, Surabaya", "KNO, Medan", "09:00", "11:45", 1350000));
    
            // Scanner to capture user input
            Scanner scanner = new Scanner(System.in);
            TPMODUL1_ALTHAF_Penumpang penumpang = null;
            TPMODUL1_ALTHAF_Penerbangan penerbangan = null;
    
            while (true) {
                System.out.println("====== EAD Ticket Booking System ======");
                System.out.println("1. Tampilkan Daftar Penerbangan");
                System.out.println("2. Beli Tiket");
                System.out.println("3. Tampilkan Pesanan Tiket");
                System.out.println("4. Exit");
                System.out.print("Silahkan pilih menu: ");
                int choice = scanner.nextInt();
    
                switch (choice) {
                    case 1:
                        // Display list of flights
                        System.out.println("\nDaftar Penerbangan:");
                        for (int i = 0; i < daftarPenerbangan.size(); i++) {
                            daftarPenerbangan.get(i).tampilDaftarPenerbangan(i + 1);
                        }
                        break;
                    case 2:
                        // Buy ticket
                        System.out.println("\nSilakan isi data diri Anda terlebih dahulu!");
                        System.out.print("Masukkan NIK: ");
                        String NIK = scanner.next();
                        System.out.print("Masukkan Nama Depan: ");
                        String namaDepan = scanner.next();
                        System.out.print("Masukkan Nama Belakang: ");
                        String namaBelakang = scanner.next();
    
                        penumpang = new TPMODUL1_ALTHAF_Penumpang(NIK, namaDepan, namaBelakang);
    
                        System.out.println("\nTerima Kasih telah Mengisi Data Pelanggan.");
                        System.out.println("Silakan Pilih Tiket Penerbangan Yang Tersedia:");
                        for (int i = 0; i < daftarPenerbangan.size(); i++) {
                            daftarPenerbangan.get(i).tampilDaftarPenerbangan(i + 1);
                        }
                        System.out.print("Pilih nomor penerbangan (ex: 1): ");
                        int nomorPenerbangan = scanner.nextInt();
    
                        penerbangan = daftarPenerbangan.get(nomorPenerbangan - 1);
                        System.out.println("\nPesanan Tiket Berhasil Dilakukan.");
                        break;
                    case 3:
                        if (penumpang != null && penerbangan != null) {
                            // Display booked ticket details
                            System.out.println("\n====== Detail Tiket Penerbangan ======");
                            penumpang.tampilDaftarPenumpang();
                            penerbangan.tampilDaftarPenerbangan(1);
                        } else {
                            System.out.println("\nPembelian Tiket Tidak Ada");
                        }
                        break;
                    case 4:
                        // Exit
                        System.out.println("\nTerima Kasih!");
                        scanner.close();
                        return;
                    default:
                        System.out.println("Pilihan tidak valid.");
                }
            }
        
        }
    }  

