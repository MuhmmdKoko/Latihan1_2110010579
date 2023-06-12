package hitung;

public class Matematika {
    //membuat variabel
    private double bil1, bil2;
    
    //membuat constructor
    public Matematika (double bil1, double bil2){
        this.bil1 = bil1;
        this.bil2 = bil2;
    }
    
    double setPenjumlahan(){
        return bil1 + bil2;
    }
}