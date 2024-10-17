public class MakananBasah {
    // Todo : Create private attribute of MakananKering (nama, jumlah, harga, and bahan)
    private String nama ;
    private String jumlah ;
    private int harga ;
    private String brand ;

    public MakananBasah(String nama, String jumlah, int harga, String brand) {
        this.nama = nama;
        this.jumlah = jumlah;
        this.harga = harga;
        this.brand = brand;
    }
        public String getNama() {
            return nama;
        }
        public void setNama(String nama) {
            this.nama = nama;
        }
        public String getJumlah() {
            return jumlah;
        }
        public void setJumlah(String jumlah) {
            this.jumlah = jumlah;
        }
        public int getHarga() {
            return harga;
        }
        public void setHarga(int harga) {
            this.harga = harga;
        }
        public String getBrand() {
            return brand;
        }
        public void setBrand(String brand) {
            this.brand = brand;
        }

        public void TampilkanData(){
            System.out.println("Makanan basah:" + getNama() + "jumlah:" + getJumlah() + "harga:" + getHarga() + "brand:" + getBrand());
    // Todo : Create Constructor of MakananBasah

    // Todo : Create Getter and Setter

    // Todo : Create Method ShowData

}
    }
