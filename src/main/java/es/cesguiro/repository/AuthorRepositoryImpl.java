package es.cesguiro.repository;

import java.util.Optional;

import es.cesguiro.domain.repository.AuthorRepository;
import es.cesguiro.domain.repository.entity.AuthorEntity;

public class AuthorRepositoryImpl implements AuthorRepository {

    @Override
    public Optional<AuthorEntity> findById(Long id) {
        throw new UnsupportedOperationException("Unimplemented method 'findById'");
    }

    @Override
    public AuthorEntity save(AuthorEntity authorEntity) {
        throw new UnsupportedOperationException("Unimplemented method 'save'");
    }


}
