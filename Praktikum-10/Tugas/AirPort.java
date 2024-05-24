/*Nama      : Pujiani Rahayu Agustin
  NIM       : 24060122130067
  Tanggal   : 24 Mei 2024
  File      : AirPort.java
*/

public class AirPort {
    private Airplane airplane;
    private String name;

    public AirPort(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Airplane getAirplane() {
        return airplane;
    }

    public void setAirplane(Airplane airplane) {
        this.airplane = airplane;
    }

    public String givePermissionToLand(IFlyer flyer) {
        flyer.land();
        return "Pendaratan telah diberi izin";
    }
}

