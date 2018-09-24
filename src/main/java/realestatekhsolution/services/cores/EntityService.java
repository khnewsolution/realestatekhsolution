package realestatekhsolution.services.cores;

import java.util.List;

/*
Create By: Ron Rith
Create Date: 3/15/2018
*/
public interface EntityService<E> {
    List<E> getAll();

    void save(E e);

    List<E> getAllTShort();

    E getById(Long id);

    void delete(Long id);

    void update(E e, Long id);
}
