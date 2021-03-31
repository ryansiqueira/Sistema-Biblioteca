package mjv.devschool.sistemalivaria.resource;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mjv.devschool.sistemalivaria.dto.LocacaoDto;

@RestController
@RequestMapping(value = "/locacao")
public class LocacaoResource {

	public ResponseEntity<LocacaoDto> insert(@RequestBody LocacaoDto locDto) {
		return null;
	}
}
