package org.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class MyRestController {

	@Value("${message:Cannot fetch property from Config Server}")
    private String message;
	

	@RequestMapping("/message")
    String getMessage() {
        return this.message;
    }
}
