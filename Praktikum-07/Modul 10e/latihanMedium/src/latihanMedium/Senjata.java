/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihanMedium;

/* Nama : Pujiani Rahayu Agustin
 * NIM  : 24060122130067
 * Praktikum PBO Lab D2
 */
public class Senjata {
    private String bunyi;
    private boolean menusuk;
    private int peluru;
    
    public Senjata(String bunyi) {
        this.bunyi = bunyi;
        this.menusuk = false;
    }
    
    public String getBunyi() {
        return bunyi;
    }
    
    public int getPeluru() {
        return peluru;
    }
    
    public boolean isMenusuk() {
        return menusuk;
    }
    
    public void setBunyi(String bunyi) {
        this.bunyi = bunyi;
    }
    
    public void setMenusuk(boolean menusuk) {
        this.menusuk = menusuk;
    }
    
    public void setPeluru(int peluru) {
        this.peluru = peluru;
    }
}
