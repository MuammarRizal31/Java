package pertemuan6;
public class construktor{
    //konstruktor adalah methhod yang sama persis dengan nama class nya
    //konstruktor sendiri berfungsi untuk memberikan nilai awal pada sebuah class ketika class tersebut dibuat dalam bentuk objek pada class lain
    //konstruktor bisa memiliki parameter dan bisa juga tidak
    //dalam konstruktor,tidak boleh pakai keyword void
    //konstruktor tidak memiliki return value
    //konstruktor tidak dapat diwarisi,harus menggunakan keyword super
    String nama;
    int npm,a,b;
    
    //contoh konstruktor tanpa parameter
    void info(){
        int c = this.a + this.b;
        System.out.println("Pertambahan dari "+this.a + " dan "+this.b+" Adalah "+c);
    }
    
    construktor (String nama1,int umur){
        this.nama = nama1;
        this.npm = umur;
    }
    void infoNama(){
        System.out.println("=====================================================");
        System.out.println("Hello nama saya adalah "+this.nama);
        System.out.println("NPM saya adalah "+this.npm);
        System.out.println("=====================================================");
    }
    
    construktor(int a,int b){
        this.a = a;
        this.b = b;
    }
}