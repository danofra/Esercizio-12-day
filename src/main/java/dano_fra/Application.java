package dano_fra;

import com.github.javafaker.Faker;
import dao.EventoDAO;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import java.util.Random;

public class Application {

    private static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("gestione_eventi");

    public static void main(String[] args) {
        EntityManager em = emf.createEntityManager();
        System.out.println("Hello World!");
        EventoDAO dao = new EventoDAO(em);
        Random random = new Random();
        Faker faker = new Faker();
//        Supplier<Location> locationSupplier = (() -> new Location(faker.address().city()));
//        Supplier<Location> locationSupplier1 = (() -> new Location(faker.address().city()));
//        Supplier<Location> locationSupplier2 = (() -> new Location(faker.address().city()));
//        Supplier<Location> locationSupplier3 = (() -> new Location(faker.address().city()));
//        Location location = locationSupplier.get();
//        Location location1 = locationSupplier1.get();
//        Location location2 = locationSupplier2.get();
//        Location location3 = locationSupplier3.get();
//        em.getTransaction().begin();
//        em.persist(location);
//        em.persist(location1);
//        em.persist(location2);
//        em.persist(location3);
//        em.getTransaction().commit();
//        System.out.println("Location inseriti con successo" + location + "\n" + location1 + "\n" + location2 + "\n" + location3);
//
//
//        Supplier<Evento> eventoSupplier = (() ->
//                new Evento(faker.dragonBall().character(), faker.superhero().descriptor(), faker.date().birthday(), tipoEvento.PRIVATO, random.nextInt(1000, 5000),
//                        stato.CONFERMATA, new Location(faker.address().city())));
//        Supplier<Evento> eventoSupplier1 = (() ->
//                new Evento(faker.dragonBall().character(), faker.superhero().descriptor(), faker.date().birthday(), tipoEvento.PUBBLICO, random.nextInt(1000, 5000),
//                        stato.CONFERMATA, new Location(faker.address().city())));
//        Supplier<Evento> eventoSupplier2 = (() ->
//                new Evento(faker.dragonBall().character(), faker.superhero().descriptor(), faker.date().birthday(), tipoEvento.PRIVATO, random.nextInt(1000, 5000),
//                        stato.NON_CONFERMATA, new Location(faker.address().city())));
//        Supplier<Evento> eventoSupplier3 = (() ->
//                new Evento(faker.dragonBall().character(), faker.superhero().descriptor(), faker.date().birthday(), tipoEvento.PUBBLICO, random.nextInt(1000, 5000),
//                        stato.CONFERMATA, new Location(faker.address().city())));
//
//        Evento evento = eventoSupplier.get();
//        Evento evento1 = eventoSupplier1.get();
//        Evento evento2 = eventoSupplier2.get();
//        Evento evento3 = eventoSupplier3.get();
//        em.getTransaction().begin();
//        em.persist(evento);
//        em.persist(evento1);
//        em.persist(evento2);
//        em.persist(evento3);
//        em.getTransaction().commit();
//        System.out.println("Eventi inseriti con successo" + evento + "\n" + evento1 + "\n" + evento2 + "\n" + evento3);
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


