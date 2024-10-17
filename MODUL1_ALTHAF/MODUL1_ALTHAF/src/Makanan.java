public class Makanan {
    // Todo : Create private attribute of Makanan (nama, jumlah, and harga)
    private String nama ;
    private String jumlah ;
    private int harga ;

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
    // Todo : Create Constructor of Makanan
    public Makanan(String nama, String jumlah, int harga) {
        this.nama = nama;
        this.jumlah = jumlah;
        this.harga = harga;
    }

    // Todo : Create Getter and Setter

}