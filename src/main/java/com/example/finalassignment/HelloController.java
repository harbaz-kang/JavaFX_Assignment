package com.example.finalassignment;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    private TextField lengthField;

    @FXML
    private TextField widthField;

    @FXML
    private Label resultLabel;

    private final Model obj1 = new Model();

    @FXML
    protected void calculatePerimeter() {
        try {
            double length = Double.parseDouble(lengthField.getText());
            double width = Double.parseDouble(widthField.getText());
            double perimeter = obj1.calculatePerimeter(length, width);
            resultLabel.setText("Where length: " + length + " and width: " + width + " \nPerimeter of rectangle = " + perimeter);
        } catch (NumberFormatException e) {
            resultLabel.setText("Invalid input. Please enter a valid number.");
        }
    }
}