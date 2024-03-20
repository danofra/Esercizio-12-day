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
    @JoinColumn(name = "persona_ID", nullable = false)
    private Persona persona;

    public Partecipazione(Evento evento, Persona persona) {
        this.stato = stato.NON_CONFERMATO;
        this.evento = evento;
        this.persona = persona;
    }

    public entities.stato getStato() {
        return stato;
    }

    public void setStato(entities.stato stato) {
        this.stato = stato;
    }

    public Evento getEvento() {
        return evento;
    }

    public Persona getPersona() {
        return persona;
    }

}