package com.nttdata.bootcamp.Controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class Controller {
	
	@Value("${some.value}")
	private String retoValue;
	
	@GetMapping(path="/retovalor")
	public String retoValue() {
		return this.retoValue;
	}

}
