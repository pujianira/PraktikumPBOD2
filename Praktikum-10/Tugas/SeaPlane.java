/*Nama      : Pujiani Rahayu Agustin
  NIM       : 24060122130067
  Tanggal   : 24 Mei 2024
  File      : SeaPlane.java
*/

public class SeaPlane extends Airplane {
    private double maxLoad;

    public SeaPlane() {
        this.maxLoad = maxLoad;
    }

    public double getSPMaxLoad() {
        return maxLoad;
    }

    public void setSPMaxLoad(double maxLoad) {
        this.maxLoad = maxLoad;
    }

    public double calcFuelEfficiency() {
        return maxLoad * 0.003; //asumsi: penghitungannya adalah maxLoad * 0.0001
    }

    public double calcTripDistance() {
        return calcFuelEfficiency() * 80; 
        // asumsi: perhitungannya mengalikan efisiensi fuel dengan jarak konsumsi fuel pada umumnya
    }

    public void takeOff() {
        System.out.println("SeaPlane sedang lepas landas dari air");
    }

    public void land() {
        System.out.println("SeaPlane sedang mendarat di air");
    }

    public void fly() {
        System.out.println("SeaPlane sedang terbang");
    }

    public String toString() {
        return "SeaPlane dapat take-off dan mendarat di perairan laut";
    }
}
