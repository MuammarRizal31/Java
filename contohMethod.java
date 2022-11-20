class contohMethod{
    int daftar,obat,vitamin,tlp;
    int total;
    String nama,alamat;

void data(){
        System.out.println("\nNama pasien \t\t \t\t"+nama);
        System.out.println("Alamat pasien \t\t \t\t"+alamat);
        System.out.println("No. Tlp Pasien \t\t \t\t"+tlp);
    }
    int administrasion(){
        total = daftar + obat + vitamin;
        return total;
    }
}