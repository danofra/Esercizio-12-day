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
    private List<Partecipazione> partecipazione;
    @ManyToOne
    @JoinColumn(name = "atleti_Id")
    private GareDiAtletica atleti;

    public Persona(String name, String surname, String email, Date dateOfBirth, String gender) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;

    }

    public Persona() {
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public List<Partecipazione> getPartecipazione() {
        return partecipazione;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", email='" + email + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", gender='" + gender + '\'' +
                '}';
    }
}
