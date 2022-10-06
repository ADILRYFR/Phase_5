package Phase_5_Ass.demo.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController


public class Controller {
	
	
	
	@GetMapping(value="/",produces=MediaType.APPLICATION_JSON_VALUE)
	String greeting() {
		return "Yellow!!!!....heya mate!..how ya doing";
	}
	
	
	@GetMapping(value="moregreeting/{name}",produces=MediaType.APPLICATION_JSON_VALUE)
	String respectfulgreeting(@PathVariable("name") String name) {
		return "Hello Mr/Mrs."+name+". Hope you doing great broadie!!";
	}
	
	

}
