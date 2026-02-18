public class MataKuliah14{
    String KodeMK;
    String nama;
    int sks;
    int JumlahJam;

    void tampilkanInformasi(){
        System.out.println("KodeMK : "+KodeMK);
        System.out.println("Nama MK: "+nama);
        System.out.println("SKS: "+sks);
        System.out.println("Jumlah Jam: "+JumlahJam);
    }
    void ubahSKS(int sksBaru){
        sks = sksBaru;
    }
    void tambahJam(int jam){
        JumlahJam += jam;
    }
    int kurangiJam(int jam){
        if(JumlahJam >= jam){
        JumlahJam -= jam;
        return JumlahJam;
        } else {
        System.out.println("Jumlah Jam Tidak terpenuhi");
        return JumlahJam;
        }
    }
    public MataKuliah14(){

    }
    public MataKuliah14(String KMK, String nm, int sks, int jumJam){
        KodeMK= KMK;
        nama = nm;
        this.sks = sks;
        JumlahJam = jumJam;
    }
}