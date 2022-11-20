package pertemuan7;
import java.util.Scanner;
public class latihan{
    public String nama,npm,jurusan;
    public double nilaiAkhir;
    private String kelas;
    //ini construktor
    latihan(String nama,String npm,String jurusan,String kelas){
        this.nama = nama;
        this.npm = npm;
        this.jurusan = jurusan;
        this.kelas = kelas;
    }
    
    //method dataMhs
    public void dataMhs(){
        System.out.println("Nama        :"+this.nama);
        System.out.println("NPM         :"+this.npm);
        System.out.println("JURUSAN     :"+this.jurusan);
    }
    
    //pemanggilan memakai return
    String panggil(){
        return "Perkenalkan nama saya adalah "+this.nama+" npm saya "+this.npm+" dan saya jurusan "+this.jurusan;
    }
        
    //method pembagian hasil dari nilai semester 1-4
    double ipk (double sms1,double sms2,double sms3,double sms4){
        nilaiAkhir = (sms1 + sms2 + sms3 + sms4) / 4;
        return nilaiAkhir;
    }
    
    //aksi
    public static void Main(String [] rizal){
        //instansiasi scanner
        Scanner s = new Scanner(System.in);
        String nama,npm,jurusan,kelas;
        double sms1,sms2,sms3,sms4;
        System.out.println("=======================================================================================");
        System.out.println("INPUT DATA");
        System.out.print("Masukan NAMA           : "); nama=s.nextLine();
        System.out.print("Masukan NPM            : "); npm=s.nextLine();
        System.out.print("Masukan JURUSAN        : "); jurusan=s.nextLine();
        System.out.print("Masukan KELAS        : "); kelas=s.nextLine();
        System.out.print("Masukan NILAI Semester 1      : "); sms1=s.nextDouble();
        System.out.print("Masukan NILAI Semester 2      : "); sms2=s.nextDouble();
        System.out.print("Masukan NILAI Semester 3      : "); sms3=s.nextDouble();
        System.out.print("Masukan NILAI Semester 4      : "); sms4=s.nextDouble();
        System.out.println("=======================================================================================");
        System.out.println("DATA SAYA");
        //Instansiasi latihan
        latihan obj = new latihan(nama,npm,jurusan,kelas);
        obj.dataMhs();
        obj.panggil();
        System.out.println("=======================================================================================");
        System.out.println("HASIL NILAI");
        System.out.println("=======================================================================================");
        System.out.println("NILAI IPS Semester 1        : "+sms1);
        System.out.println("NILAI IPS Semester 2        : "+sms2);
        System.out.println("NILAI IPS Semester 3        : "+sms3);
        System.out.println("NILAI IPS Semester 4        : "+sms4);
        System.out.println("Hasil nilai ipk saya        : "+obj.ipk(sms1,sms2,sms3,sms4));
        System.out.println("=======================================================================================");
    }
    
}