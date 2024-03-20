/* MLingkaran.java 20/3/2024
 * Penulis : Pujiani Rahayu Agustin
 * Deskripsi : implementasi cara menghitung luas lingkaran
 */

import java.util.Scanner;

public class MLingkaran {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Masukkan jejari lingkaran: ");
        double jejari = scan.nextDouble();
        Lingkaran L = new Lingkaran(jejari);
        System.out.println("Luas lingkaran dengan jejari " + jejari + " satuan adalah " + L.hitungLuas());
    }
}
