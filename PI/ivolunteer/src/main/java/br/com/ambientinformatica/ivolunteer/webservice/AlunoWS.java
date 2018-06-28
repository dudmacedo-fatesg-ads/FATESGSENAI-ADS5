package br.com.ambientinformatica.ivolunteer.webservice;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.context.support.SpringBeanAutowiringSupport;

import br.com.ambientinformatica.ivolunteer.entidade.Aluno;
import br.com.ambientinformatica.ivolunteer.persistencia.AlunoDao;

@Path("/json/aluno")
public class AlunoWS {

	@PostConstruct
	public void init() {
		SpringBeanAutowiringSupport.processInjectionBasedOnCurrentContext(this);
	}

	@Autowired
	public AlunoDao alunoDao;

	@GET
	@Path("/{idAluno}")
	@Produces(MediaType.APPLICATION_JSON)
	public Aluno getAlunoJSON(@PathParam("idAluno") Integer idAluno) {
		return alunoDao.getAluno(idAluno);

	}

	@GET
	@Path("/alunos")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Aluno> getAlunosJSON() {

		return alunoDao.listarTodos();
	}

}
