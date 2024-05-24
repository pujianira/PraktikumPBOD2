/*Nama      : Pujiani Rahayu Agustin
  NIM       : 24060122130067
  Tanggal   : 24 Mei 2024
  File      : Vehicle.java
*/

public abstract class Vehicle {
    public double calcFuelEfficiency() {
        return 0.0;
    }

    public double calcTripDistance() {
        return 0.0;
    }

    public String toString() {
        return this.getClass().getSimpleName();
    }
}