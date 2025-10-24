package es.cesguiro.persistance.dao.jpa;

import java.util.List;

public interface GenericDaoJpa<T> {
    List<T> findAll(int page, int size);
    T findById(Long id);
    T insert(T entity);
    T update(T entity);
    void deleteById(Long id);
    long count();
}
