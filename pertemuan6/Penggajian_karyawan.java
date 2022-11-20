package pertemuan6;
class Penggajian_karyawan{
    int gapok,lembur,bonus,pinjaman;
    int total;
    String nama, nik,jenis_kelamin ;
    
    public void data () {
        System.out.println("Gaji          \t\t \t\t" +this.gapok);
        System.out.println("Lembur        \t\t \t\t" +this.lembur);
        System.out.println("Bonus         \t\t \t\t" +this.bonus);
        System.out.println("Pinjaman      \t\t \t\t" +this.pinjaman);
        
    }
    
    public void data1() {
        System.out.println("Gaji          \t\t \t\t" +gapok);
        System.out.println("Lembur        \t\t \t\t" +lembur);
        System.out.println("Bonus         \t\t \t\t" +bonus);
        System.out.println("Pinjaman      \t\t \t\t" +pinjaman);    
    }
    
    int total() {
        total = gapok + lembur + bonus - pinjaman ;
        return total;
    }
}
