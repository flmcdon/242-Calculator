package com.example.calculator;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class Controller {
    //Establish textField
    @FXML
    private TextField textField;

    //save num variable
    @FXML
    private Text savedNumbers;

    //create a variable for a first num
    private String firstNum = "";

    //create a variable to keep track of the current num
    private String currentNum = "";

    //Create a string to keep track of the calculation type
    private String calculationType;

    //Set up a plus action
    @FXML
    void addAction(ActionEvent event) {
        calculationSetup("+");
    }

    //Set up minus action
    @FXML
    void minusAction(ActionEvent event) {
        calculationSetup("-");
    }

    //set up division action
    @FXML
    void divideAction(ActionEvent event) {
        calculationSetup("/");
    }

    //set up multiply action
    @FXML
    void multiplicationAction(ActionEvent event) {
        calculationSetup("*");
    }

    //Set up the calculator's calculations
    public void calculationSetup(String calculationType){
        this.calculationType = calculationType;     //get what type of calculation to create + - / *
        firstNum = currentNum;                      //set the first num inputted as the current num
        currentNum = "";                            //move along and make the next space blank
        savedNumbers.setText(firstNum + " " + calculationType); //save the number for calculation as first num and whatever is next, and use the calculation type
    }

    //This switch statement calculates everything that happens when "calculating"
    @FXML
    void calculate(ActionEvent event) {
        int firstNumInt = Integer.parseInt(firstNum);  //This takes the first int
        int secondNumInt = Integer.parseInt(currentNum);//This takes current num

        //Switch statement that does something depending on which calculation is inputted
        switch (calculationType) {
            //plus case
            case "+" -> {
                int sum = firstNumInt + secondNumInt; //Gets the sum
                savedNumbers.setText(firstNum + " + " + currentNum + " = " + sum); //Presents the "equation" in the display box
                textField.setText(String.valueOf(sum));//changes the value of the textField to that of sum
                currentNum ="";
                firstNum = "";
            }
            //minus case
            case "-" -> {
                int difference = firstNumInt - secondNumInt;//Gets the difference
                savedNumbers.setText(firstNum + " - " + currentNum + " = " + difference); // Presents the "equation" in the display box
                textField.setText(String.valueOf(difference)); //changes the value of the textField to that of the difference
                currentNum ="";
                firstNum = "";
            }
            //division case
            case "/" -> {
                double quotient = firstNumInt / (double)secondNumInt; // Gets the quotient
                savedNumbers.setText(firstNum + " / " + currentNum + " = " + quotient); //Presents the "equation" in the display box
                textField.setText(String.valueOf(quotient)); //changes the value of the textField to that of the quotient
                currentNum ="";
                firstNum = "";
            }
            //multiplication case
            case "*" -> {
                int calculatedNumber = firstNumInt * secondNumInt;//Gets the Product
                savedNumbers.setText(firstNum + " * " + currentNum + " = " + calculatedNumber);//Presents the "equation" in the display box
                textField.setText(String.valueOf(calculatedNumber)); // sets the value of the textField of the product
                currentNum ="";
                firstNum = "";
            }
        }
    }
    //updates the text field
    public void updateTextField(){
        textField.setText(currentNum);
    }

    //adds number to textField
    public void addNumber(String number){
        currentNum += number; //current num is added to current num, so 8 with input 5 = "85"
        updateTextField(); //update the text field with the new inputs
    }
    //Click 0
    @FXML
    void button0Clicked(ActionEvent event) {
        if(!currentNum.equals("")){ //if blank. set number to 0
            addNumber("0");
        }
    }

    @FXML
    void button1Clicked(ActionEvent event) {
        addNumber("1");
    } //add 1

    @FXML
    void button2Clicked(ActionEvent event) {
        addNumber("2");
    }// add 2

    @FXML
    void button3Clicked(ActionEvent event) {
        addNumber("3");
    }// add 3

    @FXML
    void button4Clicked(ActionEvent event) {
        addNumber("4");
    }// add 4

    @FXML
    void button5Clicked(ActionEvent event) {
        addNumber("5");
    }// add 5

    @FXML
    void button6Clicked(ActionEvent event) {
        addNumber("6");
    }// add 6

    @FXML
    void button7Clicked(ActionEvent event) {
        addNumber("7");
    }// add 7

    @FXML
    void button8Clicked(ActionEvent event) {
        addNumber("8");
    }// add 8

    @FXML
    void button9Clicked(ActionEvent event) {
        addNumber("9");
    }// add 9


}