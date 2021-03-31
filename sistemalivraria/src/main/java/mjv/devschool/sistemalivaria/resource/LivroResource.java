package mjv.devschool.sistemalivaria.resource;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mjv.devschool.sistemalivaria.dto.LivroDto;



@RestController
@RequestMapping(value = "/livro")
public class LivroResource {

	public ResponseEntity<LivroDto> insert(@RequestBody LivroDto livDto) {
		return null;
	}

}
