package pertemuan6;
public class latihan1{
    String nama,npm,jurusan;
    double ipk,ipk1,ipk2,ipk3,ipk4;
    latihan1(String iNama1,String iNpm1,String iJurusan){
        this.nama = iNama1;
        this.npm = iNpm1;
        this.jurusan = iJurusan;
    }
                
    latihan1 (double ipk1,double ipk2,double ipk3,double ipk4){
        this.ipk1 = ipk1;
        this.ipk2 = ipk2;
        this.ipk3 = ipk3;
        this.ipk4 = ipk4;
    }
    
    void mhs(){
        System.out.println("\t\tDATA MAHASISWA");
        System.out.println("Nama mahasiswa : "+this.nama);
        System.out.println("NPM mahasiswa : "+this.npm);
        System.out.println("Jurusan mahasiswa : "+this.jurusan);
    }
    
    void ipkLakiLaki(){
        System.out.println("IPK 1 : "+this.ipk1);
        System.out.println("IPK 2 : "+this.ipk2);
        System.out.println("IPK 3 : "+this.ipk3);
        System.out.println("IPK 4 : "+this.ipk4);
    }
    
    void ipkPerempuan(){
        System.out.println("IPK 1 : "+this.ipk1);
        System.out.println("IPK 2 : "+this.ipk2);
        System.out.println("IPK 3 : "+this.ipk3);
        System.out.println("IPK 4 : "+this.ipk4);
    }
    
    double ipk(){   
        this.ipk =(this.ipk1 + this.ipk2 + this.ipk3 + this.ipk4) / 4;
        return this.ipk;
    }
}