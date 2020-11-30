package ru.vsu.csf.group.flowers.persistence;


import org.junit.jupiter.api.Test;
import ru.vsu.csf.group.flowers.exceptions.StoreSaveException;
import ru.vsu.csf.group.flowers.exceptions.StoreSearchException;
import ru.vsu.csf.group.flowers.model.Flower;
import ru.vsu.csf.group.flowers.model.FreshFlower;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public class DatabaseTest {

    @Test
    public void testFlowerSave() throws StoreSaveException {
        FreshFlower flower = new FreshFlower();
        flower.setId(new Date().getTime());
        flower.setName("Ромашка");
        flower.setPrice(BigDecimal.TEN);
        flower.setOriginCountry("Россия");

        DataStorage storage = new DataStorage();
        storage.saveFlower(flower);
    }

    @Test
    public void testFlowerFetch() throws StoreSearchException {
        DataStorage storage = new DataStorage();
        final List<Flower> flowers = storage.getAllFlowers();
    }

}
