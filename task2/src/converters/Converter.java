package task2.converters;

public abstract class Converter {

    protected String convertedNumber;

    public abstract void convert(String input);

    protected void displayNumber() {
        System.out.println("Converted value is: " + convertedNumber);
    }
}
