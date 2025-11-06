package br.com.paulopinheiro.springbootdemo.controllers;

import br.com.paulopinheiro.springbootdemo.entities.DemoEntity;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestDemoController {
    private List<DemoEntity> entities = new ArrayList<>(Arrays.asList(
                                            new DemoEntity(1,"The first"),
                                            new DemoEntity(2,"The second")));

    @GetMapping("/v1/entities")
    public List<DemoEntity> getAll() {
        return this.entities;
    }

    @PostMapping("/v1/entities")
    public boolean addEntity(@RequestBody DemoEntity entity) {
        System.out.println(entity.getId() + " - " + entity.getLabel());
        entities.add(entity);
        return true;
    }

    @GetMapping("/v1/entities/{id}")
    public DemoEntity getById(@PathVariable Integer id) {
        return entities.stream().filter(entity -> entity.getId().equals(id)).findFirst().get();
    }
}