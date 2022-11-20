public class methodObject{
    public static void main(String [] args){
        object object1 = new object();
        object1.nama = "Muammar rizal";
        System.out.println("Nama saya adalah : "+object1.nama);
        
        
        //contoh private
        belajar jange = new belajar();
        //jange.lahir = "Jakarta"; //hasilnya error

        
        //contoh protected
        protecteD jange2 = new protecteD();
        jange2.nama = "Jangss";
        System.out.println("Nama saya adalah " +jange2.nama);
        //contoh diatas menjelaskan bahwa variable nama bisa diakses diclass lain walau bersifat protected
        //namun jika di access dari package lain maka tidak bisa
    }
}