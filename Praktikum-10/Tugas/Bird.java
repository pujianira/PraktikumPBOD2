/*Nama      : Pujiani Rahayu Agustin
  NIM       : 24060122130067
  Tanggal   : 24 Mei 2024
  File      : Bird.java
*/

public class Bird extends Animal implements IFlyer {
    
    public Bird() {

    }

    public void takeOff() {
        System.out.println("Burung sedang mengepakkan sayapnya dari ranting pohon");
    }

    public void land() {
        System.out.println("Burung sedang mendarat di ranting pohon");
    }

    public void fly() {
        System.out.println("Burung sedang terbang ke udara");
    }

    public void buildNest() {
        System.out.println("Burung sedang membuat sarang di pohon");
    }

    public void layEggs() {
        System.out.println("Burung sedang bertelur di sarangnya");
    }

    public void eat() {
        System.out.println("Burung sedang makan biji-bijian atau serangga");
    }

    public String toString() {
        return "Burung adalah kelompok animalia kelas aves";
    }
}