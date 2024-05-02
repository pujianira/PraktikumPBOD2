/* Nama : Pujiani Rahayu Agustin
 * NIM  : 24060122130067
 * Praktikum PBO Lab D2
 */

public class Programmer extends Pegawai {
    private int bonus = 450000;

    public Programmer (String nama) {
        super(nama);
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    public int getGajiPokok() {
        return super.getGajiPokok();
    }

    public void tampilData() {
        super.tampilData();
        System.out.println("Tunjangan: " + bonus);
    }
}
