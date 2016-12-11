package helper;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAHelper {
	
	private static EntityManagerFactory emf;
	
	private static EntityManagerFactory getEntityManagerFactory(){
		if(emf==null){
			emf = Persistence.createEntityManagerFactory("MONGODB_APPLICATION");
		}
		return emf;
	}
	
	public static EntityManager getEntityManager(){
		return getEntityManagerFactory().createEntityManager();
	}
}
