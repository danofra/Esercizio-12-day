package entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "location")
public class Location {
    @Id
    @GeneratedValue
    private long id;
    @Column(name = "nome")
    private String name;
    @Column(name = "città")
    private String city;
    @OneToMany(mappedBy = "location")
    private List<Evento> eventi;

    public Location(String name, String city) {
        this.name = name;
        this.city = city;
    }
}
