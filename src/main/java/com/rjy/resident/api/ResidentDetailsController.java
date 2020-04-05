package com.rjy.resident.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Lazy;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.discovery.EurekaClient;

@RestController
public class ResidentDetailsController {
	
	@Autowired
    @Lazy
    private EurekaClient eurekaClient;
	
	@Value("${spring.application.name}")
    private String appName;
	
	 @GetMapping("/greeting")
    public String greeting() {
        return String.format(
          "Hello from '%s'!", eurekaClient.getApplication(appName).getName());
    }

}
