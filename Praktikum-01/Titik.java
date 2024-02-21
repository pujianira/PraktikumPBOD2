// File : Titik.java          21/02/24
// Penulis : Pujiani Rahayu Agustin
// Deskripsi : Kelas Titik yang merupakan sebuah titik dengan absis dan ordinat

public class Titik{
    double absis;
    double ordinat;
    static int counterTitik;

    Titik(){
        absis = 0;
        ordinat = 0;
        counterTitik++;
    }

    Titik(double a, double o){
        absis = a;
        ordinat = o;
        counterTitik++;
    }

    void setAbsis(double a){
        absis = a;
    }

    void setOrdinat(double o){
        ordinat = o;
    }

    double getAbsis(){
        return absis;
    }

    double getOrdinat(){
        return ordinat;
    }

    static int getCounterTitik(){
        return counterTitik;
    }
}