public class TokoObat{
    public static void main(String [] rizal){
        obat obat1 = new obat();
        obat1.kode_obat = "122";
        obat1.nama_obat = "Panadol";
        obat1.jenis_obat = "tablet";
        obat1.fungsi_obat = "ngilangin pusing";
        obat1.harga_obat = 10000;
        System.out.println("DAFTAR OBAT DIAPOTEK ABC");
        System.out.println("======================================");
        System.out.println("Kode_Obat   Nama_Obat   Jenis_Obat  Fungsi_Obat harga_obat");
        System.out.println(obat1.kode_obat +"\t"+ obat1.nama_obat+"\t"+obat1.jenis_obat+"\t"+obat1.fungsi_obat+"\t"+obat1.harga_obat);
        
        System.out.println();
        obat obat2 = new obat();
        obat2.kode_obat = "123";
        obat2.nama_obat = "PARACETAMOL";
        obat2.jenis_obat = "tablet";
        obat2.fungsi_obat = "ngilanginPanas";
        obat2.harga_obat = 20000;
        System.out.println(obat2.kode_obat +"\t"+ obat2.nama_obat+"\t"+obat2.jenis_obat+"\t"+obat2.fungsi_obat+"\t"+obat2.harga_obat);
        
        System.out.println();
        obat obat3 = new obat();
        obat3.kode_obat = "1234";
        obat3.nama_obat = "PARAMEX";
        obat3.jenis_obat = "tablet";
        obat3.fungsi_obat = "ngilanginDemam";
        obat3.harga_obat = 30000;
        System.out.println(obat3.kode_obat +"\t"+ obat3.nama_obat+"\t"+obat3.jenis_obat+"\t"+obat3.fungsi_obat+"\t"+obat3.harga_obat);
        
        System.out.println();
        System.out.println("CAIR");
        obat1.cair();
        System.out.println();
        obat2.cair();
        System.out.println();
        obat3.cair();
        System.out.println("===================");
        
        System.out.println();
        System.out.println("TABLET");
        obat1.tablet();
        System.out.println();
        obat2.tablet();
        System.out.println();
        obat3.tablet();
        System.out.println("===================");
        
        System.out.println();
        System.out.println("KAPSUL");
        obat1.kapsul();
        System.out.println();
        obat2.kapsul();
        System.out.println();
        obat3.kapsul();
        System.out.println("===================");
    }
}