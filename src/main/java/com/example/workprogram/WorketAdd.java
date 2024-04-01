package com.example.workprogram;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Spinner;
import javafx.stage.Stage;

import java.io.IOException;

public class WorketAdd extends Application {

	@Override
	public void start(Stage stage) throws IOException {




		FXMLLoader fxmlLoader = new FXMLLoader(WorketAdd.class.getResource(
				"addManagerView.fxml"
		));

		Scene scene = new Scene(fxmlLoader.load(), 1280, 720);



		stage.setTitle("당직인원추가");
		stage.setScene(scene);
		stage.show();
	}
	public static void main(String args[])
	{
		launch();
	}
}
