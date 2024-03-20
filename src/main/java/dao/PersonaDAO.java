package dao;

import entities.Persona;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;

public class PersonaDAO {
    private final EntityManager em;

    public PersonaDAO(EntityManager em) {
        this.em = em;
    }

    public void save(Persona persona) {
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        em.persist(persona);
        tx.commit();
        System.out.println("Evento " + persona.getName() + " " + persona.getSurname() + " salvato con successo");
    }

    public Persona findById(int id) {
        Persona persona = em.find(Persona.class, id);
        return persona;
    }

    public void delete(int id) {
        Persona e = this.findById(id);
        EntityTransaction transaction = em.getTransaction();
        transaction.begin();
        em.remove(e);
        transaction.commit();
        System.out.println("Persona " + e.getName() + " " + e.getSurname() + " cancellato con successo");
    }

}

