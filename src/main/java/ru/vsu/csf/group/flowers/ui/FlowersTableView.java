package ru.vsu.csf.group.flowers.ui;

import javafx.collections.FXCollections;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import ru.vsu.csf.group.flowers.model.Flower;

import java.math.BigDecimal;
import java.util.List;

public class FlowersTableView extends TableView<Flower> {

    public FlowersTableView(List<Flower> flowers) {
        setItems(FXCollections.observableList(flowers));
        TableColumn<Flower, String> nameColumn = createFlowerStringTableColumn();
        TableColumn<Flower, BigDecimal> priceColumn = createFlowerBigDecimalTableColumn();

        getColumns().addAll(nameColumn, priceColumn);
    }

    private TableColumn<Flower, BigDecimal> createFlowerBigDecimalTableColumn() {
        TableColumn<Flower, BigDecimal> priceColumn = new TableColumn<>("Price");
        priceColumn.setCellValueFactory(new PropertyValueFactory<>("price"));
        return priceColumn;
    }

    private TableColumn<Flower, String> createFlowerStringTableColumn() {
        TableColumn<Flower, String> nameColumn = new TableColumn<>("Name");
        nameColumn.setMinWidth(400);
        nameColumn.setCellValueFactory(new PropertyValueFactory<>("name"));
        return nameColumn;
    }

}
