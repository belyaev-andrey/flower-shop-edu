package ru.vsu.csf.group.flowers.ui;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import ru.vsu.csf.group.flowers.model.Flower;
import ru.vsu.csf.group.flowers.service.FlowersService;

import java.util.List;

public class AppScreen extends Application {

    private FlowersService service;

    private FlowersTableView flowersTableView;

    @Override
    public void start(Stage stage) throws Exception {

        service = new FlowersService();

        final List<Flower> allFlowers = service.findAllFlowers();

        flowersTableView = new FlowersTableView(allFlowers);

        Scene scene = new Scene(flowersTableView, 640, 480);
        stage.setScene(scene);
        stage.show();
    }

    public void launchApp() {
        launch();
    }
}
