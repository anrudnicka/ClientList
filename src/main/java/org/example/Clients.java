package org.example;

import java.util.Objects;

public class Clients {
    private String name;
    private String lastname;

    public Clients(String name, String lastname) {
        this.name = name;
        this.lastname = lastname;
    }

    @Override
    public String toString() {
        return  "client (name_lastname):" + name +"_"+ lastname;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Clients clients = (Clients) o;
        return Objects.equals(name, clients.name) && Objects.equals(lastname, clients.lastname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, lastname);
    }
}
