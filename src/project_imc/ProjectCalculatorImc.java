package project_imc;

import javafx.application.Application;
import javafx.geometry.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.*;


public class ProjectCalculatorImc extends Application {
    @Override
    public void start(Stage stage) throws Exception {

        //Etique para os campos de entrada
        Label labelWeight = new Label("Weight");
        Label labelHeigth = new Label("Heigth");

        //Campos de textos para entreda de dados
        TextField fieldWeigth = new TextField();
        fieldWeigth.setPromptText("Weigth in kg");

        TextField fieldHeight = new TextField();
        fieldHeight.setPromptText("Height in meters");

        //Label para mostrar o resultado do IMC
        Label labelResult = new Label();

        //Botão para calcular o IMC
        Button buttonCalculate = new Button("Calculate IMC");
        buttonCalculate.setOnAction(e -> {

            //String sendo transformada em double
            double weight = Double.parseDouble(fieldWeigth.getText());
            double height = Double.parseDouble(fieldHeight.getText());

            double imc = weight / (height * height);
            labelResult.setText(String.format("Your IMS is: %.2f", imc));
        });

        //Layout vertical
        VBox layout = new VBox(10,labelWeight, fieldWeigth, labelHeigth, fieldHeight, buttonCalculate, labelResult);
        layout.setPadding(new Insets(10));
        layout.setAlignment(Pos.CENTER);

        //Cena e palco
        Scene scene = new Scene(layout, 300,250);
        stage.setTitle("Calculator or IMC");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
