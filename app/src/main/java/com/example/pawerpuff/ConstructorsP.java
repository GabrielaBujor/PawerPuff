package com.example.pawerpuff;

public class ConstructorsP {
    private int id;
    private String name;
    private String email;
    private String address;
    private String number;
    private boolean dogs;

    public ConstructorsP(int id, String name, String email, String address, String number, boolean dogs) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.address = address;
        this.number = number;
        this.dogs = dogs;
    }

    public ConstructorsP() {
    }

    @Override
    public String toString() {
        return "ConstructorsP{" +
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
