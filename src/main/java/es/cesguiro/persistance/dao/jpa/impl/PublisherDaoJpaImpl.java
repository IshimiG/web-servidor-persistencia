package es.cesguiro.persistance.dao.jpa.impl;

import java.util.List;
import java.util.Optional;

import es.cesguiro.persistance.dao.jpa.PublisherDaoJpa;
import es.cesguiro.persistance.dao.jpa.entity.PublisherJpaEntity;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

public class PublisherDaoJpaImpl implements PublisherDaoJpa {
    @PersistenceContext EntityManager entityManager;

    @Override
    public Optional<PublisherJpaEntity> findBySlug(String slug) {
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
    public List findAll(int page, int size) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Object findById(Long id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Object insert(Object entity) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Object update(Object entity) {
        // TODO Auto-generated method stub
        return null;
    }
    

}
