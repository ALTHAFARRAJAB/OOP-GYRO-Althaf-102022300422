// To do: Buatlah 1 variable sesuai ketentuan
class KomputerVIP extends Komputer {
        protected boolean vipCard;
// To do: Buatlah constructor pada class KomputerVIP
        public KomputerVIP(int jumlahKomputer, String namaWarnet, float hargaPerJam, boolean vipCard) {
            super(jumlahKomputer, namaWarnet, hargaPerJam);
            this.vipCard = vipCard;
        }
// (boleh berbeda dengan output jurnal tetapi dengan cangkupan masih sesuai oleh materi modul!)
// To do: Buatlah Method Informasi memakai Polymorphism Override dengan isi yang sesuai dengan ketentuan    
        @Override
        public void Informasi() {
            super.Informasi();
                System.out.println("");
            System.out.println("VIP Card: " + (vipCard ? "Ya" : "Tidak"));
        }
// To do: Buatlah method Login sesuai dengan ketentuan  
        public void Login(String Username) {
            System.out.println("Username " + Username + " berhasil login ke Komputer VIP.");
        }
// To do: Buatlah method Bermain sesuai dengan ketentuan  
        public void Bermain(int jam) {
            System.out.println("Bermain selama " + jam + " jam di Komputer VIP.");
        }
// To do: Buatlah method Bermain memakai Polymorphism Overloading sesuai dengan ketentuan   
        public void Bermain(int jam, int menitTambahan) {
            System.out.println("Bermain selama " + jam + " jam dan " + menitTambahan + " menit di Komputer VIP.");
        }
    }
    
    
    
    
   
    
   

