package mjv.devschool.sistemalivaria.resource;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import mjv.devschool.sistemalivaria.dto.LivroDto;
import mjv.devschool.sistemalivaria.service.LivroService;


@RestController
@RequestMapping(value = "/livro")
public class LivroResource {
	
	@Autowired
	private LivroService livroservice;
	
	/*
	
	@GetMapping
	public ResponseEntity<List<CadastroDto>> findAll(){
		
		List<CadastroDto> list = livroservice.
		
		return ResponseEntity.ok().body(list);
	}
	
	/*
	public ResponseEntity<List<CadastroDto>> findAll(){
	
		List<CadastroDto> list = cadservice.findAll();
	
		return ResponseEntity.ok().body(list);
	}
	
	*/
	
	@PostMapping
	public ResponseEntity<LivroDto> insert(@RequestBody LivroDto livrodto){
		
		livrodto = livroservice.CadastrarLivro(livrodto);
		
	    URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(livrodto.getId()).toUri();
		
		return ResponseEntity.created(uri).body(livrodto);

	}
	
	
}
