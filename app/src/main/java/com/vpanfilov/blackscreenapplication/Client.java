package com.vpanfilov.blackscreenapplication;

/**
 * Created by Vladislav on 10.05.2017.
 */
public class Client {

    private int id;
    private String name;
    private String surname;

    public Client(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String toString(){
        return "Client [id=" + id + ", name=" + name + ", surname=" + surname
                + "]";
    }
}
