class iniPublic{
    public String nama;
}

class iniPrivate{
    private String nama;    
}

class iniProtected{
    protected String nama;
}

public class pertemuan2{
    public static void main (String [] args){ 
                    //PUBLIC
        /*
         public adalah KODE AKSES YANG BERSIFAT UMUM...DENGAN KATA LAIN DATA MAUPUN METHOD DALAM SUATU KODINGAN INI DAPET DIAKSES OLEH 
         SEMUA BAGIAN DALAM PROGRAM,BAIK DIDALAM MAUPUN DILUAR CLASS/PACKAGE
         */
        //CONTOH DARI PUBLIC
        iniPublic satu = new iniPublic();
        satu.nama = "Jange";
        System.out.println("Contoh dari public " +satu.nama);
        //DARI KODING DIATAS MENJELASKAN BAHWA VARIABLE NAMA BISA DIAKSES DICLASS LAIN KARENA BERSIFAT PUBLIC
        
                    //PRIVATE
        /*
         PRIVATE ADALAH KODE YANG DIBUAT BERSIFAT PRIVATE...DENGAN KATA LAIN DATA MAUPUN METHOD DIDALAM SUATU KODINGAN INI HANYA DAPAT 
         DIAKSES OLEH CLASS YANG DIMILIKI NYA SAJA
         */
        //CONTOH DARI PRIVATE
        iniPrivate privatee = new iniPrivate();
        //privatee.nama = "Muammar"; //ini akan error karena private hanya bisa diakses oleh class nya sendiri
        System.out.println("Contoh dari private"); //+privatee.nama);
        //DARI KODING DIATAS MENJELASKAN BAHWA VARIABLE NAMA TIDAK BISA DIAKSES DICLASS LAIN,KARENA PRIVATE HANYA BISA DIAKSES 
        //DICLASS ITU SENDIRI
        
        
                    //PROTECTED
        /*
         PROTECTED ADALAH KODE AKSES YANG MEMBUAT SUATU DATA ATAU METHOD YANG DIDEFINISIKAN DENGAN TINGKATAN AKSES INI DAPAT DIAKSES OLEH
         KELAS YANG DIMILIKINYA SAJA DAN JUGA KELAS" YANG MASIH MEMILIKI KETURUNAN(INHERITANCE)
         */
        //CONTOH DARI PROTECTED
        iniProtected tiga = new iniProtected();
        tiga.nama = "Rizal";
        System.out.println("Hallo "+tiga.nama);
        //DARI KODING DIATAS MENJELASKAN BAHWA VARIABLE NAMA BISA DIAKSES DICLASS LAIN KARENA CLASS pertemuan2 sudah menginstace 
        //dari class iniProtected.namun jika diacces dari dari package lain maka tidak bisa
        
        /*
         1.Dalam Variable
            Jika sebuah variable menggunakan static maka variable tersebut akan menjadi
            variable kelas. Nilainya akan selalu berubah jika ada perubahan di objeknya.
        
        2.Dalam Method
            Jika sebuah method menggunakan static maka untuk mengaksesnya tidak perlu
            menggunakan objek / instansiasi kelas nya dulu cukup
            NamaKelas.NamaMethode. Dan variable yang ada didalamnya haruslah static
            tidak boleh menggunakan variable biasa, kecuali variable dari instansiasi dan
            variable yang baru dideklarasikan dimethod tersebut.
         */
    }
}