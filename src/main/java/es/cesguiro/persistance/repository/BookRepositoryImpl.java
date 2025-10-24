package es.cesguiro.persistance.repository;

import java.util.Optional;

import es.cesguiro.domain.model.Page;
import es.cesguiro.domain.repository.BookRepository;
import es.cesguiro.domain.repository.entity.BookEntity;

public class BookRepositoryImpl implements BookRepository {

    @Override
    public void deleteByIsbn(String isbn) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteByIsbn'");
    }

    @Override
    public Page<BookEntity> findAll(int page, int size) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findAll'");
    }

    @Override
    public Optional<BookEntity> findById(Long id) {
        throw new UnsupportedOperationException("Unimplemented method 'findById'");
    }

    @Override
    public Optional<BookEntity> findByIsbn(String isbn) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findByIsbn'");
    }

    @Override
    public BookEntity save(BookEntity bookEntity) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'save'");
    }


}
