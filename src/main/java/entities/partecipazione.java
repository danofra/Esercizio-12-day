package entities;

import jakarta.persistence.*;

@Entity
@Table(name = "partecipazione")
public class partecipazione {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private stato stato;
    @OneToOne
    @JoinColumn(name = "evento_ID", nullable = false)
    private Evento evento;

    @ManyToOne
    @JoinColumn(name = "persona_ID", nullable = false, unique = true)
    private Persona persona;

    public partecipazione(entities.stato stato, Evento evento, Persona persona) {
        this.stato = stato;
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