/* Nama : Pujiani Rahayu Agustin
 * NIM  : 24060122130067
 * Praktikum PBO D2
 * 
 * 
 * Method overloading terjadi bila sebuah kelas memiliki beberapa metode 
 * dengan nama yang sama tapi parameter-parameternya berbeda
 * sehingga memungkinkan penggunaan nama yang sama untuk beberapa metode dalam sebuah class
 * syarat:
 * 1. Nama method sama
 * 2. Terdapat perbedaan pada jumlah parameter, tipe datanya, atau urutan tipe data paramternya
 * 3. Perbedaan tipe data saat return tetap dianggap overloading
 * 
 * contoh:
*/

public class No3A {
    // Method untuk mengurangkan dua bilangan bulat
    public int kurangi(int a, int b) {
        return a - b;
    }
    
    // Method untuk mengurangkan tiga bilangan bulat
    public int kurangi(int a, int b, int c) {
        return a - b - c;
    }
    
    // Method untuk mengurangkan dua bilangan pecahan
    public double kurangi(double a, double b) {
        return a - b;
    }
}
