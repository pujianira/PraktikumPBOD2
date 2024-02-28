//Nama  : Pujiani Rahayu Agustin
//NIM   : 24060122130067
//Praktikum PBO D2 Pertemuan 2
public class Titik{
    public double absis;
    public double ordinat;
    public static int counterTitik;

    public Titik(){
        absis = 0;
        ordinat = 0;
        counterTitik++;
    }

    public Titik(double a, double o){
        absis = a;
        ordinat = o;
        counterTitik++;
    }

    public void setAbsis(double a){
        absis = a;
    }

    public void setOrdinat(double o){
        ordinat = o;
    }

    public double getAbsis(){
        return absis;
    }

    public double getOrdinat(){
        return ordinat;
    }

    public static int getCounterTitik(){
        return counterTitik;
    }

    public double getJarakPusat() {
        return Math.sqrt(Math.pow(this.absis, 2) + Math.pow(this.ordinat, 2));
    }

    public void refleksiX() {
        this.ordinat *= -1;
    }

    public void refleksiY() {
        this.absis *= -1;
    }

    public Titik getrefleksiX() {
        return new Titik(this.absis, -this.ordinat);
    }

    public Titik getrefleksiY() {
        return new Titik(-this.absis, this.ordinat);
    }
}