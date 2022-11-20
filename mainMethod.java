import java.util.Scanner;
class mainMethod extends contohMethod{
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        contohMethod mtd = new contohMethod();
        
        System.out.println("=====================================================");
        System.out.println("===================INPUT DATA========================");
        System.out.println("=====================================================");
        System.out.print("Masukan nama : \t\t\t");
        mtd.nama = input.nextLine();
        System.out.print("Masukan Alamat : \t\t");
        mtd.alamat = input.nextLine();
        System.out.print("Masukan no telp : \t\t");
        mtd.tlp = input.nextInt();
        
        System.out.println("=====================================================");
        System.out.println("===================INPUT PEMBAYARAN==================");
        System.out.println("=====================================================");
        System.out.print("Masukan biaya pendaftaran \tRp. ");
        mtd.daftar = input.nextInt();
        System.out.print("Masukan Biaya Chat \t\tRp. ");
        mtd.obat = input.nextInt();
        System.out.print("Masukan biaya vitamin \t\tRp. ");
        mtd.vitamin = input.nextInt();
        System.out.println("=====================================================");
        System.out.println("===================HASIL INPUT=======================");
        System.out.println("=====================================================");
        mtd.data();
        System.out.println("=====================================================");
        System.out.println("=====================================================");
        System.out.println("===================TOTAL BAYAR=======================");
        System.out.println("=====================================================");
        System.out.println("\nTotal biaya yang dibayar pasien \t\tRp. "+mtd.administrasion());
        System.out.println("=====================================================");
    }   
}