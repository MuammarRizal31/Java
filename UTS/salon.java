package UTS;
import java.util.Scanner;
class salon{
    public static void main(String [] rizal){
    Scanner rz = new Scanner(System.in);
    String nama,noTlp,inp;
    int pilih;
    System.out.println("======================================================");
    System.out.println("----Selamat Datang Di Salon Cantiks-----");
    System.out.println("======================================================");
    System.out.println("Lakukan transakasi ? [y/t]"); inp = rz.nextLine();
    while(inp == "y"){
        System.out.println("Menu Pilihan yang Tersedia : \n 1.Peratawan \n 2.Penyewaan"); 
        System.out.print("===========================^========================");
        System.out.print("Pilihan Menu : ");pilih = rz.nextInt();pilih = rz.nextInt();
        System.out.print("===========================^========================");
        switch(pilih){
            case 1:
                System.out.println("*Jenis Perawatan*");
                System.out.println("Menu Pilihan yang tersedia : \n1.Facial Wajah\n2.Masker\n3.Potong Rambut");
                System.out.println("========================================================");
                System.out.print("Pilihan Anda : "); pilih = rz.nextInt();
                System.out.println("========================================================");
                
        }
    }
    }
}