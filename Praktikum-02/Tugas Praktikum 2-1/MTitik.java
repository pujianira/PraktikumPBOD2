//Nama  : Pujiani Rahayu Agustin
//NIM   : 24060122130067
//Praktikum PBO D2 Pertemuan 2
public class MTitik{
    public static void main(String[] args){
        Titik t1;
        Titik t2;

        t1 = new Titik();

        t2 = new Titik();

        t2.setAbsis(1);
        t2.setOrdinat(2);
        Titik t3 = new Titik(5,6);
        int counterTitik = Titik.getCounterTitik();

        Titik trefleksiX = t3.getrefleksiX();

        Titik trefleksiY = t3.getrefleksiY();

        System.out.printf("Jumlah objek titik: %d\n", counterTitik);
        System.out.printf("Titik t1 dengan absis: %.2f, ordinat : %.2f\n", t1.getAbsis(), t1.getOrdinat());
        System.out.printf("Titik t2 dengan absis: %.2f, ordinat : %.2f\n", t2.getAbsis(), t2.getOrdinat());
        System.out.printf("Titik t3 dengan absis: %.2f, ordinat : %.2f\n", t3.getAbsis(), t3.getOrdinat());
        System.out.printf("Jarak titik t3 dengan titik pusat: %.2f\n", t3.getJarakPusat());
        System.out.printf("Refleksi titik t1 terhadap sumbu x adalah (%.2f , %.2f)\n" , trefleksiX.getAbsis(), trefleksiX.getOrdinat());
        System.out.printf("Refleksi titik t1 terhadap sumbu y adalah (%.2f , %.2f)\n" , trefleksiY.getAbsis(), trefleksiY.getOrdinat());
    }
}