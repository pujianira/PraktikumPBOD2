/* Nama : Pujiani Rahayu Agustin
 * NIM  : 24060122130067
 * Praktikum PBO Lab D2
 */

public class Pegawai {
    private String nama;
    private int gajiPokok = 5000000;

    public Pegawai(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public int getGajiPokok() {
        return gajiPokok;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setGajiPokok(int gajiPokok) {
        this.gajiPokok = gajiPokok;
    }

    public void tampilData() {
        System.out.println("Nama: " + nama + ", Gaji Pokok: " + gajiPokok);
    }
}