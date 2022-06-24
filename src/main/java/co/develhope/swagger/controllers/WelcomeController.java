package co.develhope.swagger.controllers;

import co.develhope.swagger.configurations.SpringFoxConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spring.web.plugins.Docket;

@RestController
public class WelcomeController {

    @Autowired
    private SpringFoxConfig springFoxConfig = new SpringFoxConfig();

    @GetMapping
    public String welcomeMessage(){
        return "Welcome to the 1234 Port";
    }

    @GetMapping("/name")
    public String getName(){
        return springFoxConfig.myContact.getName();
    }
    @GetMapping("/email")
    public String getEmail(){
        return springFoxConfig.myContact.getEmail();
    }
}
