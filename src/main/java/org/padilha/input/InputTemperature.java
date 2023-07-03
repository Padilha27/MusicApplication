package org.padilha.input;

import java.util.Scanner;

public class InputTemperature {
    private Scanner scanner;

    public InputTemperature(){
        this.scanner = new Scanner(System.in);
    }
    public float getTemperatureInput() {
        System.out.println("Digite sua temperatura: ");
        return scanner.nextFloat();
    }
}
