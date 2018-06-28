package modelo;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Principal {

	public static void main(String[] args) {
		EntityManagerFactory f = Persistence.createEntityManagerFactory("batatinha");
		f.close();
		System.out.println("Terminou!!!");
	}

}
