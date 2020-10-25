package task2;

import task2.converters.BinToDecimalConverter;
import task2.converters.Converter;
import task2.converters.DecimalToBinConverter;
import java.util.Scanner;

public class Calculator {
    private boolean isWorking = true;
    private Scanner sc=new Scanner(System.in);
    private DecimalToBinConverter decimalToBinConverter = new DecimalToBinConverter();
    private BinToDecimalConverter binToDecimalConverter = new BinToDecimalConverter();

    public void start(){

        while (isWorking){
            displayMenu();
            String input = sc.nextLine();
            int choice;
            try{
                choice = Integer.parseInt(input);
                switch (choice){
                    case 1:
                        System.out.println("Write decimal number");
                        input = sc.nextLine();
                        decimalToBinConverter.convert(input);
                        break;
                    case 2:
                        System.out.println("Write binary number");
                        input = sc.nextLine();
                        binToDecimalConverter.convert(input);
                        break;
                    case 3:
                        isWorking = false;
                        System.out.println("Exit");
                        break;
                    default:
                        System.out.println("Option not found. Choose again");
                        break;
                }

            }
            catch (NumberFormatException e){
                System.err.println("NumberFormatException occurred: For input : "+ input);
            }
        }
    }

    private void displayMenu() {
        System.out.println("\nType number of conversion option");
        System.out.println("1. Convert decimal number to binary");
        System.out.println("2. Convert binary number to decimal");
        System.out.println("3. Exit");
    }

    public static void main(String[] args) {
        Calculator numberSystemConverter= new Calculator();
        numberSystemConverter.start();
    }
}
