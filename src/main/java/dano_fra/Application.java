package dano_fra;

import com.github.javafaker.Faker;
import dao.EventoDAO;
import dao.LocationDAO;
import dao.PartecipazioneDAO;
import dao.PersonaDAO;
import entities.PartiteDiCalcio;
import entities.tipoEvento;
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
        LocationDAO dao1 = new LocationDAO(em);
        PersonaDAO dao2 = new PersonaDAO(em);
        PartecipazioneDAO dao3 = new PartecipazioneDAO(em);
        Random random = new Random();
        Faker faker = new Faker();
        // Create location
//        for (int i = 0; i < 20; i++) {
//            Location location = new Location(faker.demographic().demonym(), faker.address().cityName());
//            dao1.save(location);
//        }
////        //Create Persona
//        for (int i = 0; i < 20; i++) {
//            Persona person1 = new Persona(faker.name().firstName(), faker.name().lastName(), faker.internet().emailAddress(), faker.date().birthday(),
//                    random.nextInt(0, 2) == 0 ? "M" : "F");
//            dao2.save(person1);
//        }
//        // Create Evento
//        for (int i = 0; i < 20; i++) {
//            Evento evento = new Evento(faker.dragonBall().character(), faker.chuckNorris().fact(), faker.date().birthday(),
//                    random.nextInt(1, 3) == 1 ? tipoEvento.PRIVATO : tipoEvento.PUBBLICO,
//                    random.nextInt(1, 1000),
//                    dao1.findById(random.nextInt(1, 20)));
//            dao.save(evento);
//        }
//        //Create Partecipazione
//        for (int i = 0; i < 20; i++) {
//            Partecipazione partecipazione = new Partecipazione(random.nextInt(1, 3) == 1 ? stato.CONFERMATO : stato.NON_CONFERMATO,
//                    dao.findById(random.nextInt(1, 20)),
//                    dao2.findById(random.nextInt(1, 20)));
//            System.out.println("Evento: " + partecipazione.toString());
//            dao3.save(partecipazione);
//        }
        // Create Partite di Calcio
        for (int i = 0; i < 20; i++) {
            PartiteDiCalcio partiteDiCalcio = new PartiteDiCalcio(faker.name().firstName(), faker.chuckNorris().fact(), faker.date().birthday(), tipoEvento.PRIVATO, random.nextInt(1, 1000),
                    dao1.findById(random.nextInt(1, 20)), faker.esports().team(), faker.esports().team(), random.nextInt(1, 10),
                    random.nextInt(1, 10));
            System.out.println(" Evento: " + partiteDiCalcio.toString());
            dao.save(partiteDiCalcio);
        }

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


