package by.bsuir.Puchynski.builder;

import by.bsuir.Puchynski.exception.RepositoryException;

import java.sql.ResultSet;

public interface Builder<T> {
    T build(ResultSet resultSet) throws RepositoryException;
}
