package hitung;

public class MatematikaBeraksi {
    public static void main(String[] args) {
        //membuat objek
        Matematika koko = new Matematika (7,9);
        
        System.out.println("Hasil penjumlahan: "+koko.setPenjumlahan());
        System.out.println("Hasil pengurangan: "+koko.setPengurangan());
        System.out.println("Hasil perkalian: "+koko.setPerkalian());
        System.out.println("Hasil pembagian: "+koko.setPembagian());
    }
}
