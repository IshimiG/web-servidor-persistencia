package es.cesguiro.persistance.repository;

import java.util.Optional;

import es.cesguiro.domain.repository.AuthorRepository;
import es.cesguiro.domain.repository.entity.AuthorEntity;
import es.cesguiro.persistance.dao.jpa.AuthorDaoJpa;
import es.cesguiro.persistance.repository.mapper.AuthorMapper;

public class AuthorRepositoryImpl implements AuthorRepository {
    private final AuthorDaoJpa authorDaoJpa;

    public AuthorRepositoryImpl(AuthorDaoJpa authorDaoJpa) {
        this.authorDaoJpa = authorDaoJpa;
    }

    @Override
    public Optional<AuthorEntity> findById(Long id) {
        return authorDaoJpa.findById(id).map(AuthorMapper.INSTANCE::fromAuthorJpaEntityToAuthorEntity);
    }

    @Override
    public AuthorEntity save(AuthorEntity authorEntity) {
        return AuthorMapper.INSTANCE.fromAuthorJpaEntityToAuthorEntity(
                authorDaoJpa.insert(AuthorMapper.INSTANCE.fromAuthorEntityToAuthorJpaEntity(authorEntity))
        );
    }


}
