package com.example.calculator;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;


import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class HelloController{
    //wir können auf das Textfeld aus der FXML Datei zugreifen
    //wir müssen die Variable mit @FXML annotieren
    //und in der FXML Datei muss die Variable mit fx:id="txt_result" deklariert werden
    //kann im SceneBuilder gemacht werden
    @FXML
    private TextField txt_result;


    long number1;
    long number2;
    String operator = "";


    public void Number(ActionEvent event) {

        //wir holen uns den Text des Buttons
        String buttonNumber = ((Button) event.getSource()).getText();
        // wir speichern den Text des Buttons in das Textfeld
        txt_result.setText(txt_result.getText() + buttonNumber );
    }

    public void Operator(ActionEvent event) {

        //wir holen uns die Operation aus dem Button
        String buttonOperation = ((Button) event.getSource()).getText();
        //wenn der Button nicht "=" ist
        if (!buttonOperation.equals("=")) {
            //wenn der Operator nicht leer ist
            if (!operator.isEmpty()) {
                return;
            }
            //wir speichern die Operation in den Operator
            operator = buttonOperation;
            //wir speichern den Wert aus dem Textfeld in die Variable number1
            number1 = Long.parseLong(txt_result.getText());
            //wir leeren das Textfeld
            txt_result.setText("");
        } else {
            //wenn der Operator gleich "=" ist

            //wenn der Operator leer ist
            if (operator.isEmpty()) {
                return;
            }
            //wir speichern den Wert aus dem Textfeld in die Variable number2
            number2 = Long.parseLong(txt_result.getText());
            //wir speichern das Ergebnis in das Textfeld mit der Methode calculate
            txt_result.setText(String.valueOf(calculate(number1, number2, operator)));
            //wir leeren die Felder
            operator = "";
            number1 = 0;
            number2 = 0;
        }
    }

    public String calculate(long number1, long number2, String operator) {
        long result = 0;
        switch (operator) {
            case "+":
                result = number1 + number2;
                break;
            case "-":
                result = number1 - number2;
                break;
            case "*":
                result = number1 * number2;
                break;
            case "/":
                result = number1 / number2;
                break;
        }
        return String.valueOf(result);
    }




}