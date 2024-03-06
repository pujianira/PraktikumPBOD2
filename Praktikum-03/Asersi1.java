/*
 * Nama     : Pujiani Rahayu Agustin
 * NIM      : 24060122130067
 * Tanggal  : 06 Maret 2024
 * File     : Asersi1.java
 * Deskripsi: Program untuk menunjukkan asersi
 */
public class Asersi1 {
    public static void main(String[] args) {
        int x = 0;
        if (x > 0) {
            System.out.println("x bilangan positif");
        }
        else {
            assert (x < 0): "ada kesalahan kode";
            System.out.println("x bilangan negatif");    
        }
    }
}