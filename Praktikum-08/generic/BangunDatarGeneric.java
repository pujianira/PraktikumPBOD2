/*
 * Nama : Pujiani Rahayu Agustin
 * NIM  : 24060122130067
 * File : BangunDatarGeneric.java
 * Deskripsi : kelas konstruksi generic untuk BangunDatar
 */

public class BangunDatarGeneric<T1 extends BangunDatar> {
    private T1 bangunDatar;

    public void set(T1 tipeBangunDatar) {
        bangunDatar = tipeBangunDatar;
    }

    public T1 get() {
        return bangunDatar;
    }

    public double hitungKeliling() {
        return bangunDatar.hitungKeliling();
    }
}
