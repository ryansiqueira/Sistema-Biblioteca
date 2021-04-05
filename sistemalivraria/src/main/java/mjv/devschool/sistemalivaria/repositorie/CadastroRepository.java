package mjv.devschool.sistemalivaria.repositorie;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import mjv.devschool.sistemalivaria.model.Cadastro;

@Repository
public interface CadastroRepository extends JpaRepository<Cadastro,Integer> {

	
	
	
}
