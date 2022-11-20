package pertemuan6;
import java.util.Scanner;
public class Laki_Perempuan {
    public static void main (String [] arya) {
        Scanner quis = new Scanner(System.in);
        Penggajian_karyawan a = new Penggajian_karyawan();
        
        System.out.println("Masukan nama[admin] :");
        a.nama  = quis.nextLine();
        System.out.println("Masukan nama[karyawan] :");
        a.nama  = quis.nextLine();
        System.out.println("Masukan NIK :");
        a.nik   = quis.nextLine();
        System.out.println("Masukan Jenis Kelamin :");
        a.jenis_kelamin = quis.nextLine();
        System.out.println("Masukan Gaji Pokok :");
        a.gapok   = quis.nextInt();
        System.out.println("Masukan Lemburan :");
        a.lembur   = quis.nextInt();
        System.out.println("Masukan Bonus :");
        a.bonus   = quis.nextInt();
        System.out.println("Masukan Pinjaman :");
        a.pinjaman   = quis.nextInt();
        
        a.data();
        System.out.println("Total Gaji :" +a.total());
    }
}