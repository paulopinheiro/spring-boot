package br.com.paulopinheiro.springbootdemo.repositories;

import br.com.paulopinheiro.springbootdemo.entities.DemoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DemoEntityRepository extends JpaRepository<DemoEntity, Integer> {}
