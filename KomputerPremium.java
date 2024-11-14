
// To do: Buatlah 1 variable sesuai ketentuan
class KomputerPremium extends Komputer {
        protected boolean ruangPrivat;
// To do: Buatlah constructor pada class KomputerPremium
        public KomputerPremium(int jumlahKomputer, String namaWarnet, float hargaPerJam, boolean ruangPrivat) {
            super(jumlahKomputer, namaWarnet, hargaPerJam);
            this.ruangPrivat = ruangPrivat;
        }
// To do: Buatlah Method Informasi memakai Polymorphism Override dengan isi yang sesuai dengan ketentuan 
        @Override
        public void Informasi() {
            super.Informasi();
            System.out.println("Ruang Privat: " + (ruangPrivat ? "Ya" : "Tidak"));
        }
// To do: Buatlah method Pesan sesuai dengan ketentuan   
        public void Pesan(int nomorKomputer) {
            System.out.println("Komputer nomor " + nomorKomputer + " telah dipesan di Ruang Privat.");
        }
// To do: Buatlah method TambahLayanan sesuai dengan ketentuan
    
        public void TambahLayanan(String makanan) {
            System.out.println("Layanan makanan tambahan: " + makanan);
        }
// To do: Buatlah method TambahLayanan memakai Polymorphism Overloading sesuai dengan ketentuan
       
        public void TambahLayanan(String makanan, String minuman) {
            System.out.println("Layanan makanan tambahan: " + makanan + " dan minuman: " + minuman);
        }
    }
