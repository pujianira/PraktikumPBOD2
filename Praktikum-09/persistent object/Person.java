/*
 * Nama : Pujiani Rahayu Agustin
 * NIM  : 24060122130067
 * File : Person.java
 */

public class Person {
    private int id;
    private String name;

    public Person(String n) {
        name = n;
    }

    public Person(int i, String n) {
        id = i;
        name = n;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
