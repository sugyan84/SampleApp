package com.practice.SampleApp.api;

import java.util.logging.Logger;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class TestEndpoint {
    
    private final Logger logger = Logger.getLogger(this.getClass().getName());
    
    @GetMapping("/test/{text}")
    public String testPlainText(@PathVariable("text") String text){
        logger.info("{{testPlainText}}: entry with string: "+ text);
        return text;
    }
}
