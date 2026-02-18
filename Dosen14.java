public class Dosen14 {
    String idDosen;
    String nama;
    boolean StatusAktif;
    int tahunBergabung;
    String BidangKeahlian;

    void tampilkanInformasi(int thnskrg){
        System.out.println("ID Dosen: " + idDosen);
        System.out.println("Nama Dosen: " + nama);

        if (StatusAktif) {
            System.out.println("Status Dosen: Aktif menjalankan tugas");
        } else {
            System.out.println("Status Dosen: Tidak aktif");
        }

        System.out.println("Tahun Bergabung: " + tahunBergabung);
        System.out.println("Bidang Keahlian: " + BidangKeahlian);
        System.out.println("Masa Kerja: " + hitungMasaKerja(thnskrg) + " tahun");
        System.out.println("-----------------------------------");
    }

    void setStatusAktif(boolean status){
        StatusAktif = status;
    }

    int hitungMasaKerja(int thnskrg){
        return thnskrg - tahunBergabung;
    }

    String ubahKeahlian(String bidang){
        BidangKeahlian = bidang;
        return BidangKeahlian;
    }

    public Dosen14(){}

    public Dosen14(String ID, String nm, boolean Stat, int thngabung, String BidKe){
        idDosen = ID;
        nama = nm;
        StatusAktif = Stat;
        tahunBergabung = thngabung;
        BidangKeahlian = BidKe;
    }
}
