package mjv.devschool.sistemalivaria.resource;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mjv.devschool.sistemalivaria.dto.LocacaoItemDto;


@RestController
@RequestMapping(value = "/locacaoItem")
public class LocacaoItemResource {

	
	
	public ResponseEntity<LocacaoItemDto> insert(@RequestBody LocacaoItemDto locItemDto){
		
		
		return null;
		
		
	}
	
	
	
	
	
	
}