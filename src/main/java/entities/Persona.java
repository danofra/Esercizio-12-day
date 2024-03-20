package entities;

import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Entity
@Table(name = "persona")
public class Persona {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "nome")
    private String name;
    @Column(name = "cognome")
    private String surname;
    @Column(name = "email")
    private String email;
    @Column(name = "datadinascita")
    private Date dateOfBirth;
    @Column(name = "sesso")
    private String gender;

    @OneToMany(mappedBy = "persona")
    private List<partecipazione> partecipazione;

    public Persona(String name, String surname, String email, Date dateOfBirth, String gender, List<partecipazione> partecipazione) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.partecipazione = partecipazione;
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

    public void setEmail(String email) {
        this.email = email;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setPartecipazione(List<entities.partecipazione> partecipazione) {
        this.partecipazione = partecipazione;
    }
}
