package es.cesguiro.persistance.dao.jpa;

import java.util.Optional;

import es.cesguiro.persistance.dao.jpa.entity.BookJpaEntity;

public interface BookDaoJpa extends GenericDaoJpa {
    Optional<BookJpaEntity> findByIsbn(String isbn);
    void deleteByIsbn(String isbn);

}
