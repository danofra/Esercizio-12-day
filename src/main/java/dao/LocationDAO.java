package dao;

import entities.Evento;
import entities.Location;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;

public class LocationDAO {
    private final EntityManager em;

    public LocationDAO(EntityManager em) {
        this.em = em;
    }

    public void save(Evento evento) {
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        em.persist(evento);
        tx.commit();
        System.out.println("Evento " + evento.getTitle() + " salvato con successo");
    }

    public Location findById(int id) {
        Location location = em.find(Location.class, id);
        return location;
    }

    public void delete(int id) {
        Location e = this.findById(id);
        EntityTransaction transaction = em.getTransaction();
        transaction.begin();
        em.remove(e);
        transaction.commit();
        System.out.println("Location " + e.getName() + " cancellato con successo");
    }

}
