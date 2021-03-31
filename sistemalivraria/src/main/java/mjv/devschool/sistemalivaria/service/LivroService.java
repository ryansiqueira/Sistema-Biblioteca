package mjv.devschool.sistemalivaria.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;

import mjv.devschool.sistemalivaria.dto.LivroDto;
import mjv.devschool.sistemalivaria.repositorie.LivroRepository;

public class LivroService {

	@Autowired
	private LivroRepository livRepository;
	
	
	@Transactional
	public LivroDto insert (LivroDto livDto) {
		return null;
	}
	
	public LivroDto delete (LivroDto livDto) {
		return null;
	}
	
	public LivroDto edit (LivroDto livDto) {
		return null;
	}
	
	public LivroDto update (LivroDto livDto) {
		return null;
	}
	
	

}
