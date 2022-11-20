package pertemuan6;
import java.util.Scanner;
public class latihan{
    public static void main(String [] rizal){
        int a,b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukan nilai 1 : "); a = sc.nextInt();
        System.out.println("Masukan nilai 2 : "); b = sc.nextInt();
        construktor na = new construktor(a,b);
        construktor na2 = new construktor("Jange",9123);
        na2.infoNama();
        na.info();
    }    
}