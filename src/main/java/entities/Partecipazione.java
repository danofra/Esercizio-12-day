package entities;

import jakarta.persistence.*;

@Entity
@Table(name = "partecipazione")
public class Partecipazione {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Enumerated(EnumType.STRING)
    private stato stato;
    @ManyToOne
    @JoinColumn(name = "evento_ID", nullable = false)
    private Evento evento;

    @ManyToOne
    @JoinColumn(name = "persona_ID", nullable = false, unique = true)
    private Persona persona;

    public Partecipazione(stato stato, Evento evento, Persona persona) {
        this.stato = stato;
        this.evento = evento;
        this.persona = persona;
    }

    public Partecipazione() {

    }

    public stato getStato() {
        return stato;
    }

    public void setStato(stato stato) {
        this.stato = stato;
    }

    public Evento getEvento() {
        return evento;
    }

    public Persona getPersona() {
        return persona;
    }

    @Override
    public String toString() {
        return "Partecipazione{" +
                "stato=" + stato +
                ", evento=" + evento +
                ", persona=" + persona +
                '}';
    }
}