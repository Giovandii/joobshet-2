public class DosenMain14 {
    public static void main(String[] args) {
       
        Dosen14 Dsn = new Dosen14();
        Dsn.idDosen = "198807112015042005"; 
        Dsn.nama = "Eka Larasati Amalia, S.ST., M.T."; 
        Dsn.setStatusAktif(false);
        Dsn.tahunBergabung = 2010;
        Dsn.BidangKeahlian = "Teknik Informatika";

        Dsn.tampilkanInformasi(2026); 

        Dsn.setStatusAktif(true);
        Dsn.ubahKeahlian("Sistem Informasi");
        Dsn.tampilkanInformasi(2026); 

        Dosen14 Dsn1 = new Dosen14(
            "198807112015042006", 
            "Pramana Yoga Saputra, S.Kom., M.MT.", 
            true, 
            2015, 
            "Teknik Informatika"
        );
        Dsn1.tampilkanInformasi(2026);
    }
}
