//Nama  : Pujiani Rahayu Agustin
//NIM   : 24060122130067
//Praktikum PBO D2 Pertemuan 2
public class Garis {
    private Titik tAwal;
    private Titik tAkhir;

    public Garis(Titik tAwal, Titik tAkhir) {
        this.tAwal = tAwal;
        this.tAkhir = tAkhir;
    }

    public void setTitikAwal( Titik tAwal) {
        this.tAwal = tAwal;
    }

    public void setTitikAkhir( Titik tAkhir) {
        this.tAkhir = tAkhir;
    }

    public Titik getTitikAwal() {
        return this.tAwal;
    }

    public Titik getTitikAkhir() {
        return this.tAkhir;
    }

    public double getPanjang() {
        double x1 = getTitikAwal().getAbsis();
        double y1 = getTitikAwal().getOrdinat();
        double x2 = getTitikAkhir().getAbsis();
        double y2 = getTitikAkhir().getOrdinat();
        double p = x2-x1;
        double q = y2-y1;
        return Math.sqrt(p*p+q*q);
    }

    public double getGradien() {
        double x1 = getTitikAwal().getAbsis();
        double y1 = getTitikAwal().getOrdinat();
        double x2 = getTitikAkhir().getAbsis();
        double y2 = getTitikAkhir().getOrdinat();
        return (y2-y1)/(x2-x1);
    }

    public Garis getrefleksiY() {
        Titik t1 = tAwal.getrefleksiY();
        Titik t2 = tAkhir.getrefleksiY();
        return new Garis(t1, t2);
    }

    public boolean isTegakLurus(Garis G) {
        return this.getGradien() * G.getGradien() == -1;
    }
}
