import java.util.Scanner;
class mainMethod extends contohMethod{
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        contohMethod mtd = new contohMethod();
        
        System.out.print("Masukan nama : \t\t\t");
        mtd.nama = input.nextLine();
        System.out.print("Masukan Alamat : \t\t\t");
        mtd.alamat = input.nextLine();
        System.out.print("Masukan no telp : \t\t\t");
        mtd.tlp = input.nextInt();
        
        System.out.println("Masukan biaya pendaftaran \t\tRp. ");
        mtd.daftar = input.nextInt();
        System.out.println("
    }
}