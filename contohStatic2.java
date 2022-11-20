public class contohStatic2{
    int a = 15;
    public static void biasa(){
        //a = 5; //variable tidak bisa dipakai kecuali pakai object
        int b = 9;
        System.out.println("Nilai B : "+b);
        contohStatic2 ms = new contohStatic2();
        System.out.println("Nilai A adalah : "+ms.a);
        //untuk mengakses nilai A harus di instansiasi dulu
    }
    
    public static void main(String [] args){
        contohStatic2.biasa();
        //untuk memanggil nya tidak perlu pakai object;
        biasa();
        //langsung memanggil;
    }
}