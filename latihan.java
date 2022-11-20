public class latihan{
    String nama,alamat;
    int nik;
    
    public void data_kar(){
        System.out.println("NIK     : "+nik);
        System.out.println("NAMA     :"+nama);
        System.out.println("ALAMAT     :"+alamat);
    }
    
    void gaji_bersih(int g,int b,int l){
        int kl = g*(30/100);
        System.out.println("Gaji bersih : "+(g+b+l-kl));
    }
    
    public static void Main(String [] rizal){
        latihan a = new latihan();
        a.nama = "Muammar Rizal";
        a.alamat = "Jakarta selatan";
        a.nik = 3;
        a.data_kar();
        a.gaji_bersih(90000,30000,15000);
    }
    
    int raport (int tugas,int uts,int uas){
        int total = tugas + uts + uas;
        return total;
    }
}