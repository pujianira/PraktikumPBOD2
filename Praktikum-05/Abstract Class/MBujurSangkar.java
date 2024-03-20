/* MBujurSangkar.java 20/3/2024
 * Penulis : Pujiani Rahayu Agustin
 * Deskripsi : kelas yang mengimplementasikan cara menghitung luas bujur sangkar
 */

import java.util.Scanner;

public class MBujurSangkar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        BujurSangkar bs = new BujurSangkar();
        System.out.println("Masukkan sisi bujur sangkar: ");
        double sisi = scan.nextDouble();
        System.out.println("Luas bujur sangkar dengan sisi " + sisi + " satuan adalah " + bs.hitungLuas(sisi));
    }
}
