package entities;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "eventi")
public class Evento {
    @Id
    @GeneratedValue
    private int id;
    @Column(name = "titolo")
    private String title;
    @Column(name = "descrizione")
    private String description;
    @Column(name = "data")
    private Date date;
    @Column(name = "tipo_evento")
    @Enumerated(EnumType.STRING)
    private tipoEvento typeEvent;
    @Column(name = "max_partecipanti")
    private int maxParticipants;

    @OneToOne(mappedBy = "evento")
    private partecipazione partecipazione;

    @ManyToOne
    @JoinColumn(name = "location_ID", nullable = false)
    private Location location;

    public Evento(String title, String description, Date date, tipoEvento typeEvent, int maxParticipants) {
        this.title = title;
        this.description = description;
        this.date = date;
        this.typeEvent = typeEvent;
        this.maxParticipants = maxParticipants;
    }

    public Evento() {
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }


    public tipoEvento getTypeEvent() {
        return typeEvent;
    }

    public void setTypeEvent(tipoEvento typeEvent) {
        this.typeEvent = typeEvent;
    }

    public int getMaxParticipants() {
        return maxParticipants;
    }

    public void setMaxParticipants(int maxParticipants) {
        this.maxParticipants = maxParticipants;
    }

    @Override
    public String toString() {
        return "Evento: " +
                "\nID: " + id +
                "\nTitolo: " + title +
                "\nDescrizione: " + description +
                "\nData: " + date +
                "\nTipo Evento: " + typeEvent +
                "\nMax partecipanti: " + maxParticipants;
    }
}
