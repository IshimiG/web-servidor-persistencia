package es.cesguiro.persistance.dao.jpa.impl;

import java.util.List;
import java.util.Optional;

import es.cesguiro.persistance.dao.jpa.BookDaoJpa;
import es.cesguiro.persistance.dao.jpa.entity.BookJpaEntity;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

public class BookDaoJpaImpl implements BookDaoJpa {
    @PersistenceContext EntityManager entityManager;

    @Override
    public void deleteByIsbn(String isbn) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public Optional<BookJpaEntity> findByIsbn(String isbn) {
        // TODO Auto-generated method stub
        return Optional.empty();
    }

    @Override
    public long count() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public void deleteById(Long id) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public List<BookDaoJpa> findAll(int page, int size) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public BookDaoJpa findById(Long id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public BookDaoJpa insert(BookDaoJpa entity) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public BookDaoJpa update(BookDaoJpa entity) {
        // TODO Auto-generated method stub
        return null;
    }

    

}
