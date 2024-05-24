/*Nama      : Pujiani Rahayu Agustin
  NIM       : 24060122130067
  Tanggal   : 24 Mei 2024
  File      : Helicopter.java
*/

public class Helicopter extends Airplane {
    private double maxLoad;

    public Helicopter() {
        this.maxLoad = maxLoad;
    }

    public double calcFuelEfficiency() {
        return maxLoad * 0.002; //asumsi: penghitungannya adalah maxLoad * 0.0001
    }

    public double calcTripDistance() {
        return calcFuelEfficiency() * 90; 
        // asumsi: perhitungannya mengalikan efisiensi fuel dengan jarak konsumsi fuel pada umumnya
    }

    public void takeOff() {
        System.out.println("Helikopter sedang lepas landas");
    }

    public void land() {
        System.out.println("Helikopder sedang mendarat");
    }

    public void fly() {
        System.out.println("Helikopter sedang terbang");
    }

    public String toString() {
        return "Helicopter hanya memerlukan landasan kecil";
    }
}
