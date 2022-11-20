package pertemuan6;
public class parameter{
    //parameter dengan type data sama 
    public int luas(int a,int b){
        return a * b;
    }
    
    //parameter dengan type beda 
    public double hitung(int a,double b){
        return a * 0.5 * b;
    }
    
    public double luas(int d){
        double r = 0.5 * d;
        return 3.14 * r * r;
    }
    
    public static void main(String [] rizal){
        parameter lk = new parameter();
        System.out.println("Luasnya : "+lk.luas(10,90));
        
    }
    
}