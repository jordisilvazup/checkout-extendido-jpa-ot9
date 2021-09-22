import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Principal {

    public static void main(String[] args) {
        EntityManagerFactory managerFactory = Persistence.createEntityManagerFactory("checkoutjpa");

        EntityManager manager = managerFactory.createEntityManager();

        EntityTransaction transaction = manager.getTransaction();


        transaction.begin();

        // aqui fica suas operacoes, persistence, remove, merge
        transaction.commit();
        manager.close();
    }
}
