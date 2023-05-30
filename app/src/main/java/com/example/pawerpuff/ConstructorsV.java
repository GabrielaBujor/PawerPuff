package com.example.pawerpuff;

public class ConstructorsV {

    private int id;
    private String name;
    private String email;
    private String address;
    private String number;
    private boolean dogs;

    public ConstructorsV(int id, String name, String email, String address, String number, boolean dogs) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.address = address;
        this.number = number;
        this.dogs = dogs;
    }

    public ConstructorsV() {
    }

    @Override
    public String toString() {
        return "ConstructorsV{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                ", number='" + number + '\'' +
                ", dogs=" + dogs +
                '}';
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public boolean isDogs() {
        return dogs;
    }

    public void setDogs(boolean dogs) {
        this.dogs = dogs;
    }
}
