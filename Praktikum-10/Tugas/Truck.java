/*Nama      : Pujiani Rahayu Agustin
  NIM       : 24060122130067
  Tanggal   : 24 Mei 2024
  File      : Truck.java
*/

public class Truck extends Vehicle {
    private double maxLoad;

    public Truck() {
        this.maxLoad = maxLoad;
    }

    public double getTruckMaxLoad() {
        return maxLoad;
    }

    public void setTruckMaxLoad(double maxLoad) {
        this.maxLoad = maxLoad;
    }

    public double calcFuelEfficiency() {
        return maxLoad * 0.001; //asumsi: penghitungannya adalah maxLoad * 0.0001
    }

    public double calcTripDistance() {
        return calcFuelEfficiency() * 100; 
        // asumsi: perhitungannya mengalikan efisiensi fuel dengan jarak konsumsi fuel pada umumnya
    }

    public String toString() {
        return "Truck adalah angkutan darat yang sangat handal";
    }
}
