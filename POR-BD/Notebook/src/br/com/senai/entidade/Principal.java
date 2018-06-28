package br.com.senai.entidade;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Principal {

	public static void main(String[] args) {
		EntityManagerFactory f = Persistence.createEntityManagerFactory("pNotebook");
		EntityManager em = f.createEntityManager();
		
		em.getTransaction().begin();
		
		Notebook na = new Notebook();
		na.setSerialNumber("A123");
		na.setMemoriaRAM(32);
		na.setEspacoHD(2);
		
		em.persist(na);
		em.getTransaction().commit();
		
		System.out.println("Terminou!!!");
		
	}

}
