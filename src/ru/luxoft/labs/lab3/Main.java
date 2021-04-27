package ru.luxoft.labs.lab3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userInput = "";
        int firstNumber;
        int secondNumber;
        while (!"q".equals(userInput)) {
            try {
                System.out.println("Enter two numbers");
                try {
                    firstNumber = scanner.nextInt();
                } catch (InputMismatchException ex) {
                    System.out.println("Wrong input data!");
                    break;
                }
                try {
                    secondNumber = scanner.nextInt();
                } catch (InputMismatchException ex) {
                    System.out.println("Wrong input data!");
                    break;
                }
                System.out.println("Enter sign: + or - or / or * or ! or enter q to quit.");
                userInput = scanner.next();
                double result;
                switch (userInput) {
                    case "+":
                        result = plus(firstNumber, secondNumber);
                        break;
                    case "-":
                        result = minus(firstNumber, secondNumber);
                        break;
                    case "*":
                        result = ymn(firstNumber, secondNumber);
                        break;
                    case "/":
                        if (secondNumber == 0) {
                            continue;
                        }
                        result = del(firstNumber, secondNumber);
                        break;
                    case "!":
                        result = fact(firstNumber);
                        break;
                    default:
                        result = 0;
                        break;
                }
                if (userInput.equals("q")) {
                    System.out.println("Quitting the program!");
                } else {
                    System.out.println(result);
                }
            } catch (InputMismatchException ex) {
                System.out.println("Wrong input data!");
                break;
            }
        }
    }

    private static int plus(int numberOne, int numberTwo) {
        return numberOne + numberTwo;
    }

    private static int minus(int numberOne, int numberTwo) {
        return numberOne - numberTwo;
    }

    private static int ymn(int numberOne, int numberTwo) {
        return numberOne * numberTwo;
    }

    private static int del(int numberOne, int numberTwo) {
        return numberOne / numberTwo;
    }

    private static int fact(int numberOne) {
        int res = 1;
        for (int i = 1; i <= numberOne; i++) {
            res *= i;
        }
        return res;
    }
}
