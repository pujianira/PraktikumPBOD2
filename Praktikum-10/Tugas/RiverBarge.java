/*Nama      : Pujiani Rahayu Agustin
  NIM       : 24060122130067
  Tanggal   : 24 Mei 2024
  File      : RiverBarge.java
*/

public class RiverBarge extends Vehicle {
    private double maxLoad;

    public RiverBarge() {
        this.maxLoad = maxLoad;
    }

    public double getRBMaxLoad() {
        return maxLoad;
    }

    public void setRBMaxLoad(double maxLoad) {
        this.maxLoad = maxLoad;
    }

    public double calcFuelEfficiency() {
        return maxLoad * 0.002; //asumsi: penghitungannya adalah maxLoad * 0.0001
    }

    public double calcTripDistance() {
        return calcFuelEfficiency() * 70; 
        // asumsi: perhitungannya mengalikan efisiensi fuel dengan jarak konsumsi fuel pada umumnya
    }
}
