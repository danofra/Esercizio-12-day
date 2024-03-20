package dao;

import entities.Partecipazione;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;

public class PartecipazioneDAO {
    private final EntityManager em;

    public PartecipazioneDAO(EntityManager em) {
        this.em = em;
    }

    public void save(Partecipazione partecipazione) {
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        em.persist(partecipazione);
        tx.commit();
        System.out.println("Evento " + partecipazione.getStato() + " salvato con successo");
    }

    public Partecipazione findById(int id) {
        Partecipazione partecipazione = em.find(Partecipazione.class, id);
        return partecipazione;
    }

    public void delete(int id) {
        Partecipazione e = this.findById(id);
        EntityTransaction transaction = em.getTransaction();
        transaction.begin();
        em.remove(e);
        transaction.commit();
        System.out.println("Partecipazione " + e.getStato() + " cancellato con successo");
    }

}
