package dano_fra;

import com.github.javafaker.Faker;
import dao.EventoDAO;
import entities.Evento;
import entities.tipoEvento;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import java.util.Random;
import java.util.function.Supplier;

public class Application {

    private static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("gestione_eventi");

    public static void main(String[] args) {
        EntityManager em = emf.createEntityManager();
        System.out.println("Hello World!");
        EventoDAO dao = new EventoDAO(em);
        Random random = new Random();
        Faker faker = new Faker();
        Supplier<Evento> eventoSupplier = (() -> new Evento(faker.dragonBall().character(), faker.superhero().descriptor(), faker.date().birthday(), tipoEvento.PRIVATO, random.nextInt(1000, 5000)));
        Supplier<Evento> eventoSupplier1 = (() -> new Evento(faker.dragonBall().character(), faker.superhero().descriptor(), faker.date().birthday(), tipoEvento.PUBBLICO, random.nextInt(1000, 5000)));
        Supplier<Evento> eventoSupplier2 = (() -> new Evento(faker.dragonBall().character(), faker.superhero().descriptor(), faker.date().birthday(), tipoEvento.PRIVATO, random.nextInt(1000, 5000)));
        Supplier<Evento> eventoSupplier3 = (() -> new Evento(faker.dragonBall().character(), faker.superhero().descriptor(), faker.date().birthday(), tipoEvento.PUBBLICO, random.nextInt(1000, 5000)));

        Evento evento = eventoSupplier.get();
        Evento evento1 = eventoSupplier1.get();
        Evento evento2 = eventoSupplier2.get();
        Evento evento3 = eventoSupplier3.get();
        em.getTransaction().begin();
        em.persist(evento);
        em.persist(evento1);
        em.persist(evento2);
        em.persist(evento3);
        em.getTransaction().commit();
        System.out.println("Eventi inseriti con successo" + evento + "\n" + evento1 + "\n" + evento2 + "\n" + evento3);
//
//        try {
//            Evento evento1 = dao.findById(2);
//            System.out.println("Evento trovato: " + evento1);
//        } catch (Exception e) {
//            System.out.println("Evento non trovato");
//        }
//
//        try {
//            dao.delete(3);
//        } catch (Exception e) {
//            System.out.println("Evento non eliminato");
//        }
    }
}


