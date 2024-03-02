//Nama  : Pujiani Rahayu Agustin
//NIM   : 24060122130067
//Praktikum PBO D2 Pertemuan 2
public class MGaris {
    public static void main(String[] args){
        Titik t1;
        Titik t2;
        Garis g;

        t1 = new Titik();
        t2 = new Titik();

        t1.setAbsis(5);
        t1.setOrdinat(2);

        t2.setAbsis(7);
        t2.setOrdinat(4);

        Titik t3 = new Titik(3, 8);

        g = new Garis(t1, t2);
        Garis g1 = new Garis(t2, t3);
        Garis g2 = new Garis(t1, t3);
        Garis grefY = g.getrefleksiY();
        
        System.out.printf("Panjang garis g: %f\n", g.getPanjang());
        System.out.printf("Gradien garis g: %.2f\n", g.getGradien());
        System.out.printf("Refleksi garis g terhadap sumbu Y adalah (%.2f , %.2f) dan (%.2f , %.2f)\n" , grefY.getTitikAwal().getAbsis(), grefY.getTitikAwal().getOrdinat(), grefY.getTitikAkhir().getAbsis(), grefY.getTitikAkhir().getOrdinat());
        System.out.printf("Apakah garis g tegak lurus garis g1? %s \n", g.isTegakLurus(g1));
        System.out.printf("Apakah garis g tegak lurus garis g2? %s \n", g.isTegakLurus(g2));
    }
}
