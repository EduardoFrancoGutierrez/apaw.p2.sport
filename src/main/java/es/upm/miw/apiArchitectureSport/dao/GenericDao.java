package es.upm.miw.apiArchitectureSport.dao;

import java.util.List;

public interface GenericDao<T, ID> {

    void create(T entity);

    T read(ID id);

    void update(T entity);

    void deleteById(ID id);

    List<T> findAll();
    
    Integer size();

}
