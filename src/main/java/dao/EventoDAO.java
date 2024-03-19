package dao;

import entities.Evento;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;

public class EventoDAO {
    private final EntityManager em;

    public EventoDAO(EntityManager em) {
        this.em = em;
    }

    public void save(Evento evento) {
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        em.persist(evento);
        tx.commit();
        System.out.println("Evento " + evento.getTitle() + " salvato con successo");
    }

    public Evento findById(int id) {
        Evento evento = em.find(Evento.class, id);
        return evento;
    }

    public void delete(int id) {
        Evento e = this.findById(id);
        EntityTransaction transaction = em.getTransaction();
        transaction.begin();
        em.remove(e);
        transaction.commit();
        System.out.println("Evento " + e.getTitle() + " cancellato con successo");
    }

}
