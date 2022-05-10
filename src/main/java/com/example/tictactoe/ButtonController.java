package com.example.tictactoe;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;

public class ButtonController {
    @FXML
    public  Button button0;
    public  Button button1;
    public  Button button2;
    public  Button button3;
    public  Button button4;
    public  Button button5;
    public  Button button6;
    public  Button button7;
    public  Button button8;

    public int getButtonId(Button button) {
        if (button == button0) { return 0; }
        if (button == button1) { return 1; }
        if (button == button2) { return 2; }
        if (button == button3) { return 3; }
        if (button == button4) { return 4; }
        if (button == button5) { return 5; }
        if (button == button6) { return 6; }
        if (button == button7) { return 7; }
        else { return 8; }
    }

    public static int[] gameFieldIndex = {0, 1, 2, 3, 4, 5, 6, 7, 8};

    public  void humanTurn(int index) {
        switch (index) {
            case (0):
                button0.setText("X");
                break;
            case (1):
                button1.setText("X");
                break;
            case (2):
                button2.setText("X");
                break;
            case (3):
                button3.setText("X");
                break;
            case (4):
                button4.setText("X");
                break;
            case (5):
                button5.setText("X");
                break;
            case (6):
                button6.setText("X");
                break;
            case (7):
                button7.setText("X");
                break;
            case (8):
                button8.setText("X");
                break;
        }
    }

    public void PC_Turn() {
        int index;
        boolean isFound = false;
        index = (int)(Math.random() * 8);
        while (!isFound) {
            if (index == 0 && isCellEmpty(button0)) {
                button0.setText("O");
                isFound = true;
                break;
            }
            if (index == 1 && isCellEmpty(button1)) {
                button1.setText("O");
                isFound = true;
                break;
            }
            if (index == 2 && isCellEmpty(button2)) {
                button2.setText("O");
                isFound = true;
                break;
            }
            if (index == 3 && isCellEmpty(button3)) {
                button3.setText("O");
                isFound = true;
                break;
            }
            if (index == 4 && isCellEmpty(button4)) {
                button4.setText("O");
                isFound = true;
                break;
            }
            if (index == 5 && isCellEmpty(button5)) {
                button5.setText("O");
                isFound = true;
                break;
            }
            if (index == 6 && isCellEmpty(button6)) {
                button6.setText("O");
                isFound = true;
                break;
            }
            if (index == 7 && isCellEmpty(button7)) {
                button7.setText("O");
                isFound = true;
                break;
            }
            if (index == 8 && isCellEmpty(button8)) {
                button8.setText("O");
                isFound = true;
                break;
            }
            else {
                index = (int) (Math.random() * 8);
            }
        }
    }

    public static boolean isCellEmpty(Button button) {
        return ".".equals(button.getText());
    }

    public  boolean isMapFull() {
        return !(isCellEmpty(button0) || isCellEmpty(button1) || isCellEmpty(button2) ||
                isCellEmpty(button3) || isCellEmpty(button4) || isCellEmpty(button5) ||
                isCellEmpty(button6) || isCellEmpty(button7) || isCellEmpty(button8));
    }

    public boolean checkWin(String ox) {
        if (ox.equals(button0.getText()) && ox.equals(button1.getText()) && ox.equals(button2.getText())) { return true; }
        if (ox.equals(button3.getText()) && ox.equals(button4.getText()) && ox.equals(button5.getText())) { return true; }
        if (ox.equals(button6.getText()) && ox.equals(button7.getText()) && ox.equals(button8.getText())) { return true; }


        if (ox.equals(button0.getText()) && ox.equals(button3.getText()) && ox.equals(button6.getText())) { return true; }
        if (ox.equals(button1.getText()) && ox.equals(button4.getText()) && ox.equals(button7.getText())) { return true; }
        if (ox.equals(button2.getText()) && ox.equals(button5.getText()) && ox.equals(button8.getText())) { return true; }


        if (ox.equals(button0.getText()) && ox.equals(button4.getText()) && ox.equals(button8.getText())) { return true; }
        if (ox.equals(button2.getText()) && ox.equals(button4.getText()) && ox.equals(button6.getText())) { return true; }
        return false;
    }

    public void gameEnd() {
        button0.setDisable(true);
        button1.setDisable(true);
        button2.setDisable(true);
        button3.setDisable(true);
        button4.setDisable(true);
        button5.setDisable(true);
        button6.setDisable(true);
        button7.setDisable(true);
        button8.setDisable(true);
    }

    public void handleButtonClicked(MouseEvent mouseEvent) {
        if (mouseEvent.getSource() == button0) {
            System.out.println("0");
            Button button_tmp = button0;
            int index = getButtonId(button0);
            mainGame(button_tmp, index);
        }
        if (mouseEvent.getSource() == button1) {
            System.out.println("1");
            Button button_tmp = button1;
            int index = getButtonId(button1);
            mainGame(button_tmp, index);
        }
        if (mouseEvent.getSource() == button2) {
            System.out.println("2");
            Button button_tmp = button2;
            int index = getButtonId(button2);
            mainGame(button_tmp, index);
        }
        if (mouseEvent.getSource() == button3) {
            System.out.println("3");
            Button button_tmp = button3;
            int index = getButtonId(button3);
            mainGame(button_tmp, index);
        }
        if (mouseEvent.getSource() == button4) {
            System.out.println("4");
            Button button_tmp = button4;
            int index = getButtonId(button4);
            mainGame(button_tmp, index);
        }
        if (mouseEvent.getSource() == button5) {
            System.out.println("5");
            Button button_tmp = button5;
            int index = getButtonId(button5);
            mainGame(button_tmp, index);
        }
        if (mouseEvent.getSource() == button6) {
            System.out.println("6");
            Button button_tmp = button6;
            int index = getButtonId(button6);
            mainGame(button_tmp, index);
        }
        if (mouseEvent.getSource() == button7) {
            System.out.println("7");
            Button button_tmp = button7;
            int index = getButtonId(button7);
            mainGame(button_tmp, index);
        }
        if (mouseEvent.getSource() == button8) {
            System.out.println("8");
            Button button_tmp = button8;
            int index = getButtonId(button8);
            mainGame(button_tmp, index);
        }
    }

    public void mainGame(Button starButton, int index) {
        humanTurn(index);
        if (checkWin("X")) {
            System.out.println("user win");
            gameEnd();
        }
        if (isMapFull()) {
            System.out.println("game over ");
            gameEnd();
        }
        PC_Turn();
        if (checkWin("O")) {
            System.out.println("pc win");
            gameEnd();
        }
        if (isMapFull()) {
            System.out.println("game over ");
            gameEnd();
        }
    }
}
