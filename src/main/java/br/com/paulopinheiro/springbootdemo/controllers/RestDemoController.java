package br.com.paulopinheiro.springbootdemo.controllers;

import br.com.paulopinheiro.springbootdemo.entities.DemoEntity;
import br.com.paulopinheiro.springbootdemo.repositories.DemoEntityRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestDemoController {
    @Autowired DemoEntityRepository repository;

    @GetMapping("/v1/entities")
    public List<DemoEntity> getAll() {
        return this.repository.findAll();
    }

    @PostMapping("/v1/entities")
    public boolean addEntity(@RequestBody DemoEntity entity) {
        repository.save(entity);
        return true;
    }

    @GetMapping("/v1/entities/{id}")
    public DemoEntity getById(@PathVariable Integer id) {
        return repository.findById(id).get();
    }
}