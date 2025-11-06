package br.com.paulopinheiro.springbootdemo.controllers;

import br.com.paulopinheiro.springbootdemo.entities.DemoEntity;
import br.com.paulopinheiro.springbootdemo.repositories.DemoEntityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JpaDemoController {
    @Autowired private DemoEntityRepository entityRepository;
    
    @PostMapping("/v2/entities")
    public String saveEntity(@RequestBody DemoEntity entity) {
        entityRepository.save(entity);
        return "Entity is saved";
    }
}
