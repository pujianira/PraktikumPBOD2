/*Nama      : Pujiani Rahayu Agustin
  NIM       : 24060122130067
  Tanggal   : 24 Mei 2024
  File      : ArmadaKendaraan.java
*/

import java.util.ArrayList;
import java.util.Collection;

public class ArmadaKendaraan {
    private ArrayList<Vehicle> daftarArmada;

    public ArmadaKendaraan() {
        daftarArmada = new ArrayList<>();
    }

    public void tambahArmada(Collection<? extends Vehicle> armada) {
        daftarArmada.addAll(armada);
    }

    public ArrayList<Vehicle> getAllArmada() {
        return daftarArmada;
    }
}