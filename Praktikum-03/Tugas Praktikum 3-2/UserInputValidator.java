/*Nama      : Pujiani Rahayu Agustin
  NIM       : 24060122130067
  Tanggal   : 9 Februari 2023
  File      : UserInputValidator.java
  Deskripsi : Kelas UserInputValidator untuk menvalidasi masukan username, email, dan umur
              pada aplikasi perpustakaan digital untuk pengguna baru
*/

import java.util.regex.Pattern;

public class UserInputValidator {
    public static void validateUsername(String username) {
        assert Pattern.matches("[a-zA-Z][a-zA-Z0-9_]+", username):
            "Invalid username";

        assert username.length() >= 5:
            "Username must be at least 5 character long";

        assert username.length() <= 20:
            "Username must be at most 20 characters long";
    }

    public static void validateEmail(String email) {
        assert Pattern.matches("[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}", email):
            "Invalid email address";
    }

    public static void validateAge(int age) {
        assert age >= 17 && age <= 99 :
            "Age must be between 17 and 99";
    }
}
