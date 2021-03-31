package mjv.devschool.sistemalivaria.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;

import mjv.devschool.sistemalivaria.dto.LocacaoDto;
import mjv.devschool.sistemalivaria.repositorie.LocacaoRepository;

public class LocacaoService {

	@Autowired
	private LocacaoRepository locRepository;
	
	@Transactional
	public LocacaoDto insert (LocacaoDto locDto) {
		return null;
	}
	public LocacaoDto delete (LocacaoDto locDto) {
		return null;
	}
	public LocacaoDto edit (LocacaoDto locDto) {
		return null;
	}
	public LocacaoDto update (LocacaoDto locDto) {
		return null;
	}
	
}
