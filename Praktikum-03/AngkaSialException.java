 /*
 * Nama     : Pujiani Rahayu Agustin
 * NIM      : 24060122130067
 * Tanggal  : 06 Maret 2024
 * File     : AngkaSialException.java
 * Deskripsi: Ekspresi buatan sendiri, menolak masukan angka 13!
 */
public class AngkaSialException extends Exception {
    public AngkaSialException() {
        super("jangan memasukkan angka 13 karena angka sial !!!");
    }
}
