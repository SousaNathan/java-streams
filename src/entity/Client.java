package entity;

import java.time.LocalDate;
import java.time.Period;
import java.util.Objects;
import java.util.UUID;

public class Client {

    private UUID id;
    private String name;
    private LocalDate birthDate;

    public Client(String name, LocalDate birthDate) {
        this.id = UUID.randomUUID();
        this.name = name;
        this.birthDate = birthDate;
    }

    public int getAge() {
        return Period.between(this.birthDate, LocalDate.now()).getYears();
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return Objects.equals(name, client.name);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name);
    }

    @Override
    public String toString() {
        return "{ name='" + name + "', birthDate=" + birthDate + " }";
    }

}
