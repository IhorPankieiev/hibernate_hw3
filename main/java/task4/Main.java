package task4;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.setId(1);
        animal.setAge(12);
        animal.setName("Dog");
        animal.setTail(true);


        SessionFactory sessionFactory = new Configuration()
                .configure()
                .buildSessionFactory();

        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.save(animal);
        session.getTransaction().commit();
        session.close();
    }
}
