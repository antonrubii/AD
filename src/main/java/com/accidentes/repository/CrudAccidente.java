package com.accidentes.repository;

import java.util.List;

public interface CrudAccidente<T,ID> {

    List<T> getAll();
    T getById(ID id);
    T save(T t);
    T update(T t);
    T delete(T t);
}
