package tech.ledemkam.sa.entities;

import jakarta.persistence.*;
import tech.ledemkam.sa.enums.TypeGefühlt;

@Entity
@Table(name = "GEFÜHLT")
public class Gefühlt {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     private int id;
     private String texte;
     private TypeGefühlt type;

     @ManyToOne
     @JoinColumn(name = "KUNDE_ID")
     private Kunde kunde;

        public Gefühlt() {
        }

        public Gefühlt(String texte, TypeGefühlt type, Kunde kunde) {
            this.texte = texte;
            this.type = type;
            this.kunde = kunde;
        }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTexte() {
        return texte;
    }

    public void setTexte(String texte) {
        this.texte = texte;
    }

    public TypeGefühlt getType() {
        return type;
    }

    public void setType(TypeGefühlt type) {
        this.type = type;
    }

    public Kunde getKunde() {
        return kunde;
    }

    public void setKunde(Kunde kunde) {
        this.kunde = kunde;
    }
}
