package br.com.db1;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("db1start");
		EntityManager manager = factory.createEntityManager();
				
		Cidade cidade = new Cidade();
		cidade.setNome("Curitiba");
		cidade.setUf(Uf.PR);
		manager.getTransaction().begin();
		manager.persist(cidade);
		manager.getTransaction().commit();
		
		factory.close();

	}
	
	
}
