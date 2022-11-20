package pertemuan6;
import java.util.Scanner;
public class latihan2{
    public static void main(String [] args){
        String nama,npm,kelas;
        double ipk1,ipk2,ipk3,ipk4;
        Scanner sc = new Scanner(System.in);
        System.out.println("========================================================================");
        System.out.println("\t\tINPUT NILAI MAHASISWA LAKI-LAKI");
        System.out.println("========================================================================");
        System.out.print("Masukan nama : "); nama=sc.nextLine();
        System.out.print("Masukan NPM : "); npm=sc.nextLine();
        System.out.print("Masukan jurusan : "); kelas=sc.next();
        System.out.print("Masukan nilai ipk 1 : "); ipk1=sc.nextDouble();
        System.out.print("Masukan nilai ipk 2 : "); ipk2=sc.nextDouble();
        System.out.print("Masukan nilai ipk 3 : "); ipk3=sc.nextDouble();
        System.out.print("Masukan nilai ipk 4 : "); ipk4=sc.nextDouble();
        System.out.println("=========================================================================");
        System.out.println("\t\tHASIL DARI INPUTAN");
        System.out.println("=========================================================================");
        latihan1 dataMhsL = new latihan1(nama,npm,kelas);
        latihan1 nilaiMhsL = new latihan1(ipk1,ipk2,ipk3,ipk4);
        dataMhsL.mhs();
        nilaiMhsL.ipkLakiLaki();
        System.out.println("Nilai akhir nya adalah : "+ nilaiMhsL.ipk());
        System.out.println("=========================================================================");
        
        System.out.println();
        
        System.out.println("\t\tINPUT NILAI MAHASISWA PEREMPUAN");
        System.out.println("=========================================================================");
        System.out.print("Masukan nama : "); nama=sc.next();
        System.out.print("Masukan NPM : "); npm=sc.next();
        System.out.print("Masukan jurusan : "); kelas=sc.next();
        System.out.print("Masukan nilai ipk 1 : "); ipk1=sc.nextDouble();
        System.out.print("Masukan nilai ipk 2 : "); ipk2=sc.nextDouble();
        System.out.print("Masukan nilai ipk 3 : "); ipk3=sc.nextDouble();
        System.out.print("Masukan nilai ipk 4 : "); ipk4=sc.nextDouble();
        System.out.println("=========================================================================");
        System.out.println("\t\tHASIL DARI INPUTAN");
        System.out.println("=========================================================================");
        latihan1 dataMhsP = new latihan1(nama,npm,kelas);
        latihan1 nilaiMhsP = new latihan1(ipk1,ipk2,ipk3,ipk4);
        dataMhsP.mhs();
        nilaiMhsP.ipkPerempuan();
        System.out.println("Nilai akhir nya adalah : "+ nilaiMhsP.ipk());
        System.out.println("=========================================================================");
    }
}