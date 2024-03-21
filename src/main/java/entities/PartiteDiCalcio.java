package entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.util.Date;

@Entity
@Table(name = "partitadicalcio")
public class PartiteDiCalcio extends Evento {
    @Column(name = "squadradicasa")
    private String squadraCasa;
    @Column(name = "squadraospite")
    private String squadraOspite;

    @Column(name = "squadravincente")
    private String squadraVincente;
    @Column(name = "golcasa")
    private int golCasa;
    @Column(name = "golospite")
    private int golOspite;

    public PartiteDiCalcio(String title, String description, Date date, tipoEvento typeEvent, int maxParticipants, Location location, String squadraCasa, String squadraOspite, int golCasa, int golOspite) {
        super(title, description, date, typeEvent, maxParticipants, location);
        this.squadraCasa = squadraCasa;
        this.squadraOspite = squadraOspite;
        this.golCasa = golCasa;
        this.golOspite = golOspite;
        if (golCasa > golOspite) {
            squadraVincente = squadraCasa;
        } else if (golCasa < golOspite) {
            squadraVincente = squadraOspite;
        } else {
            squadraVincente = null;
        }
    }

    public String getSquadraCasa() {
        return squadraCasa;
    }

    public void setSquadraCasa(String squadraCasa) {
        this.squadraCasa = squadraCasa;
    }

    public String getSquadraOspite() {
        return squadraOspite;
    }

    public void setSquadraOspite(String squadraOspite) {
        this.squadraOspite = squadraOspite;
    }

    public String getSquadraVincente() {
        return squadraVincente;
    }

    public void setSquadraVincente(String squadraVincente) {
        this.squadraVincente = squadraVincente;
    }

    public int getGolCasa() {
        return golCasa;
    }

    public void setGolCasa(int golCasa) {
        this.golCasa = golCasa;
    }

    public int getGolOspite() {
        return golOspite;
    }

    public void setGolOspite(int golOspite) {
        this.golOspite = golOspite;
    }
}
