package entities;

import jakarta.persistence.*;

@Entity
@Table(name = "partecipazione")
public class partecipazione {

    @Id
    @GeneratedValue
    private long id;

    private stato stato;
    @OneToOne
    @JoinColumn(name = "evento_ID")
    private Evento evento;

    public partecipazione(Evento evento, stato stato) {
        this.evento = evento;
        this.stato = stato;
    }

    public stato getStato() {
        return stato;
    }

}