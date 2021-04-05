package mjv.devschool.sistemalivaria.resource;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import mjv.devschool.sistemalivaria.dto.LocacaoDto;
import mjv.devschool.sistemalivaria.model.Locacao;
import mjv.devschool.sistemalivaria.service.LocacaoService;

@RestController
@RequestMapping(value = "/locacao")
public class LocacaoResource {

	@Autowired
	LocacaoService locservice;
	
	
	@PostMapping
	public ResponseEntity<LocacaoDto> insert(@RequestBody LocacaoDto locdto){
		
		Locacao loc = locservice.insert(locdto);
		
	    URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(loc.getId()).toUri();
		
		return ResponseEntity.created(uri).body(locdto);

	}
	
	
	
	
	
}
