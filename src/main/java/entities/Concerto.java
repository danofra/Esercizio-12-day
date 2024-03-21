package entities;

import jakarta.persistence.*;

@Entity
@Table(name = "concerto")
public class Concerto extends Evento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "genere")
    private genere genere;


    public Concerto(genere genere) {
        this.genere = genere;
    }

    public long getId() {
        return id;
    }

    public genere getGenere() {
        return genere;
    }

    public void setGenere(genere genere) {
        this.genere = genere;
    }


}
