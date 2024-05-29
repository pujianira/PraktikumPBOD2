import java.util.*;

public class MahasiswaMap {
    public static void main(String[] args) {
        Map<String, String> mhs = new HashMap<String, String>();
        mhs.put("24060122130067", "Pujiani Rahayu Agustin");
        mhs.put("24060122130055", "Asy'syifa Shabrina Munir");
        mhs.put("24060122130063", "Keisya Intan Nabila");
        mhs.put("24060122120023", "Happy Desita Widyantari");
        mhs.put("24060122120027", "Yesi Dwi Ningtias");
        mhs.put("24060122130071", "Muthia Zhafira Sahnah");
        mhs.put("24060122130049", "Syakira Nada Nirwana");
        mhs.put("24060122120023", "Happy Desita Widyantari");

        //lambda digunakan sebagai parameter
        mhs.forEach((nim, nama) -> System.out.println(nim +"\t"+ nama));
    }
}
