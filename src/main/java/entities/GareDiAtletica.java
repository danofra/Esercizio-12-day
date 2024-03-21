package entities;

import jakarta.persistence.*;

import java.util.Set;

//@Entity
@Table(name = "garediatletica")
public class GareDiAtletica extends Evento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @OneToMany(mappedBy = "atleti")
    private Set<Persona> atleti;
    @Column(name = "vincitore")
    private Persona vincitore;

    public GareDiAtletica(Set<Persona> atleti, Persona vincitore) {
        this.atleti = atleti;
        this.vincitore = vincitore;
    }

    @Override
    public long getId() {
        return id;
    }

    public Set<Persona> getAtleti() {
        return atleti;
    }

    public void setAtleti(Set<Persona> atleti) {
        this.atleti = atleti;
    }

    public Persona getVincitore() {
        return vincitore;
    }

    public void setVincitore(Persona vincitore) {
        this.vincitore = vincitore;
    }
}
