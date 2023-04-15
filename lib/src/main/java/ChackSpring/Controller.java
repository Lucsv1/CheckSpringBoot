package ChackSpring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
	@Autowired
	private Services services;
	
	@PostMapping("/hello")
	public ResponseEntity<ChackDTO> helloWorld(@RequestBody ChackDTO check) {
		ChackDTO analise = services.pesistValidCheck(check);
		return ResponseEntity.ok(analise);	
	}

}
