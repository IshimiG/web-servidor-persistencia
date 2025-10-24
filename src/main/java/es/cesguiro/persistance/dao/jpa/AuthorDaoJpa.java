package es.cesguiro.persistance.dao.jpa;

import java.util.Optional;

import es.cesguiro.persistance.dao.jpa.entity.AuthorJpaEntity;

public interface AuthorDaoJpa extends GenericDaoJpa {
    Optional<AuthorJpaEntity> findBySlug(String slug);
}
