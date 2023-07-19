package org.padilha.input;

import java.util.Scanner;

public class UserInputTemperature {
    private Scanner scanner;

    public UserInputTemperature(){
        this.scanner = new Scanner(System.in);
    }
    public float getTemperatureInput() {
        System.out.println("Input your temperature: ");
        return scanner.nextFloat();
    }
}