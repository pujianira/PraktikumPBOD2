/*
 * Nama : Pujiani Rahayu Agustin
 * NIM  : 24060122130067
 * File : MapTest.java
 * Deskripsi : Program yang menggunakan generic
 *             untuk pasangan Kunci-Nilai
 */

import java.util.*;

public class MapTest {
    public static void main(String[] args) {
        //kunci -> integer, nilai -> string
        Map<Integer, String> map = new HashMap<Integer, String>();
        //menempatkan elemen kunci dan nilai
        map.put(1, "satu");
        map.put(2, "dua");
        //mengambil elemen pertama
        System.out.println(map.get(1));
        System.out.println(map.get(2));
        //mengambil keseluruhan kunci sebagai objek collection Set
        Set<Integer> keys = map.keySet();
        //bagaimana iterasi untuk mengambil keseluruhan nilai dari kunci?
               for (Integer key : keys ) {
            System.out.println(key + " : " + map.get(key));
        }
    }
}
