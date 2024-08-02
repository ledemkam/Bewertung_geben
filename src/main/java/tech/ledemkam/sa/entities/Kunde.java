package tech.ledemkam.sa.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "KUNDE")
public class Kunde {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int id;
    @Column(unique = true)
    private String email;

    public Kunde() {
    }

    public Kunde(int id, String email) {
        this.id = id;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
