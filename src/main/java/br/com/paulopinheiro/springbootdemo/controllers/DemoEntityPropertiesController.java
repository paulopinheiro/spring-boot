package br.com.paulopinheiro.springbootdemo.controllers;

import br.com.paulopinheiro.springbootdemo.entities.DemoEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoEntityPropertiesController {
    @Autowired private DemoEntity demoEntity;

    @GetMapping("/demo-entity-test")
    public String getDemoProperties() {
        return String.format("Demo entity was initialized with ID = %d, and label = %s", 
                             demoEntity.getId(),
                             demoEntity.getLabel());
    }
}
