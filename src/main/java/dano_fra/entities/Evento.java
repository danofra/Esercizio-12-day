package dano_fra.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="eventi")
public class Evento {
    @Id
    @GeneratedValue
    private int id;

    private String title;

    private String description;



}
