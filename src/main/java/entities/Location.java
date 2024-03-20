package entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "location")
public class Location {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "nome")
    private String name;
    @Column(name = "città")
    private String city;
    @OneToMany(mappedBy = "location")
    private List<Evento> eventi;


    public Location(String name, String city, List<Evento> eventi) {
        this.name = name;
        this.city = city;
        this.eventi = eventi;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public List<Evento> getEventi() {
        return eventi;
    }

    @Override
    public String toString() {
        return "Location{" +
                "name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", eventi=" + eventi +
                '}';
    }


}
