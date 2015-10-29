package br.cristec.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JpaUtil {
	
	private static EntityManagerFactory fabrica;
	
	static {
		fabrica = Persistence.createEntityManagerFactory("p-hibernate");
	}
	
	public static EntityManager getEntityManager()
	{
		return fabrica.createEntityManager(); 
	}
	
	
}
