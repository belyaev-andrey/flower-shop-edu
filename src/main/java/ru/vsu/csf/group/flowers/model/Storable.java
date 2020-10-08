package ru.vsu.csf.group.flowers.model;

/**
 * Should be implemented by a class that wants to persist its instances.
 */
public interface Storable {

    Long getId();

    void setId(Long id);

}
