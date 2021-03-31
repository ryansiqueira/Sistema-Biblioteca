package mjv.devschool.sistemalivaria.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mjv.devschool.sistemalivaria.dto.LocacaoItemDto;
import mjv.devschool.sistemalivaria.repositorie.LocacaoItemRepository;
import mjv.devschool.sistemalivaria.repositorie.LocacaoRepository;

@Service
public class LocacaoItemService {

	@Autowired
	private LocacaoItemRepository locItemRepository;
	
	@Autowired
	private LocacaoRepository locRepository;
	
	
	@Transactional
	public LocacaoItemDto insert(LocacaoItemDto locItemDto) {
		
	
		
		return null;
		
		
		
	}

	public LocacaoItemDto delete(LocacaoItemDto locItemDto) {
		
		
		return null;		
		
		
		
	}

	public LocacaoItemDto edit(LocacaoItemDto locItemDto) {
		
		
		return null;
		
		
		
	}

	public LocacaoItemDto update(LocacaoItemDto locItemDto) {
		
		
		return null;
		
		
		
	}
	

	
	
	
	
	
	
	
	
	
	
}