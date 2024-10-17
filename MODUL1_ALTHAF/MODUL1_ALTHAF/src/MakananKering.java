public class MakananKering {
    // Todo : Create private attribute of MakananKering (nama, jumlah, harga, and brand)
    private String nama ;
    private String jumlah ;
    private String harga ;
    private String brand ;
    // Todo : Create Constructor of MakananKering
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
    public String getHarga() {
        return harga;
    }
    public void setHarga(String harga) {
        this.harga = harga;
    }
    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void TampilkanData(){
        System.out.println("Makanan Kering:" + getNama() + "jumlah:" + getJumlah() + "harga:" + getHarga() + "brand:" + getBrand());

    // Todo : Create Getter and Setter

    // Todo : Create Method ShowData
    }
}
 