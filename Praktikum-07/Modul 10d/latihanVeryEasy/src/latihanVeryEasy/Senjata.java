/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihanVeryEasy;

/* Nama : Pujiani Rahayu Agustin
 * NIM  : 24060122130067
 * Praktikum PBO Lab D2
 */
public class Senjata {
    private String bunyi;
    private int peluru;
    
    public Senjata(String bunyi) {
        this.bunyi = bunyi;
    }
    
    public String getBunyi() {
        return bunyi;
    }
    
    public int getPeluru() {
        return peluru;
    }
    
    public void menembak() {
        System.out.println(getBunyi() + " ");
        setPeluru(getPeluru()-1);
        System.out.println("Sisa Peluru: " + getPeluru());
    }
    
    public void setBunyi(String bunyi) {
        this.bunyi = bunyi;
    }
     
    public void setPeluru(int peluru) {
        this.peluru = peluru;
    }
}
