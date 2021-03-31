package mjv.devschool.sistemalivaria.repositorie;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import mjv.devschool.sistemalivaria.model.LocacaoItem;

@Repository
public interface LocacaoItemRepository extends JpaRepository<LocacaoItem,Long> {

	
	
	
}