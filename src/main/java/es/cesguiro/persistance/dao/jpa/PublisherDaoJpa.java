package es.cesguiro.persistance.dao.jpa;

import java.util.Optional;

import es.cesguiro.persistance.dao.jpa.entity.PublisherJpaEntity;

public interface PublisherDaoJpa extends GenericDaoJpa {
    Optional<PublisherJpaEntity> findBySlug(String slug);
}
