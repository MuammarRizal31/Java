package UTS1;
import java.util.Scanner;
public class salon{
    public static void main(String [] rizal){
        Scanner jx = new Scanner(System.in);
        kelontong br = new kelontong();
        String namaBarang,inp;
        int hGula,hIndomie,hMinyak,hBeras;
        int hargaBarang,JumlahBarang,kodeBarang;
        char nge;
    
        System.out.println("===================================================");
        System.out.println("            SELAMAT DATANG DI TOKO MUAMMAR PLACE   ");
        System.out.println("===================================================");
        br.barang();
        System.out.println("Ada yang bisa dibantu ? [y/t]"); inp = jx.nextLine();
        String y = "y";
        while(inp == y){
        System.out.print("Silahkan pilih kode barang : "); kodeBarang = jx.nextInt();
        if(kodeBarang == 101){
            hGula = 10000;
            System.out.print("Masukan jumlah barang      : "); JumlahBarang = jx.nextInt();
            System.out.println("Jumlah yang harus dibayar  : Rp"+br.total(hGula,JumlahBarang));
        }else if(kodeBarang == 201){
            hIndomie = 3500;
            System.out.print("Masukan jumlah barang      : "); JumlahBarang = jx.nextInt();
            System.out.println("Jumlah yang harus dibayar  : Rp"+br.total(hIndomie,JumlahBarang));
        }else if(kodeBarang == 301){
            hMinyak = 14000;
            System.out.print("Masukan jumlah barang      : "); JumlahBarang = jx.nextInt();
            System.out.println("Jumlah yang harus dibayar  : Rp"+br.total(hMinyak,JumlahBarang));
        }else if(kodeBarang == 401){
            hBeras = 85000;
            System.out.print("Masukan jumlah barang      : "); JumlahBarang = jx.nextInt();
            System.out.println("Jumlah yang harus dibayar  : Rp"+br.total(hBeras,JumlahBarang));
        }
        br.bonus();
    }
    System.out.println("Terima kasih besok kesini lagi yaa...hehehe");
    }
}
