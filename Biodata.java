public class Biodata{
    public static void main(String [] args){
        Mahasiswa mahasiswa1 = new Mahasiswa();
        mahasiswa1.npm      ="202043502004";
        mahasiswa1.nama     ="Muammar rizal";
        mahasiswa1.rombel   ="R54";
        mahasiswa1.kelas    ="Reguler";
        mahasiswa1.jurusan  ="Informatika";
        mahasiswa1.alamat   ="Jl H.kaisin Jakarta Selatan";
        mahasiswa1.telp     ="089639586047";
        mahasiswa1.status   ="Aktif";
        
        Mahasiswa mahasiswa2 = new Mahasiswa();
        mahasiswa2.npm      ="202043501293";
        mahasiswa2.nama     ="Muhammad Vickri";
        mahasiswa2.rombel   ="R57";
        mahasiswa2.kelas    ="Sore";
        mahasiswa2.jurusan  ="Informatika";
        mahasiswa2.alamat   ="Jagakarsa Jakarta selatan";
        mahasiswa2.telp     ="089639542342";
        mahasiswa2.status   ="Aktif";
        
        Mahasiswa mahasiswa3 = new Mahasiswa();
        mahasiswa3.npm      ="202043502183";
        mahasiswa3.nama     ="Muammad zaqi";
        mahasiswa3.rombel   ="R53";
        mahasiswa3.kelas    ="Reguler";
        mahasiswa3.jurusan  ="Informatika";
        mahasiswa3.alamat   ="Cipedak Jakarta Selatan";
        mahasiswa3.telp     ="089623183123";
        mahasiswa3.status   ="Cuti";
        
        Mahasiswa mahasiswa4 = new Mahasiswa();
        mahasiswa4.npm      ="202043502131";
        mahasiswa4.nama     ="Adinda Salsabila";
        mahasiswa4.rombel   ="R51";
        mahasiswa4.kelas    ="Terbuka";
        mahasiswa4.jurusan  ="DKV";
        mahasiswa4.alamat   ="Cianjur bandung";
        mahasiswa4.telp     ="089686563123";
        mahasiswa4.status   ="Non aktif";
        
        Mahasiswa mahasiswa5 = new Mahasiswa();
        mahasiswa5.npm      ="202043502131";
        mahasiswa5.nama     ="Anisa rahayu";
        mahasiswa5.rombel   ="R51";
        mahasiswa5.kelas    ="Ekstensi";
        mahasiswa5.jurusan  ="DKV";
        mahasiswa5.alamat   ="Cianjur bandung";
        mahasiswa5.telp     ="089686563123";
        mahasiswa5.status   ="Non aktif";
        System.out.println("================================================================================");
        System.out.println("\t\t\tMahasiswa Universitas IndraPrasta");
        System.out.println("================================================================================");
        System.out.println("Mahasiswa 1");
        System.out.println("NPM \t : "      +mahasiswa1.npm);
        System.out.println("Nama \t : "     +mahasiswa1.nama);
        System.out.println("Rombel \t : "   +mahasiswa1.rombel);
        System.out.println("Kelas \t : "    +mahasiswa1.kelas);
        System.out.println("Jurusan\t : "   +mahasiswa1.jurusan);
        System.out.println("Alamat \t : "   +mahasiswa1.alamat);
        System.out.println("Telp \t : "     +mahasiswa1.telp);
        System.out.println("Status \t : "   +mahasiswa1.status);
        
        System.out.println();
        System.out.println("================================================================================");
        System.out.println("Mahasiswa 2");
        System.out.println("NPM \t : "      +mahasiswa2.npm);
        System.out.println("Nama \t : "     +mahasiswa2.nama);
        System.out.println("Rombel \t : "   +mahasiswa2.rombel);
        System.out.println("Kelas \t : "    +mahasiswa2.kelas);
        System.out.println("Jurusan\t : "   +mahasiswa2.jurusan);
        System.out.println("Alamat \t : "   +mahasiswa2.alamat);
        System.out.println("Telp \t : "     +mahasiswa2.telp);
        System.out.println("Status \t : "   +mahasiswa2.status);
        
        System.out.println();
        System.out.println("================================================================================");
        System.out.println("Mahasiswa 3");
        System.out.println("NPM \t : "      +mahasiswa3.npm);
        System.out.println("Nama \t : "     +mahasiswa3.nama);
        System.out.println("Rombel \t : "   +mahasiswa3.rombel);
        System.out.println("Kelas \t : "    +mahasiswa3.kelas);
        System.out.println("Jurusan\t : "   +mahasiswa3.jurusan);
        System.out.println("Alamat \t : "   +mahasiswa3.alamat);
        System.out.println("Telp \t : "     +mahasiswa3.telp);
        System.out.println("Status \t : "   +mahasiswa3.status);
        
        System.out.println();
        System.out.println("================================================================================");
        System.out.println("Mahasiswa 4");
        System.out.println("NPM \t : "      +mahasiswa4.npm);
        System.out.println("Nama \t : "     +mahasiswa4.nama);
        System.out.println("Rombel \t : "   +mahasiswa4.rombel);
        System.out.println("Kelas \t : "    +mahasiswa4.kelas);
        System.out.println("Jurusan\t : "   +mahasiswa4.jurusan);
        System.out.println("Alamat \t : "   +mahasiswa4.alamat);
        System.out.println("Telp \t : "     +mahasiswa4.telp);
        System.out.println("Status \t : "   +mahasiswa4.status);
        
        System.out.println();
        System.out.println("================================================================================");
        System.out.println("Mahasiswa 5");
        System.out.println("NPM \t : "      +mahasiswa5.npm);
        System.out.println("Nama \t : "     +mahasiswa5.nama);
        System.out.println("Rombel \t : "   +mahasiswa5.rombel);
        System.out.println("Kelas \t : "    +mahasiswa5.kelas);
        System.out.println("Jurusan\t : "   +mahasiswa5.jurusan);
        System.out.println("Alamat \t : "   +mahasiswa5.alamat);
        System.out.println("Telp \t : "     +mahasiswa5.telp);
        System.out.println("Status \t : "   +mahasiswa5.status);
        System.out.println("\n");
        
        System.out.println("=================================================================================");
        System.out.println("---> Kelas reguler <---");
        mahasiswa1.Reguler();
        
        System.out.println();
        
        mahasiswa3.Reguler();
        
        System.out.println();
        
        System.out.println("---> Kelas Sore <---");
        mahasiswa2.Sore();
        
        System.out.println();
        
        System.out.println("---> Kelas Ekstensi <---");
        mahasiswa5.Ekstensi();
        
        System.out.println();
        
        System.out.println("---> Kelas Terbuka <---");
        mahasiswa4.Terbuka();
    }
}
