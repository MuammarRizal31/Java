package UTS1;
import java.util.Scanner;
public class kelontong{
    int total;
    public void barang(){
        System.out.println("Pilihan Kode \t| nama Barang \t | Harga ");
        System.out.println("101 \t\t| Gula pasir     |10000  \n"+
                           "201 \t\t| Indomie Goreng |3500   \n"+
                           "301 \t\t| Minyak Goreng  |14000  \n"+
                           "401 \t\t| Beras          |85000"
        );
        System.out.println("===================================================");
    }
    int total(int barang,int jumlah){
        total = barang * jumlah;
        return total;
    }
    void bonus(){
        if(total < 100000){
            System.out.println("Gratis 2 Sachet Kopi");
        }else if(total >= 100000 && total < 250000){
            System.out.println("Gratis 5 bungkus indomie");
        }else if(total >= 250000){
            System.out.println("Gratis 1 liter minyak goreng");
        }
    }
}