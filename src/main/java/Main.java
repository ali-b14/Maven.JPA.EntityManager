import entities.Cd;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.text.html.parser.Entity;

public class Main {


    public static void main(String[] args) {


        EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu");
        EntityManager em = emf.createEntityManager();

        Cd cd = em.find(Cd.class,1);
        System.out.println(cd);
    }
}
