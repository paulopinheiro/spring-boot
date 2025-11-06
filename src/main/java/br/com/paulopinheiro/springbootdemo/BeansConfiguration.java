package br.com.paulopinheiro.springbootdemo;

import br.com.paulopinheiro.springbootdemo.entities.DemoEntity;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeansConfiguration {
    @Bean
    @ConfigurationProperties(prefix="entity")
    public DemoEntity demoEntity() {
        return new DemoEntity();
    }
}
