package ru.vsu.csf.group.flowers.persistence;

import ru.vsu.csf.group.flowers.exceptions.StoreException;
import ru.vsu.csf.group.flowers.exceptions.StoreSaveException;
import ru.vsu.csf.group.flowers.exceptions.StoreSearchException;
import ru.vsu.csf.group.flowers.model.Flower;
import ru.vsu.csf.group.flowers.model.FreshFlower;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DataStorage {

    public Flower saveFlower(Flower flower) throws StoreSaveException {
        try {
            return saveToDb(flower);
        } catch (SQLException exception) {
            throw new StoreSaveException("Cannot save flower", exception);
        }
    }

    private Connection getConnection() throws SQLException {
        return DriverManager.getConnection("jdbc:h2:tcp://localhost:1521/flowersdb", "sa", "");
    }

    private Flower saveToDb(Flower flower) throws SQLException {
        try (Connection c = getConnection()) {
            PreparedStatement statement = c.prepareStatement("insert into flower (id, name, price, origin) values (?, ?, ?, ?)");
            statement.setLong(1, flower.getId());
            statement.setString(2, flower.getName());
            statement.setBigDecimal(3, flower.getPrice());
            statement.setString(4, flower.getOriginCountry());
            statement.executeUpdate();
        }
        return flower;
    }

    public List<Flower> getAllFlowers() throws StoreSearchException {
        List<Flower> result = new ArrayList<>();
        try (Connection connection = getConnection();) {
            PreparedStatement statement = connection.prepareStatement("select id, name, price, origin from flower");
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                Flower f = new FreshFlower();
                f.setId(rs.getLong(1));
                f.setName(rs.getString(2));
                f.setPrice(rs.getBigDecimal(3));
                f.setOriginCountry(rs.getString(4));
                result.add(f);
            }
            return result;
        } catch (SQLException exception) {
            throw new StoreSearchException("Cannot load flowers", exception);
        }
    }

}
