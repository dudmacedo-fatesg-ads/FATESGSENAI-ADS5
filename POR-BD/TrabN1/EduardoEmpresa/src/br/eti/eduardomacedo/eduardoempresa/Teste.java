package br.eti.eduardomacedo.eduardoempresa;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.eti.eduardomacedo.eduardoempresa.entidade.EduardoDependente;
import br.eti.eduardomacedo.eduardoempresa.entidade.EduardoEmpresa;
import br.eti.eduardomacedo.eduardoempresa.entidade.EduardoPessoa;

public class Teste {
	public static void main(String[] args) {
		EntityManagerFactory f = Persistence.createEntityManagerFactory("EduardoEmpresa");
		EntityManager em = f.createEntityManager();

		em.getTransaction().begin();

		EduardoEmpresa ee = new EduardoEmpresa();

		ee.setEduardodescricao("Empresa X");

		List<EduardoPessoa> eduardofuncionarios = new ArrayList<>();
		
		EduardoPessoa func = new EduardoPessoa();
		func.setEduardonome("Fulano de Tal");
		func.setEduardoempresa(ee);
		func.setEduardodatanascimento(new Date());
		func.setEduardodataadmissao(new Date());
		
		List<EduardoDependente> eduardodependentes = new ArrayList<>();
		
		EduardoDependente dep = new EduardoDependente();
		dep.setEduardonome("Beltrano da Silva");
		dep.setEduardoparentesco("Filho");
		dep.setEduardoPessoa(func);
		
		func.setEduardodependentes(eduardodependentes);
		
		ee.setEduardofuncionarios(eduardofuncionarios);

		em.persist(ee);
		em.persist(func);
		em.persist(dep);

		em.getTransaction().commit();
		f.close();

		System.out.println("Terminou!!!");
	}
}