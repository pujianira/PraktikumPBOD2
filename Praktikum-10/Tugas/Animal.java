/*Nama      : Pujiani Rahayu Agustin
  NIM       : 24060122130067
  Tanggal   : 24 Mei 2024
  File      : Animal.java
*/

public abstract class Animal {
    public abstract void eat();
    
    public String toString() {
        return this.getClass().getSimpleName();
    }
}
