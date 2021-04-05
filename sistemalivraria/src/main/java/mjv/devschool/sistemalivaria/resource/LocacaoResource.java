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
import mjv.devschool.sistemalivaria.service.LocacaoService;

@RestController
@RequestMapping(value = "/locacao")
public class LocacaoResource {

	@Autowired
	LocacaoService locservice;
	
	
	@PostMapping
	public ResponseEntity<LocacaoDto> gerarLocacao(@RequestBody LocacaoDto locdto){
		
		locdto = locservice.gerarLocacao(locdto);
		
	    URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(locdto.getId()).toUri();
		
		return ResponseEntity.created(uri).body(locdto);

	}
	
	
		
	
	
	
	
	
}
