package ru.vsu.csf.group.flowers.persistence;


import org.junit.jupiter.api.Test;
import ru.vsu.csf.group.flowers.model.Flower;
import ru.vsu.csf.group.flowers.model.FreshFlower;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public class DatabaseTest {

    @Test
    public void testFlowerSave() {
        FreshFlower flower = new FreshFlower();
        flower.setId(new Date().getTime());
        flower.setName("Ромашка");
        flower.setPrice(BigDecimal.TEN);
        flower.setOriginCountry("Россия");

        DataStorage storage = new DataStorage();
        storage.saveFlower(flower);
    }

    @Test
    public void testFlowerFetch() {
        DataStorage storage = new DataStorage();
        final List<Flower> flowers = storage.getAllFlowers();
    }

}
