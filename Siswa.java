class Siswa{
    String nama,kelas;
    int nis,tugas,uts,uas;

    int penilaian(int tugas,int hadir,int ujian){
        int nilaiAkhir = (tugas + hadir + ujian) / 3;
        return nilaiAkhir;
    }
    
    public static void main(String [] rizal){
        Siswa a = new Siswa();
        a.nama = "Muammar rizal";
        a.nis = 2311;
        a.kelas = "R54";
        a.tugas = 87;
        a.uts = 62;
        a.uas = 91;
        
        System.out.println("TUGAS : "+a.tugas);
        System.out.println("UTS   : "+a.uts);
        System.out.println("UAS   : "+a.uas);
        
        int masukan = a.penilaian(a.tugas,a.uts,a.uas);
        System.out.println("Nama :"+a.nama);
        System.out.println("NIS :"+a.nis);
        System.out.println("KELAS :"+a.kelas);
    
        System.out.println("=====================================================");
        System.out.println("Nilai akhir nya adalah : "+masukan);
    }
}
