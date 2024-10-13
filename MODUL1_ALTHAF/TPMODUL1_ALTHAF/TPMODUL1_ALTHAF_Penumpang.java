public class TPMODUL1_ALTHAF_Penumpang {
    private String NIK;
    private String namaDepan;
    private String namaBelakang;
    
    public TPMODUL1_ALTHAF_Penumpang (String NIK, String namaDepan, String namaBelakang) {
        this.NIK = NIK;
        this.namaDepan = namaDepan;
        this.namaBelakang = namaBelakang;
    }

    public void tampilDaftarPenumpang() {
        System.out.println("Nomor Induk Kependudukan: " + NIK);
        System.out.println("Nama Depan: " + namaDepan);
        System.out.println("Nama Belakang: " + namaBelakang);
    }
}
    

