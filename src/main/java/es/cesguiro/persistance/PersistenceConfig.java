package es.cesguiro.persistance;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import es.cesguiro.persistance.dao.jpa.AuthorDaoJpa;
import es.cesguiro.persistance.dao.jpa.BookDaoJpa;
import es.cesguiro.persistance.dao.jpa.PublisherDaoJpa;

@Configuration
@EntityScan(basePackages = "es.cesguiro.dao.jpa.entity")
public class PersistenceConfig {

    @Bean
    public PublisherDaoJpa publisherDaoJpa() {
        return new PublisherJpaDaoImpl();
    }

    @Bean
    public BookDaoJpa bookDaoJpa() {
        return new BookDaoJpaImpl();
    }

    @Bean
    public AuthorDaoJpa authorDaoJpa() {
        return new AuthorDaoJpaImpl();
    }


}
