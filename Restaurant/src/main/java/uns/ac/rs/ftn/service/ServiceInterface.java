package uns.ac.rs.ftn.service;

import java.util.List;

public interface ServiceInterface<T> {

    List<T> findAll();

    T findOne(Long id);

    T create(T entity) throws Exception;

    T update(T entity, Long id) throws Exception;

    void delete(Long id) throws Exception;
}