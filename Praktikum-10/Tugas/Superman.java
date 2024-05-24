/*Nama      : Pujiani Rahayu Agustin
  NIM       : 24060122130067
  Tanggal   : 24 Mei 2024
  File      : Superman.java
*/

public class Superman extends Kryptonian {
    private String name;

    public Superman(String name) {
        this.name = name;
    }

    public void takeOff() {
        System.out.println(name + " sedang menuju ke angkasa");
    }

    public void land() {
        System.out.println(name + " sedang mendarat");
    }

    public void fly() {
        System.out.println(name + " sedang terbang di udara");
    }

    public void leapBuilding() {
        System.out.println(name + " melompati gedung tinggi dalam satu lompatan");
    }

    public void stopBullet() {
        System.out.println(name + " menghentikan peluru dengan tubuhnya");
    }

    public void eat() {
        System.out.println(name + " sedang makan untuk mendapatkan energi");
    }

    public String toString() {
        return name + " adalah superhero dari Planet Krypton";
    }
}
