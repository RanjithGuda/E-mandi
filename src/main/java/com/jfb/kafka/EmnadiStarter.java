package com.jfb.kafka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@RestController
@RequestMapping("/base")
public class EmnadiStarter
{
    public static void main( String[] args )
    {
       SpringApplication.run(EmnadiStarter.class, args);
    }
    @GetMapping("/sample")
    private String Resource() {
		return "success";
    	
    	
    }
}
