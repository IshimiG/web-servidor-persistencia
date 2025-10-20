package es.cesguiro.repository;

import java.util.Optional;

import es.cesguiro.dao.jpa.PublisherDaoJpa;
import es.cesguiro.domain.repository.PublisherRepository;
import es.cesguiro.domain.repository.entity.PublisherEntity;

public class PublisherRepositoryImpl implements PublisherRepository {

    private final PublisherDaoJpa publisherDao;

    public PublisherRepositoryImpl(PublisherDaoJpa publisherDaoJpa) {
        this.publisherDao = publisherDaoJpa;
    }


    @Override
    public Optional<PublisherEntity> findById(Long id) {
        return publisherDao.findById(id).map();
    }

    @Override
    public Optional<PublisherEntity> findBySlug(String slug) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findBySlug'");
    }

    @Override
    public PublisherEntity save(PublisherEntity publisherEntity) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'save'");
    }


}
