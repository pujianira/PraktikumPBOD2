/*
 * Nama : Pujiani Rahayu Agustin
 * NIM  : 24060122130067
 * File : Main.java
 */

public class Main {
    public static void main(String[] args) {
        Ulat K = new Ulat();
        Data<Kupu> anu = new Data<>();
    
        Kepompong kepompong = new Kepompong();
        KupuDewasa kupuDewasa = new KupuDewasa();
    
        anu.setIsi(K);
        anu.getIsi().gerak();
    
        anu.setIsi(kepompong);
        anu.getIsi().gerak();
    
        anu.setIsi(kupuDewasa);
        anu.getIsi().gerak();
    }
}
