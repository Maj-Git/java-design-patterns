package com.maj.creational.builder.builders;

/**
 * Interface pour une classe capable de construire des objets de type T.
 * @param <T> Le type de l'objet construit
 */
public interface Builder<T> {
    void setSeats(int number);
    void setEngine(String engine);
    void reset();
    T getResult();
}
