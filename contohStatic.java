public class contohStatic{
    static int bilangan = 1;
    int angka = 2;
    
    public void perubahan(){
        bilangan += 9;
        angka += 8;
        System.out.println("Hasil dari bilangan + angka adalah "+bilangan+angka);
    }
    
    public static void main(String[] args){
        contohStatic vs1 =new contohStatic();
        System.out.println();
        System.out.println("Hasil dari vs1 adalah ");
        vs1.perubahan();
        
        contohStatic vs2 =new contohStatic();
        System.out.println("Hasil dari vs2 adalah ");
        vs2.perubahan();
    }
}