package br.com.paulopinheiro.springbootdemo.repositories;

import br.com.paulopinheiro.springbootdemo.SpringbootdemoApplication;
import br.com.paulopinheiro.springbootdemo.entities.DemoEntity;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.AssertionsKt.assertNotNull;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = SpringbootdemoApplication.class)
public class DemoEntityRepositoryTest {
    @Autowired private DemoEntityRepository entityRepository;

    @Test
    public void shouldSaveEntity() {
        DemoEntity entity = entityRepository.save(new DemoEntity("The third"));
        DemoEntity foundEntity = entityRepository.findById(entity.getId()).get();

        assertNotNull(foundEntity);
        assertEquals(entity.getLabel(),foundEntity.getLabel());
    }
}
