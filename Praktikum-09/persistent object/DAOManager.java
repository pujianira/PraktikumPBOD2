/*
 * Nama : Pujiani Rahayu Agustin
 * NIM  : 24060122130067
 * File : DAOManager.java
 */

public class DAOManager {
    private PersonDAO personDAO;

    public void setPersonDAO(PersonDAO person) {
        personDAO = person;
    }

    public PersonDAO getPersonDAO() {
        return personDAO;
    }
}
