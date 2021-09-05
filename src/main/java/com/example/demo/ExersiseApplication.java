package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class ExersiseApplication {
	
	private static final Logger log = LoggerFactory.getLogger(ExersiseApplication.class);
	private static final String apiKey = System.getenv("API_KEY");

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(ExersiseApplication.class, args);
		context.close();
	}
	
	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder) {
		return builder.build();
	}

	@Bean
	public CommandLineRunner run(RestTemplate restTemplate) throws Exception {
		return args -> {
			if (args.length>0) {
				getSample(restTemplate, args[0]);
			}
		};
	}

	private void getSample(RestTemplate restTemplate, String smapleId) {
		HttpHeaders headers = new HttpHeaders();
		headers.set("apiKey", apiKey);
		HttpEntity<String> entity = new HttpEntity<String>(headers);
		ResponseEntity<Sample> rSample = 
				restTemplate.exchange("https://demos.researchspace.com/api/inventory/v1/samples/"+smapleId, HttpMethod.GET, entity, Sample.class);
		log.info(rSample.getBody().toString());
	}

}
