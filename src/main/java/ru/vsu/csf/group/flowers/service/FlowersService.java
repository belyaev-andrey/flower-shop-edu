package ru.vsu.csf.group.flowers.service;

import ru.vsu.csf.group.flowers.exceptions.FlowersServiceException;
import ru.vsu.csf.group.flowers.exceptions.StoreException;
import ru.vsu.csf.group.flowers.model.Flower;
import ru.vsu.csf.group.flowers.persistence.DataStorage;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class FlowersService {

    private final DataStorage storage = new DataStorage();

    /**
     *
     * @return list of all flowers found in the database
     * @throws FlowersServiceException in case of database error
     */
    public List<Flower> findAllFlowers() {
        try {
            return storage.getAllFlowers();
        } catch (StoreException e) {
            throw new FlowersServiceException("Something wrong with Flowers Service", e);
        }
    }

    public List<Flower> findFlowersByName(String name) {
        try {
            return storage.getAllFlowers().stream().filter(f -> f.getName().equals(name)).collect(Collectors.toList());
        } catch (StoreException e) {
            throw new FlowersServiceException("Something wrong with Flowers Service", e);
        }
    }

}
