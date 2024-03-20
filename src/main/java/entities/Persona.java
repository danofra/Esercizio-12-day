package entities;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "persona")
public class Persona {

    @Id
    @GeneratedValue
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

    @ManyToOne
    @JoinColumn(name = "partecipazione_id")
    private partecipazione partecipazione;

    public Persona(String name, String surname, String email, Date dateOfBirth, String gender, partecipazione partecipazione) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.partecipazione = partecipazione;

    }

}
