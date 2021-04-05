package mjv.devschool.sistemalivaria.repositorie;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import feign.Param;
import mjv.devschool.sistemalivaria.dto.CadastroDto;
import mjv.devschool.sistemalivaria.model.Cadastro;

@Repository
public interface CadastroRepository extends JpaRepository<Cadastro,Long> {
	//querymethods
	
	Cadastro findByLogin(String login);
	
	}
	
	
	

