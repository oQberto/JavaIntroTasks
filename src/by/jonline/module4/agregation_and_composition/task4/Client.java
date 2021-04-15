package by.jonline.module4.agregation_and_composition.task4;

import java.util.Objects;

public class Client {
    private String name;
    private String surname;
    private long id;

    public Client(String name, String surname, long id) {
        this.name = name;
        this.surname = surname;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public long getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return id == client.id &&
                name.equals(client.name) &&
                surname.equals(client.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, id);
    }
}
