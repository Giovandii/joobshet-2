public class MataKuliahMain14{

        public static void main(String[] args) {
            MataKuliah14 MK = new MataKuliah14();

            MK.KodeMK = "ASD";
            MK.nama = "Algoritma Struktur Data";
            MK.sks = 2;
            MK.JumlahJam = 4;

            MK.tampilkanInformasi();
            MK.ubahSKS(4);
            MK.tambahJam(2);
            MK.kurangiJam(1);
            MK.tampilkanInformasi();

            MataKuliah14 MK1 = new MataKuliah14("PASD", "Praktikum Algoritma Struktur Data", 4, 6);
            MK1.tampilkanInformasi();
        }
}